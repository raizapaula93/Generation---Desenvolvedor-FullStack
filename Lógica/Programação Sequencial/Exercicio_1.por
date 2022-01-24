programa
{
	
	funcao inicio()
	{
		inteiro idade_anos, idade_meses, idade_dias, total_dias
		
		escreva("Qual suas idade em anos?")
		leia(idade_anos)
		escreva("Quantos meses completos faltam para o seu aniversário? o menor valor é 1")
		leia(idade_meses)
		escreva("Quantos dias faltam para chegar no dia que corresponde ao seu aniversário?")
		leia(idade_dias)
		
		idade_meses = 12 - idade_meses
		total_dias = (idade_anos*365) + (idade_meses*30) + (idade_dias)
		escreva("Sua idade  é: "+idade_anos+" anos, "+idade_meses+" meses, e "+idade_dias+" dias, totalizando "+total_dias+" dias de vida.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */