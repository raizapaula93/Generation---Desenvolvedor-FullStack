package LacoCondicional;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		String x;
		System.out.print("Digite uma letra:");
		Scanner leia = new Scanner(System.in);
		x = leia.nextLine();

		switch (x) {
		case "a":
			System.out.print("Vogal");
			break;
		case "e":
			System.out.print("Vogal");
			break;
		case "i":
			System.out.print("Vogal");
			break;
		case "o":
			System.out.print("Vogal");
			break;
		case "u":
			System.out.print("Vogal");
			break;
		default:
			System.out.print("Consoante");
		}

	}

}
