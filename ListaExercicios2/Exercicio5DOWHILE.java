/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

 */
package ListaExercicios2;

import java.util.Scanner;

public class Exercicio5DOWHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma=0,i=0;
		
		do {
			System.out.println("\nDigite um número aqui:");
			n = leia.nextInt();
			
			soma= soma+n;
					
			i+=1;		

		}while (n!=0);
			
		System.out.println("\nA soma dos núemros digitados é "+soma);	
			
		}
		

	}


