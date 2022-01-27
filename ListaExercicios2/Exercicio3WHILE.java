/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99. (WHILE)

 */

package ListaExercicios2;

import java.util.Scanner;

public class Exercicio3WHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n=0,pessoas_jovens=0,pessoas_senior=0,i=1;
				
			while(n!=-99) {
				System.out.println("\nDigite a idade deste grupo de pessoas:");
				n = leia.nextInt();
				
					if(n<=21 && n>0){
				
						pessoas_jovens=pessoas_jovens+1;
				
					}
					else if(n>=50 && n<=130){
				
						pessoas_senior=pessoas_senior+1;
					}
									
					i+=1;
		}
		System.out.println("\nNeste grupo de pessoas temos "+pessoas_jovens+" pessoas jovens e "+pessoas_senior+" pessoas senior.");

	}

}
