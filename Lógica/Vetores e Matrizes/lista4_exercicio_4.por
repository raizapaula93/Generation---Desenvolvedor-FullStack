/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma 
 * dos valores da primeira diagonal, ou seja, diagonal principal.
 */

programa
{
	
	funcao inicio()
	{
		inteiro m[3][3], linha, coluna, soma=0, diag=0 //3 linhas e 4 colunas

		para(linha=0; linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nDigite um número :")
				leia(m[linha][coluna])
				soma=soma+m[linha][coluna]

				diag = m[0][0] + m[1][1] + m[2][2]
            }
        }
        escreva("a soma do total é: ",soma)
        escreva("\nA da soma da diagonal é: ", diag)

    }
}		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 11, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */