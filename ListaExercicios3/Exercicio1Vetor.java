/*
 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */

package ListaExercicios3;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[5];
		int maior = 0;
		
		for(int x = 0;x<5;x++)
		{
			System.out.println("Digite um n�mero: ");
			vet[x] = leia.nextInt();
			if (vet[x]>maior)
			{
				maior=vet[x];
			}
			
			System.out.println(vet[x]);// - Escrevo logo ap�s o loop
					
		}
		for(int x = 0;x<5;x++)
		{
			System.out.println(vet[x]); // Escreve ap�s a execu��o do 1� loop
			
		}
				
		System.out.println("\nO maior valor �: "+maior);
		
	}

}
