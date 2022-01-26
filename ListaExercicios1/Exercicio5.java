/*
 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */

package ListaExercicios1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, media_ponderada;
		
		System.out.println("Digite a 1ª nota aqui: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite a 2ª nota aqui: ");
		n2 = leia.nextInt();

		System.out.println("Digite a 3ª nota aqui: ");
		n3 = leia.nextInt();

		media_ponderada = (float) ((n1*2)+(n2*3)+(n1*5))/10;
		System.out.println("A media do aluno é "+media_ponderada);
		leia.close();
				
	}

}
