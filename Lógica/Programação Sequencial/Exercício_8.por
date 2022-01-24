programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real custo_con,custo_fab

		escreva("Inpute o custo de fábrica do caro XPTO")
		leia(custo_fab)

		custo_con = custo_fab+(0.28*custo_fab)+(0.45*custo_fab)

		escreva("\nO custo ao consumidor é: ",custo_con)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */