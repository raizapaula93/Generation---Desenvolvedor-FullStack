programa
{
	
	funcao inicio()
	{
		inteiro tempo_horas, tempo_minutos, tempo_segundos, total_tempo, total_tempo2, total_tempo3//tipar como inteiro faz conversões?
		cadeia nome
		//Efetua a leitura da idade em dias
		escreva("Peguei a contagem do tempo do relógio central MUITO PRECISO, mas ele só conta o tempo em segundos e") 
		escreva("\nmeu chefe pediu o relatório de eventos da semana")
		escreva("\nMas tô NUMANICE porque sei converter")
		escreva("\nMÁQUINA DE RELATÓRIOS")
		escreva("\nInpute o nome do funcionário que está fazendo o relatório")
		leia(nome)
		escreva("\nInpute abaixo o tempo marcado pelo relógio MUITO PRECISO")
		leia(total_tempo)
		escreva(total_tempo)

		//Converte o número de segundos para horas(quantos intervalos de 3600 eu acho dentro dos segundos lidos?)
		tempo_horas = (total_tempo/3600)//a quantidade de horas (parte inteira da divisão, será armazenada aqui) - (1)
		//Pega o resto de (1) dará um número float. Então eu vou pegar esse float, ver quantos intervalos de 60 segunos cabem dentro desse resto
		//Porque o meu número de horas já está salvo em tempo_horas
		total_tempo2 = total_tempo%3600//Coloquei o resto na variável total
		//Divido o total lido por 60(quantos intervalos de 60 segunos - 1 minuto cabem no resto de (1))
		tempo_minutos = total_tempo2/60 // atualiza a quantidade de segundos lidos(2)
		//Pega o resto de (2) e vê o que isso dá em segundos
		total_tempo3 = total_tempo2%60//Resto de 2(3)
		//observamos que esse resto é convertido para segundos
		tempo_segundos = total_tempo3//aqui mostramos na tela os valores das horas, minutos e segundos
		escreva("------------------------------------------------------------------------------------------------------------------")
		escreva("\n--------------------------------FÁBRICA TRENZINHO DA ALEGRIA----------------------------------------------------")
		escreva("\n----------------------------------------------------------------------------------------------------------------")
		escreva("\n----------------------------------RELATÓRIO DE EVENTOS----------------------------------------------------------")
		escreva("\n----------------EVENTO : CURSO DE BOAS PRÁTICAS ENTRE COLABORADORES---------------------------------------------")
		escreva("\n----------------DURAÇÃO DO EVENTO:" +tempo_horas+" horas, ", +tempo_minutos+" minutos, ", +tempo_segundos+ " segundos")
		escreva("\n----------------FUNCIONÁRIO RESPONSÁVEL PELO RELATÓRIO:",nome,"--------------------------------------------------")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */