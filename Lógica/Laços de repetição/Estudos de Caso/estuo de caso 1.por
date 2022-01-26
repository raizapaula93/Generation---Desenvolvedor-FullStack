/*
 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

 */

programa
{
	
	funcao inicio()
	{
		inteiro x=1, N=0, soma=N //contador começando em 1, variável a ser inputada

		escreva("Digite N: ")
		leia(N)
		
		faca
		{
			escreva(N,"\t")
			
			 //x receberá o valor que tinha anteriormente + 1
			soma=soma+(N-1)
			N=N-1
			}
		enquanto (N >= 1) //até o x especificado chegar no valor de N
		
		escreva(soma,"\t")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */