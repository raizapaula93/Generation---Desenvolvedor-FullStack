/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

programa
{
	inclua biblioteca Util	
		inteiro dado, contador,resultados[10], maior_pont=0, n_maiorpont=0
		real media, soma=0.0
	
	funcao inicio()
	{
		
		
		escreva("Resultados dos dados jogados : ")
		para(contador=0;contador<10;contador++)
		{
				dado = Util.sorteia(1, 6)
				escreva( dado + " ")

				resultados[contador] = dado
				soma = soma +dado
				
				
				se(dado>maior_pont)
				{
					maior_pont=dado
				}
			
		}
			
		para(contador=0;contador<10;contador++)
		{
					
				se(maior_pont==resultados[contador])
				{
					n_maiorpont++
					}
					
		}
		media = soma/10	
			
			
		escreva("\nA média dos resultados da jogada foi: ", media, " , o face do dado que mais apareceu foi de: ",maior_pont," aparecendo",n_maiorpont)	
		}
			
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 902; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */