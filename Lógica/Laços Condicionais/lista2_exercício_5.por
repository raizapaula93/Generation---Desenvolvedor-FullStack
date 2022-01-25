/*
 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.
 */

programa
{
	
	funcao inicio()
	{
		real index_poluicao

		escreva("Olá técnico ambiental, digite aqui o índice de poluição medido na fiscalização: ")
		leia(index_poluicao)


			se(index_poluicao>=0.3 e index_poluicao<0.4)
			{
				escreva("\nAs índustrias de A devem parar suas atividades")
				}
			senao se(index_poluicao>=0.4 e index_poluicao<0.5)
			{
				escreva("\nAs índustrias de A e de B devem parar suas atividades")
				}
			senao se(index_poluicao>=0.5)
			{
				escreva("\nAs índustrias de A, de B , e de C devem parar suas atividades")
				}

			senao
			{
				escreva("\n Os índices de poluição estão em ordem.")//declare as condições somente dos restritores
				}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */