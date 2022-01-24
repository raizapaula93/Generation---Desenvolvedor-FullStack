programa
{

    funcao inicio()
    {//MTARIZ 1
        inteiro n1[2][3], l, c, n2[2][3], m1[2][3], l2, 
        
        
        c2, m2[2][3]

            para(l=0; l<2; l++)
            {
                para(c=0; c<3; c++)
                {
                    escreva("\nDigite um numero: ")
                    leia(n1[l][c])

                }
            }//Matriz 2 
            para(l=0; l<2; l++)
            {
                para(c=0; c<3; c++)
                {
                    escreva("\nDigite um numero: ")
                    leia(n2[l][c])
                }
            }//Matriz 3 - soma
            para(l=0; l<2; l++)
            {
                para(c=0; c<3; c++)
                {
                    m1[l][c] = n1[l][c] + n2[l][c]
                }
            }//matriz 4 - subtração
            para(l=0; l<2; l++) 
            {
                para(c=0; c<3; c++)
                {
                    m2[l][c] = n1[l][c] - n2[l][c]
                    limpa()
            escreva("\nA soma entre n1 e n2 é: "+m1[l][c])
            escreva("\n")
            escreva("\nA diferença entre n1 e n2 é: "+m2[l][c])
                }
            }

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 16, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */