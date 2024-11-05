Función mostrarMenu
	Escribir '1. Iniciar sesión'
	Escribir '2. Listar viajes'
	Escribir '0. Salir'
FinFunción

Función mostrarSubMenu
	Escribir '1. Mis viajes'
	Escribir '2. Crear Viaje'
	Escribir '3. Cerrar sesión'
	Escribir '0. SALIR'
FinFunción

Función opcionUsuario <- menu
	Repetir
		mostrarMenu()
		Escribir 'Elige una opción (1, 2, 0): '
		Leer opcionUsuario
	Hasta Que opcionUsuario>=0 Y opcionUsuario<=2
FinFunción

Función opcionUsuarioSub <- subMenu
	Repetir
		mostrarSubMenu()
		Escribir 'Elige una opción (1, 2, 3, 0): '
		Leer opcionUsuario
	Hasta Que opcionUsuario>=0 Y opcionUsuario<=3
FinFunción

Algoritmo E19_Menu
	opt <- menu
	Escribir 'La opción elegida es: ', opt
	Según opt Hacer
		1:
			Escribir 'Introduzca los datos de inicio de sesión'
			Leer usuario
			Leer CONTRASENA
			Si usuario = 'admin' Y CONTRASENA = 'abc123' Entonces
				opt2 <- subMenu
				Escribir 'La opción elegida es: ', opt2
				Según opt2 Hacer
					1:
						Escribir 'Mis viajes'
					2:
						Escribir 'Crear viaje'
					3:
						menu
					0:
						Escribir 'Adios'
				FinSegún
			FinSi
		2:
			Escribir 'Lista de viajes'
		0:
			Escribir 'Adios'
	FinSegún
FinAlgoritmo
