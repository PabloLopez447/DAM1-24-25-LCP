Algoritmo E02_CalculoAreaTerreno2
	Escribir "Introduce el readio del semicirculo y la hipotenusa del triangulo: "
	Leer r, h
	
	areaSemicirculo = (PI *r ^ 2) / 2 + 2
	areaTriangulo = r * 2 * raiz(h^2 - r^2)
	areaTerreno = areaSemicirculo + areaTriangulo
	
	Escribir "El área delterreno es de " areaTerreno
FinAlgoritmo
