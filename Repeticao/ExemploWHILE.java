package Repeticao;

import java.util.Scanner;

public class ExemploWHILE {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero que sera dividido:");
		n1 = leia.nextInt();
		System.out.println("Digite um n�mero que ser� divisor:");
		n2 = leia.nextInt();

		while (n2 != 0) {
			System.out.println("A divis�o �: "+(n1 / n2));
			
			System.out.println("Digite um n�mero que sera dividido:");
			n1 = leia.nextInt();
			System.out.println("Digite um n�mero que ser� divisor:");
			n2 = leia.nextInt();
		}
		System.out.print("N�o � poss�vel divdir por zero");

	}

}
