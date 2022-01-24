programa
{
	
	funcao inicio()
	{
		inteiro idade_anos, idade_meses, idade_dias, total_dias, total_dias2, total_dias3//tipar como inteiro faz conversões?
		//Efetua a leitura da idade em dias
		escreva("Agora que você sabe quantos dias você já viveu, escreva-o aqui para eu ver uma coisa")
		leia(total_dias)

		//Converte o número de dias para ano(quantos intervalos de 365 eu acho dentro dos dias lidos?)
		idade_anos = (total_dias/365)//a quantidade de anos (parte inteira da divisão, será armazenada aqui) - (1)
		//Pega o resto de (1) dará um número float. Então eu vou pegar esse float, ver quantos intervalos de 30 dias cabem dentro desse resto
		//Porque o meu número de anos já está salvo em idade_anos
		total_dias2 = total_dias%365//Coloquei o resto na variável total
		//Divido o total lido por 30(quantos intervalos de 30 dias - 1 mês cabem no resto de (1))
		idade_meses = total_dias2/30 // atualiza a quantidade de dias lidos(2)
		//Pega o resto de (2) e vê o que isso dá em dias
		total_dias3 = total_dias2%30//Resto de 2(3)
		//observamos que esse resto é convertido para dias
		idade_dias = total_dias3//aqui mostramos na tela os valores dos anos, meses e dias
		escreva("Todos esses dias de vida totalizam "+idade_anos+" anos, "+idade_meses+" meses, e "+idade_dias+" dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */