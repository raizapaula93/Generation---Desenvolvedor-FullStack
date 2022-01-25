programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, pot1, pot2, pot3, pot4


			escreva("Inpute aqui 4 números: ")
			leia(n1,n2,n3,n4)


			pot1 = mat.potencia(n1, 2)
			pot2 = mat.potencia(n2, 2)
			pot3 = mat.potencia(n3, 2)
			pot4 = mat.potencia(n4, 2)


			se(pot3>=1000)
			{
				escreva("\n A potência de "+n3+" é: ",pot3)

			}
			senao
			{
				escreva("\n A potência de "+n1+" é: ",pot1)
				escreva("\n A potência de "+n2+" é: ",pot2)
				escreva("\n A potência de "+n3+" é: ",pot3)
				escreva("\n A potência de "+n4+" é: ",pot4)
			}	
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */