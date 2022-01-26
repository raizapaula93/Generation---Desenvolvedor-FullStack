/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
 */
package ListaExercicios1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float x1, x2, y1, y2; 
		double d, p1, p2;
		
		System.out.println("Digite o par x1 e x2 de P aqui: ");
		x1 = leia.nextInt();
		x2 = leia.nextInt();
		
		System.out.println("Digite o par y1 e y2 de P aqui: ");
		y1 = leia.nextInt();
		y2 = leia.nextInt();
		
		p1 = Math.pow((x2-x1),2);
		p2 = Math.pow((y2-y1), 2);
		d = Math.sqrt((p1+p2));
		
		System.out.println(d);
	}

}
