programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A,B,C,D,E,F,x,y

		escreva("Inpute os valores dos coeficientes para resolver x e y: \n")
		leia(A,B,C,D,E,F)

		x=((C*E)-(B*F))/((A*E)-(B*D))
		y=((A*F)-(C*D))/((A*E)-(B*D))

		
		escreva("\nA solução de x é:",x)
		escreva("\nA solução de y é:",y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */