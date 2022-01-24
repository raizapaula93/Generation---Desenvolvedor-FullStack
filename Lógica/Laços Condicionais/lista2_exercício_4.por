programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		real A,B,C,D,pot1, pot2,pot3,pot4
		
		escreva("\nInpute um número inteiro, positivo ou negativo:")
		leia(A)
		escreva("\nInpute um número inteiro, positivo ou negativo:")
		leia(B)
		escreva("\nInpute um número inteiro, positivo ou negativo:")
		leia(C)
		escreva("\nInpute um número inteiro, positivo ou negativo:")
		leia(D)
		
		A=mat.potencia(A, 2)
		B=mat.potencia(B, 2)
		C=mat.potencia(C, 2)
		D=mat.potencia(D, 2)
		
		se(C>=1000)
		{
			escreva("\n",C)
		}
		senao
		{	escreva("\n",A)
			escreva("\n",B)
			escreva("\n",D)
		}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 608; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */