/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 * 
 */
package ListaExercicios1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade_anos, idade_meses, idade_dias, diasVida;
		
		System.out.println("Quantos dias de vida você tem? ");
		diasVida = leia.nextInt();
		
		idade_anos = (diasVida/365);
		
		diasVida = (diasVida%365);
		
		idade_meses = (diasVida/30);
		
		diasVida = (diasVida%30);
		
		idade_dias = diasVida;
		
		System.out.println("Legal! Pelos dias de vida que você digitou então você tem "+idade_anos+" anos, "+idade_meses+" meses , e "+idade_dias+" dias.");
		leia.close();	
				
				
				
		
		

	}

}
