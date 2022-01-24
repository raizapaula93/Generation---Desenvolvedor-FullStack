programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		real n1, n2, pot, raiz //declaração de variáveis
		
		escreva("Digite dois números :")//informação para o usuário
		leia(n1, n2)//entrada de dados

		pot=mat.potencia(n1, n2)
		raiz=mat.raiz(n1, 2.0)

		escreva("A soma é: ", n1+n2)
		escreva("\nA subtração é: ", n1-n2)
		escreva("\nA multiplicação é: ", n1*n2)
		escreva("\nA divisão é: ", n1/n2)
		escreva("\nA potência é: ", pot)
		escreva("\nA raiz quadrada é: ", raiz)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */