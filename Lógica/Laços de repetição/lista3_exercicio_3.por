/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
 */

programa
{
	
	funcao inicio()
	{
		real N=0,contador=0,soma_n=0

		
		enquanto (N>=0)
		{	
			
			escreva("Digite um número aqui: ")
			leia(N)
				
			soma_n=soma_n+N 

			contador=contador+1
			
				
		}
		
		escreva("\nSoma dos números inputados: ",soma_n)
		escreva("\nMédia dos dos números inputados: ",(soma_n/contador))
		escreva("\nO total de números inputados é de: ",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */