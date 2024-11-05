Algoritmo E01_CalculoAreaTerreno
	Escribir "Introduce los valores de los lados a, b y c: "
	Leer a,b,c
	
	areaRect = b*c
	areaTria = b *(a-c) / 2
	
	areaTerr = areaRect + areaTria
	Escribir "El área del terreno es de ", areaTerr
FinAlgoritmo
