/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
package ListaExercicios2;

import java.util.Scanner;

public class Exercicio2FOR {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n,q_par=0, q_impar=0, i=1;
		System.out.println("\nDigite 10 n�meros aqui: ");
				
		for (i=1;i<=10;i++) {
			
			n = leia.nextInt();
			
				if(n%2==0){
					
					q_par = q_par+1;
				
					}
				
				else {
					
					q_impar= q_impar+1;
					
				}
				
			}
		System.out.println("\nA qtde de n�s pares � "+q_par+" , e a qtde de n�s �mpares � "+q_impar+".");
		}
		
	}
