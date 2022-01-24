/*

2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

*/
programa
{
	
	funcao inicio()
	{
		inteiro x = 0, soma_impar=0

		escreva("Sistema de soma dos números ímpares de 1 até 500")

		
		para (x=1;x<=500;x+=2)
		{
			se(x%3==0)
			{
				soma_impar=soma_impar+x
			}
		}
		escreva ("\nA soma de todos o números ímpares do intervalo é: "soma_impar)
	}
				
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */