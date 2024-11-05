Algoritmo E09_Maior3
	Escribir "Proporciona 3 números "
	Leer num1, num2, num3
	
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir num1, " es el mayor"
		SiNo
			Escribir num3, " es el mayor"
		Fin Si
	SiNo
		Si num3>num2 Entonces
			Escribir num3, " es el mayor"
		SiNo
			Escribir num2, " es el mayor"
		Fin Si
	Fin Si
	
FinAlgoritmo
