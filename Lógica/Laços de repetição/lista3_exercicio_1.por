/*
A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.

*/
programa
//BLoco do maior
{

	funcao inicio()
	{
		inteiro x //variável contadora
		inteiro num_filhos,total_filhos=0//variáveis inteiras (impossíveis de serem float)
		real val_salarios,total_salarios=0.0,maior_salario=0.0, media_filhos, media_salarios, ate_cem=0.0, perc_cem//(variáveis reais

		
		para(x=1; x<=3; x++)//com o contador iniciando em 1, sendo contado até 3 vezes, contando de 1 em 1)
		{
			escreva("\nFolha de pesquisa: ", x)//número da contagem
			
			escreva("\nDigite aqui os seu salário: ")//entrada salários
			leia(val_salarios)
			
			se(val_salarios>maior_salario)//a cada salário inputado, eu testo se esse foi o maior salário já pesquisado
			{
				maior_salario = val_salarios//se o teste for verdadeiro, eu coloco o novo salario inputado na variável maior_salário
				
				}
			se(val_salarios<= 100.0)// a cada salário inputado, eu testo se o valor é maior ou igual a 100
			{
				ate_cem= ate_cem + 1// se for verdadeiro, eu adiciono a variável ate_cem
				//(zerada de inicio), a variavel ate cem adicionando 1
				//(o q ja foi contado+ 1 a cada vez que a iteraçao acontecer
				}
						
			total_salarios= total_salarios + val_salarios// a cada input de salario, eu adiciono o valor inputado
			//à variável total_salarios(zerada de inicio)+ o salario que sera inputado a cada iteração que acontecer
				
			escreva("\nDigite aqui o número de filhos que você tem: ")
			leia(num_filhos)
			
			total_filhos = total_filhos + num_filhos// a cada input de nume de filho, eu adiciono o valor inputado
			//à variável total_filhos(zerada de inicio)+ o numero de filhos que sera inputado a cada iteração que acontecer


			 			
		}
		
		
		
		media_salarios = total_salarios/ //media
		
		media_filhos = (total_filhos/3)
		perc_cem=(ate_cem/3)*100
			

		 
		escreva("\nA média de salários da população é: ",media_salarios)
		escreva("\nA média do número de filhos é: ",media_filhos)
		escreva("\nO Maior salário inputado é: ", maior_salario)
		escreva("\nA população que recebe salário até R$100,00 reais é de ", perc_cem)
		
		
	
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2027; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */