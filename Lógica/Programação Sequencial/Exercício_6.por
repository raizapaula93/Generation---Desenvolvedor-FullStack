/*
 * 6. Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 * escreva a distância entre eles. A fórmula que efetua tal cálculo é: d=raizquadrada(x2-x1)^2 + (y2-y1)^2

 */

programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real x1,x2,y1,y2,d1,d2,d

		escreva("Inclua aqui os pontos de P1: ")
		leia(x1,y1)
		
		escreva("\nInclua aqui os pontos de P2: ")
		leia(x2,y2)


		d1=mat.potencia((x2-x1), 2)
		d2=mat.potencia((y2-y1), 2)
		d=mat.raiz((d1+d2), 2)


		escreva("\nO valor de d é :",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */