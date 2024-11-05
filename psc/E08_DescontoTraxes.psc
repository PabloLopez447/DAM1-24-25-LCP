Algoritmo E08_DescontoTraxes
	Escribir 'Escribe o prezo do traxe ou vestido'
	Leer prezo
	Si prezo>250 Entonces
		desconto <- prezo*0.15
		prezoConDesconto <- prezo-desconto
	SiNo
		desconto <- prezo*0.08
		prezoConDesconto <- prezo-desconto
	FinSi
	Escribir 'A prenda ten un desconto de ', desconto
	Escribir 'O prezo a pagar é ', prezoConDesconto
FinAlgoritmo
