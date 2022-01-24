/*
1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
deve pagar um multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
Caso contrário mostrar tais variáveis com o conteúdo ZERO.

*/
programa
{
	
	funcao inicio()
	{
		inteiro P,E,M

		escreva("Coloque o peso dos tomates aqui")
		leia(P)
		
		
			se (P>50)
			{	
				E=P-50
				M=E*4
				escreva("\nO peso dos tomates é de ", P, " kgs, o excesso é de ", E, "kgs, e a multa é de R$", M, ",00 reais.")
			}
			senao
			{	
				E=0
				M=0
				
				escreva("\nExcesso: ",E)
				escreva("\nMulta: ",M)
				escreva("\nO peso dos tomates é de ", P, " kgs, logo, não há excesso nem multa.")
			}	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 843; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */