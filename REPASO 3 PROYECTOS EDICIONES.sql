/*ejercicio a)

Crea un campo en la tabla Empregados para almacenar el número de proyectos de un empleado. Como hay filas existentes que tome el valor nulo.

Crea un procedimiento llamado pr_ActulizarNumproy que se le pase el nss de un empleado y actualice el número de proyectos de dicho empleado. Debe devolver en un parámetro de salida el número de proyectos.  Se controlará los posibles errores, devolviendo -1 si no existe el empleado y 0 si existe.
Crea un procedimiento llamado pr_ActualizarTodosNumproy  para actualizar el número de proyectos de todos los empleados de la empresa. Se deberá utilizar el anterior procedimiento. Se visualizará para cada empleado el nombre completo, dni y el número de proyectos que se actualizan.*/

ALTER TABLE EMPREGADO 
	ADD nProyectos int null
go

IF OBJECT_ID('pr_ActulizarNumproy') IS NOT NULL 
	BEGIN
		DROP PROC pr_ActulizarNumproy
	END
GO

CREATE PROC pr_ActulizarNumproy
@NSS VARCHAR(15),
@NPROY INT OUTPUT
AS
BEGIN
	IF NOT EXISTS(SELECT 1 FROM EMPREGADO WHERE NSS = @NSS)
	BEGIN
		RETURN -1
	END
	
	SELECT @NPROY = (SELECT COUNT(*) FROM EMPREGADO_PROXECTO WHERE NSSEmpregado = @NSS)
	
	UPDATE EMPREGADO
	SET nProyectos = @NPROY
	WHERE NSS = @NSS
	RETURN 0
END

GO

IF OBJECT_ID('pr_ActualizarTodosNumproy') IS NOT NULL
	BEGIN
		DROP PROC pr_ActualizarTodosNumproy
	END
GO

CREATE PROC pr_ActualizarTodosNumproy
AS 
BEGIN 
	DECLARE @NPROYECTOS INT
	DECLARE @NSS VARCHAR(15)
	
	DECLARE c_AccProy CURSOR FOR
	SELECT NSS, nProyectos FROM EMPREGADO;
	
	OPEN c_AccProy
	FETCH NEXT FROM c_AccProy
	INTO @NSS, @NPROYECTOS
	
	WHILE @@FETCH_STATUS <> -1
	BEGIN
	
	EXEC pr_ActulizarNumproy @NSS, @NPROYECTOS OUTPUT
	
	PRINT 'DNI ' + @NSS + ' NPROYECTOS ' + CAST (@NPROYECTOS AS VARCHAR(50))
	FETCH NEXT FROM c_AccProy
	INTO @NSS, @NPROYECTOS
	END
	CLOSE c_AccProy
	DEALLOCATE c_AccProy
END

GO

EXEC pr_ActualizarTodosNumproy

/*
b)

Crea un procedimiento llamado pr_CrearEdicion, que se le pasa el nombre del curso, lugar, fecha, profesor y cree una nueva edición del curso. En un valor de retorno se informará del existo o no (-1 si no existe en curso, -2  no existe el profesor y 0 se ha creado correctamente). Si no se le pasa la fecha por defecto será dentro de un mes y si no se le pasa el lugar por defecto será Vigo
*/

IF OBJECT_ID('pr_CrearEdicion') IS NOT NULL
	BEGIN
		DROP PROC pr_CrearEdicion
	END
GO

CREATE PROC pr_CrearEdicion
@NOMCURSO VARCHAR(MAX),
@LUGAR VARCHAR(MAX) = 'VIGO',
@FECHA DATE = NULL,
@PROFESOR VARCHAR(MAX)
AS
BEGIN
	IF NOT EXISTS (SELECT 1 FROM CURSO WHERE CURSO.Nome = @NOMCURSO)
		BEGIN
			RETURN -1
		END
	IF NOT EXISTS (SELECT 1 FROM EMPREGADO WHERE NSS = @PROFESOR)
		BEGIN
			RETURN -2
		END
		
	IF @FECHA IS NULL
		BEGIN
			SET @FECHA = DATEADD(MM,1,GETDATE())
		END
	DECLARE @NUMEDICION INT
	SET @NUMEDICION = ISNULL((SELECT MAX(Numero) FROM EDICION 
	WHERE Codigo = (SELECT CODIGO FROM CURSO WHERE Nome = @NOMCURSO)),0) + 1 
	
	INSERT INTO EDICION(Codigo, Numero, Data, Lugar, Profesor)
	VALUES ((SELECT Codigo FROM CURSO WHERE Nome = @NOMCURSO),@NUMEDICION,@FECHA,@LUGAR,@PROFESOR)
	RETURN 0
END
GO

/*Se quiere crear un procedimiento llamado pr_CrearModificarCurso, que permita dar de alta un curso o modificar uno existente junto a una nueva edicion. Hay que tener en cuenta:
Los parámetros que se le pasa son el nombre del curso, horas, lugar, fecha, profesor, nombreDepartamento.
Si existe el curso se actualizan el número de horas y sino se crea el curso siguiendo siguiendo la numeracion en el código.
Se crea una nueva edición, utilizando el procedimiento anterior.
Y los alumnos será los empleados del departamento introducido.
Hay que controlar los posibles errores con un parámetro de retorno.
Utiliza transacciones explicitas si es el caso.
Se visualizar un listado con el siguiente formato
En el listado, para obtener el nombre completo del empleado que recibe el curso se hará con una función y también para obtener edad y el número total de  alumnos del curso*/

IF OBJECT_ID('fn_nombreCompleto') IS NOT NULL
	BEGIN
		DROP FUNCTION fn_nombreCompleto
	END
GO

CREATE FUNCTION fn_nombreCompleto(@NSS VARCHAR(50))
RETURNS VARCHAR(100)
AS
BEGIN
	DECLARE @NOMBRECOMPLETO VARCHAR(100)
	
	SELECT @NOMBRECOMPLETO = Nome + ISNULL(Apelido1,'') + ISNULL(Apelido2,'') 
	FROM EMPREGADO WHERE NSS = @NSS
	
	RETURN @NOMBRECOMPLETO
END
GO

IF OBJECT_ID('fn_edad') IS NOT NULL
	BEGIN
		DROP FUNCTION fn_edad
	END
GO

CREATE FUNCTION fn_edad(@NSS VARCHAR(50))
RETURNS INT
AS
BEGIN
	DECLARE @EDAD INT
	
	SELECT @EDAD = DATEDIFF(DD,(SELECT DataNacemento FROM EMPREGADO WHERE NSS = @NSS),GETDATE()) / 365.25
	
	RETURN @EDAD
END
GO

IF OBJECT_ID('fn_totAlumnos') IS NOT NULL
	BEGIN
		DROP FUNCTION fn_totAlumnos
	END
GO

CREATE FUNCTION fn_totAlumnos(@NOMDEPT VARCHAR(100),@NSSPROF VARCHAR(50))
RETURNS INT
AS
BEGIN
	DECLARE @TOTALUMNOS INT
	
	SELECT @TOTALUMNOS = COUNT(*) FROM EMPREGADO E
						 INNER JOIN DEPARTAMENTO D
						 ON E.NumDepartamentoPertenece = D.NumDepartamento
						 WHERE NomeDepartamento = @NOMDEPT AND E.NSS <> @NSSPROF
	
	RETURN @TOTALUMNOS
END
GO

IF OBJECT_ID('pr_CrearModificarCurso') IS NOT NULL
	BEGIN 
		DROP PROC pr_CrearModificarCurso
	END
GO

CREATE PROC pr_CrearModificarCurso
@NOMBRE VARCHAR(100),
@HORAS INT,
@LUGAR VARCHAR(100) = 'VIGO',
@FECHA DATE,
@PROFESOR VARCHAR(100),
@NOMDEP VARCHAR(100)
AS
BEGIN
	IF NOT EXISTS (SELECT 1 FROM DEPARTAMENTO WHERE NomeDepartamento = @NOMDEP)
		BEGIN
			PRINT 'NO EXISTE EL DEP'
		END
		RETURN -1
	
	DECLARE @RETORNO INT
	EXEC @RETORNO = pr_CrearEdicion @NOMBRE,@LUGAR,@FECHA,@PROFESOR
	
	IF @RETORNO = -2
	BEGIN 
		PRINT 'NO HAY PROFESOR'
		RETURN -2
	END
	
	BEGIN TRAN
	BEGIN TRY
	
	IF @RETORNO = -1
	BEGIN 
		INSERT INTO CURSO (Horas, Nome)
		VALUES (@HORAS, @NOMBRE)
	END
	ELSE 
	BEGIN
		UPDATE CURSO
		SET Horas =  @HORAS
		WHERE Nome = @NOMBRE
	END
	

	COMMIT TRAN
	END TRY
	
	BEGIN CATCH 
	
		ROLLBACK
	END CATCH
	
END

SELECT * FROM CURSO