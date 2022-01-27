package Repeticao;

import java.util.Scanner;

public class ExemploWHILE {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número que sera dividido:");
		n1 = leia.nextInt();
		System.out.println("Digite um número que será divisor:");
		n2 = leia.nextInt();

		while (n2 != 0) {
			System.out.println("A divisão é: "+(n1 / n2));
			
			System.out.println("Digite um número que sera dividido:");
			n1 = leia.nextInt();
			System.out.println("Digite um número que será divisor:");
			n2 = leia.nextInt();
		}
		System.out.print("Não é possível divdir por zero");

	}

}
