-- A�adir un campo fecha de direcci�n a la tabla departamento para guardar la fecha de inicio del director  
-- (formato mm-dd-aaaa), acepta valores nulos y no puede ser mayor que la fecha actual.

ALTER TABLE DEPARTAMENTO
    ADD FechaDireccion DATE NULL CHECK (FechaDireccion <= GETDATE());
    
GO

/*  A)Crea un procedimiento llamado prActualizarDirector que se le pase el nombre de un departamento, un director y la fecha de direcci�n y  actualice el director y fecha de direcci�n de dicho departamento. Hay que tener en cuenta lo siguiente:

 - Los nuevos directores tienen que cumplir que solo pueden ser director del departamento al que pertenece y tienen que ser un empleado fijo.

- Los par�metros director y fecha de direcci�n son opcionales en la llamada al procedimiento y el valor por defecto para estos par�metros ser� null. En tal caso el director no cambiar�, es decir, ser� el que ya est� asignado y la fecha de inicio ser� la fecha de hace dos meses.

 - Si la fecha es mayor que la fecha actual y para que no incumpla la restricci�n en la fecha, se le asignar� fecha actual.

 - Se devolver�n dos par�metros de salida: a�os que lleva de director y un mensaje informando de la actualizaci�n.

A�os de antig�edad de director se calcular� utilizando una funci�n llamada fnAnhosFechas que se crear�. Recibir� dos fechas y devolver� los a�os que transcurre entre esas dos fechas
El mensaje indicar� si se ha cambiado el director o no junto al nombre y  la fecha de direcci�n*/

IF OBJECT_ID('fnAnhosFechas') IS NOT NULL
	BEGIN 
		DROP FUNCTION fnAnhosFechas
	END
GO	

CREATE FUNCTION fnAnhosFechas (@FECHA1 DATE, @FECHA2 DATE)
RETURNS INT
BEGIN
	RETURN DATEDIFF(YEAR,@FECHA2, @FECHA1)
END
GO

IF OBJECT_ID('prActualizarDirector') IS NOT NULL
BEGIN 
	DROP PROC prActualizarDirector
END

GO

CREATE PROC prActualizarDirector
@NOMEDEPT VARCHAR(50),
@NSSDIRECTOR VARCHAR(50) = NULL,
@FECHADIR DATE = NULL
, @ANIOS INT OUTPUT
AS
BEGIN 

	IF NOT EXISTS (SELECT 1 FROM DEPARTAMENTO WHERE NomeDepartamento = @NOMEDEPT)
	BEGIN 
		RETURN -1
	END
	
	IF NOT EXISTS (SELECT 1 FROM EMPREGADO WHERE NSS = @NSSDIRECTOR)
	BEGIN 
		RETURN -2
	END

	IF @NSSDIRECTOR NOT IN (SELECT NSS FROM EMPREGADOFIXO WHERE NSS = @NSSDIRECTOR)
		BEGIN
			RETURN -3
		END
	
	IF NOT EXISTS (SELECT NumDepartamento 
	FROM DEPARTAMENTO WHERE NomeDepartamento = @NOMEDEPT
	AND NumDepartamento IN (SELECT NumDepartamentoPertenece FROM EMPREGADO WHERE NSS = @NSSDIRECTOR))
	BEGIN 
		RETURN -4
	END
	
	IF @FECHADIR = NULL 
		BEGIN 
			SET @FECHADIR = DATEADD(MM,-2,GETDATE())
		END
	
	IF @FECHADIR > GETDATE()
		BEGIN
			SET @FECHADIR = GETDATE()
		END
	
	SELECT @ANIOS = dbo.fnAnhosFechas(FechaDireccion,@FECHADIR) from DEPARTAMENTO
	
	IF @NSSDIRECTOR = NULL
	BEGIN 
		UPDATE DEPARTAMENTO
		SET FechaDireccion = @FECHADIR
		WHERE NomeDepartamento = @NOMEDEPT
		
		RETURN 0
	END
	ELSE 
	BEGIN 
		UPDATE DEPARTAMENTO
		SET NSSDirector = @NSSDIRECTOR,
		FechaDireccion = @FECHADIR
		WHERE NomeDepartamento = @NOMEDEPT
		
		RETURN 1
	END
	
END

GO

/*Para ejecutar el anterior procedimiento se har� haciendo una llamada dentro del procedimiento prMensajesActualizarDirector. Se visualizar�  la antig�edad, el mensaje o los valores de retornos mediante un mensaje representativo seg�n el c�digo devuelto*/

IF OBJECT_ID('prMensajesActualizarDirector') IS NOT NULL
BEGIN 
	DROP PROC prMensajesActualizarDirector
END
	
GO

CREATE PROC prMensajesActualizarDirector
@NOMEDEPT VARCHAR(50),
@NSSDIRECTOR VARCHAR(50) = NULL,
@FECHADIR DATE = NULL
AS
BEGIN
	DECLARE @RESULT INT, @ANIOS INT = NULL
	
	EXEC @RESULT = prActualizarDirector @NOMEDEPT,@NSSDIRECTOR,@FECHADIR ,@ANIOS = @ANIOS OUTPUT
	
	DECLARE @NOMBREESTA VARCHAR(100) = (SELECT Nome + ' ' + ISNULL(Apelido1,'') + ' ' + ISNULL(Apelido2,'') FROM EMPREGADO WHERE NSS IN (SELECT NSSDirector FROM DEPARTAMENTO WHERE					NomeDepartamento = @NOMEDEPT))
	DECLARE @NOMBRENUEVO VARCHAR(100) = (SELECT Nome + ' ' + ISNULL(Apelido1,'') + ' ' + ISNULL(Apelido2,'') FROM EMPREGADO WHERE NSS = @NSSDIRECTOR)
	
	IF @RESULT = -1
	BEGIN 
		PRINT 'NO EXISTE EL DEPARTAMENTO' + @NOMEDEPT
	END
	
	IF @RESULT = -2
	BEGIN
		PRINT 'NO EXISTE UN DIRECTOR CON NSS' + @NSSDIRECTOR
	END
	
	IF @RESULT = -3
	BEGIN
		PRINT 'EL DIRECTOR ' + @NOMBRENUEVO + ' NO PERTENECE AL DEPARTAMENTO ' + @NOMEDEPT
	END
	
	IF @RESULT = -4
	BEGIN
		PRINT @NOMBRENUEVO + ' NO ES UN EMPLEADO FIJO'
	END
	
	IF @RESULT = 0
	BEGIN 
		PRINT 'NO SE HA CAMBIADO EN EL DIRECTOR DEL DEPARTAMENTO ' + @NOMEDEPT + ' SIGUE SIENDO ' + @NOMBREESTA + 
		'. LA FECHA DE DIRECCION ES' + CAST(@FECHADIR AS VARCHAR(50))
	END
	
	IF @RESULT = 1
	BEGIN 
		PRINT 'SE HA CAMBIADO EN EL DIRECTOR DEL DEPARTAMENTO ' + @NOMEDEPT + ' POR ' + @NOMBRENUEVO + '. LA FECHA DE DIRECCION ES ' + CAST(@FECHADIR AS VARCHAR(50))
	END
END

GO

EXEC prMensajesActualizarDirector 'T�CNICO','0001112','03-10-24'

GO

/*
b)

Se quiere modificar la fecha de inicio del director para cada departamento. La selecci�n de cada departamento se va a realizar por orden alfab�tico.  A partir de una fecha dada que ser� la del primer departamento seleccionado por orden alfab�tico, la fecha del resto de los departamentos ser� 45 d�as despu�s del anterior departamento siguiendo el orden establecido.  El director ser� el que est� ya asignado.

La actualizaci�n se realizar� utilizando el procedimiento prActualizarDirector creada anteriormente

Crea un procedimiento llamado prActualizarfechadirecci�nDepartamentos que dada una fecha actualice la fecha de todos los departamentos seg�n se ha indicado anteriormente. Los cambios por otras conexiones se reflejar�n.
*/

IF OBJECT_ID('prActualizarfechadirecci�nDepartamentos') IS NOT NULL
BEGIN 
	DROP PROC prActualizarfechadirecci�nDepartamentos
END

GO

CREATE PROC prActualizarfechadirecci�nDepartamentos
AS
BEGIN 

	DECLARE @NOMDEPT VARCHAR(100), @NSSDIRECTOR VARCHAR(100),@FECHADIR DATE
	DECLARE cur_departamentos CURSOR DYNAMIC FOR
	SELECT NomeDepartamento, NSSDirector, FechaDireccion FROM DEPARTAMENTO ORDER BY NomeDepartamento
	
	OPEN cur_departamentos
	FETCH NEXT FROM cur_departamentos INTO @NOMDEPT, @NSSDIRECTOR, @FECHADIR
	
	WHILE @@FETCH_STATUS <> -1
	BEGIN
		IF @@FETCH_STATUS = -2
		BEGIN 
			FETCH NEXT FROM cur_departamentos INTO @NOMDEPT, @NOMDEPT, @FECHADIR
			CONTINUE
		END
			EXEC prMensajesActualizarDirector @NOMDEPT, @NOMDEPT, @FECHADIR
		
		FETCH NEXT FROM cur_departamentos INTO @NOMDEPT, @NSSDIRECTOR, @FECHADIR
	END
	
	CLOSE cur_departamentos
	DEALLOCATE cur_departamentos

END
GO