/*
 * if -> se
 * else -> senao
 * else if -> senao se
 * || -> ou
 * && -> e
 */
package LacoCondicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		int x;
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		x = leia.nextInt();

		if (x == 5 || x == 7) {
			System.out.print("O valor � 5 ou 7");

		} else if (x < 5 && x > 3) {
			System.out.print("O valor est� entre 5 e 3");
		} else {
			System.out.print("O valor � maior que 5");
		}

		System.out.print("\nFIM DO PROGRAMA");
	}

}
