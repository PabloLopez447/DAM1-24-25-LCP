Funci�n mostrarMenu
	Escribir '1. Iniciar sesi�n'
	Escribir '2. Listar viajes'
	Escribir '0. Salir'
FinFunci�n

Funci�n mostrarSubMenu
	Escribir '1. Mis viajes'
	Escribir '2. Crear Viaje'
	Escribir '3. Cerrar sesi�n'
	Escribir '0. SALIR'
FinFunci�n

Funci�n opcionUsuario <- menu
	Repetir
		mostrarMenu()
		Escribir 'Elige una opci�n (1, 2, 0): '
		Leer opcionUsuario
	Hasta Que opcionUsuario>=0 Y opcionUsuario<=2
FinFunci�n

Funci�n opcionUsuarioSub <- subMenu
	Repetir
		mostrarSubMenu()
		Escribir 'Elige una opci�n (1, 2, 3, 0): '
		Leer opcionUsuario
	Hasta Que opcionUsuario>=0 Y opcionUsuario<=3
FinFunci�n

Algoritmo E19_Menu
	opt <- menu
	Escribir 'La opci�n elegida es: ', opt
	Seg�n opt Hacer
		1:
			Escribir 'Introduzca los datos de inicio de sesi�n'
			Leer usuario
			Leer CONTRASENA
			Si usuario = 'admin' Y CONTRASENA = 'abc123' Entonces
				opt2 <- subMenu
				Escribir 'La opci�n elegida es: ', opt2
				Seg�n opt2 Hacer
					1:
						Escribir 'Mis viajes'
					2:
						Escribir 'Crear viaje'
					3:
						menu
					0:
						Escribir 'Adios'
				FinSeg�n
			FinSi
		2:
			Escribir 'Lista de viajes'
		0:
			Escribir 'Adios'
	FinSeg�n
FinAlgoritmo
