/*
 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */

programa
{
	
	funcao inicio()
	{
		real base, altura, triangulo
		escreva("Digite aqui, em cm, a base do triângulo")
		leia(base)
		escreva("\nLegal, agora digite aqui, em cm, a altura do triângulo")
		leia(altura)

		se (base>0 e altura>0 )
		{
			triangulo = ((base*altura)/2)

			escreva("\n a área do triângulo é :", triangulo)
		}
		senao
		{
			escreva("\nEstes dados não são válidos!")
			
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */