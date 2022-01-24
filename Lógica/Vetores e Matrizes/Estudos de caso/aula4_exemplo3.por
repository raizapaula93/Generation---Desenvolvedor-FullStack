/*
 * Matriz == conjunto de vetores do mesmo tipo
 */


programa
{
	
	funcao inicio()
	{
		inteiro m[3][4], linha, coluna //3 linhas e 4 colunas

		para(linha=0; linha<3;linha++)
		{
			para(coluna=0;coluna<4;coluna++)
			{
				escreva("\nDigite um número :")
				leia(m[linha][coluna])

				
				}
			
			}
			escreva(m[1][3])
			
		para(linha=0; linha<3;linha++)
		{
			para(coluna=0;coluna<4;coluna++)
			{
				escreva("\t",m[linha][coluna])
				
				}
			escreva("\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 11, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */