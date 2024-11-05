Funcion mostrarMenu 
	Escribir "1. Iniciar sesión"
	Escribir "2. Listar viajes"
	Escribir "0. Salir"
Fin Funcion

Funcion opcionUsuario <- menu
	Repetir
		mostrarMenu
		Escribir "Elige una opción (1, 2, 0): "
		Leer opcionUsuario
	Hasta Que opcionUsuario >= 0 y opcionUsuario <= 2
Fin Funcion

Algoritmo E19_Menu
	opt = menu
	Escribir "La opción elegida es: ", opt
FinAlgoritmo
