Funcion mostrarMenu 
	Escribir "1. Iniciar sesi�n"
	Escribir "2. Listar viajes"
	Escribir "0. Salir"
Fin Funcion

Funcion opcionUsuario <- menu
	Repetir
		mostrarMenu
		Escribir "Elige una opci�n (1, 2, 0): "
		Leer opcionUsuario
	Hasta Que opcionUsuario >= 0 y opcionUsuario <= 2
Fin Funcion

Algoritmo E19_Menu
	opt = menu
	Escribir "La opci�n elegida es: ", opt
FinAlgoritmo
