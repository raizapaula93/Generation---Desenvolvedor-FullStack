/*
 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:
 * 
 */


package ListaExercicios1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int A, B, C, R, S, D;
		
		System.out.println("Digite A aqui: ");
		A = leia.nextInt();
		
		System.out.println("Digite B aqui: ");
		B = leia.nextInt();
		
		System.out.println("Digite C aqui: ");
		C = leia.nextInt();
		
		
		R = (A+B)*(A+B);
		S = (B+C)*(B+C);
		D= (R+S)/2;
				
		System.out.println("O resultado de D �: "+D);
		leia.close();

		
		
	}

}
