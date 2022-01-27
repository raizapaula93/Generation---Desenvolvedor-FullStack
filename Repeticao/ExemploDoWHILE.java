package Repeticao;

import java.util.Scanner;

public class ExemploDoWHILE {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		
		
		do {
		System.out.println("\nDigite um número:");
		n1 = leia.nextInt();
		System.out.println("\nDigite um número:");
		n2 = leia.nextInt();
		
		System.out.println("\nA soma é:"+(n1+n2));
		
		}while(n1 != -1 || n2 != -1 );
		

	}

}
