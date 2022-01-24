/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. 

 */





programa
{
	
	funcao inicio()
	{
		inteiro pontuacao=0, maior_pont=0
		inteiro vet[5]

		para(pontuacao=0;pontuacao<5;pontuacao++)
		{

			escreva("\nDigite a pontuação do jogo xpto :")
			leia(vet[pontuacao])

			se(vet[pontuacao]>maior_pont)
			{
				maior_pont=vet[pontuacao]
				
			}


		}
		
		para(pontuacao=0;pontuacao<5;pontuacao++)
		{
			escreva("\nPontos:",vet[pontuacao])

			
			
			}	
				
		escreva("\nA maior pontuação foi: ",maior_pont)		
					
		}
			
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */