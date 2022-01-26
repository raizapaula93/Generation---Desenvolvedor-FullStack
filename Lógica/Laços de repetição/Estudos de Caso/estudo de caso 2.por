/*
 * Calcular a média de 20 notas
 */

programa
{
	
	funcao inicio()
	{
		real nota, media, somaNotas=0.0
		inteiro contador//não tenho como fazer meia contagem, então só pode ser a contagem inteira

/*
		//primeira versão
		para(contador=1;contador<=20;contador++)//Passo(1)(função chefe)
		{
			escreva("Digite uma nota: ")
			leia(nota)
			enquanto(nota<0 ou nota>10)//condição teste.Passo(2), se V, volta pro para; se F, segue o algoritmo
			{
				escreva("\nNota inválida!Digite novamente: ")
				leia(nota)
				
				}
			somaNotas=somaNotas+nota//enquanto a nota cair na restrição do se, ele nao vem pra cá
		}
		media= somaNotas/20
		escreva("Média: ", media)
		
*/		
		//segunda versão
		para(contador=1;contador<=5;contador++)//Passo(1)(função chefe) - repete 20 vezes e inicia em 1 a contagem
		{
			faca			
			{	escreva("Digite a nota: ", contador, ": ") //coloco aqui a nota ser digitada, e o valor do contador p/indicar o loop
				leia(nota)
				
			}enquanto(nota<0 ou nota>10)//condição teste.Passo(2), se V, volta pro para; se F, segue o algoritmo
				
			somaNotas=somaNotas+nota//enquanto a nota cair na restrição do se, ele nao vem pra cá
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 945; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */