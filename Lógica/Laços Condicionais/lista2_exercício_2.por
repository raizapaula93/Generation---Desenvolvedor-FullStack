/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de 
 * pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.


*/
programa
{
	
	funcao inicio()
	{	inteiro N,Hex
		cadeia C
		real S, E 
		
		escreva("Inpute aqui o código de identificação do colaborador")
		leia(C)
		escreva("Inpute aqui o número de horas do colaborador")
		leia(N)

				
		se (N<=50)
		{	S=(N*10)
			E=0
			
			}
						
		senao
		{	Hex = (N-50)
			E = (Hex*20)
			S = (N-Hex)*10
			S=  S+E
							
			}
		escreva("\n-------------------SISTEMA DE PAGAMENTOS EMPREGO FELIZ-----------------------------------")
		escreva("\n			RELATÓRIO DE SALÁRIOS")
		escreva("\n----------------------------------------------------------------------------------------")
		escreva("\nCÓDIGO DO OPERÁRIO: ",C)
		escreva("\nNÚMERO DE HORAS TRABALHADAS: ",N)
		escreva("\nSALÁRIO TOTAL: ",S)
		escreva("\nSALÁRIO EXCEDENTE: ",E)
		
		
		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 790; 
 * @DOBRAMENTO-CODIGO = [0];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */