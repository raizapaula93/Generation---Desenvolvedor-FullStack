/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

 */
package ListaExercicios2;

import java.util.Scanner;

public class Exercicio5DOWHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma=0,i=0;
		
		do {
			System.out.println("\nDigite um n�mero aqui:");
			n = leia.nextInt();
			
			soma= soma+n;
					
			i+=1;		

		}while (n!=0);
			
		System.out.println("\nA soma dos n�emros digitados � "+soma);	
			
		}
		

	}


