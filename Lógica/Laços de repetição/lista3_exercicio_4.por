programa
{

    funcao inicio()
    {
        inteiro N //variavel que guarda informação do usuário

        escreva("\nInpute um número: ")

        leia(N)

        enquanto(N<100) //"enquanto o valor for menor que 100" o codigo continua rodando, assim que passar, mostra o ultimo resultado e encerra.
        {
            N=N*3 //multipliquei o valor inputado pelo usuario por 3
            
            escreva("\nOs multiplos são: ", N) //resultado
        }

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */