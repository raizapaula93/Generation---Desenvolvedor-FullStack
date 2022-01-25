/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */


programa
{
	
	funcao inicio()
	{
		inteiro n1

		escreva("Digite um número aqui, rapidão :")
		leia(n1)

		se (n1%2==0)
		{
			escreva("\n O número "+n1+" é par")
		}
		senao
		{
			escreva("\n O número"+n1+" é ímpar")
		}
		se (n1<0)
		{
			escreva("\n O número "+n1+" é negativo")
		}
		senao
		{
			escreva("\n O número"+n1+" é positivo")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */