/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
 *  Para sair digitar 0(zero).(DO...WHILE)

 */
package ListaExercicios2;

import java.util.Scanner;

public class Exercicio6DOWHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, media=0,i=0;
		
		do {
			
			System.out.println("\nDigite um n�mero aqui:");
			n = leia.nextInt();
			
					if(n%3==0 && n>0) {
				
						media=media+n;
			
						i=i+1;
							
					}
			
			
			}while(n!=0);
		
		System.out.println("\nA media dos n�meros � "+(media/i));
		
	}

}
