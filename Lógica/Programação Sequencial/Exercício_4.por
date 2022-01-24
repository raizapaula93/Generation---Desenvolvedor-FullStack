programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{	
		real A,B,C,R,S,D//declaração de variáveis
		
		escreva("Calcule o D a partir dos números inteiros positivos A,B,C")
		escreva("\nInpute A: ")
		leia(A)
		escreva("\nInpute B: ")
		leia(B)
		escreva("\nInpute C: ")
		leia(C)

		R=mat.potencia((A+B), 2)
		S=mat.potencia((B+C), 2)
		D=((R+S))/2

		escreva("\nO número  é: ",D) 
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */