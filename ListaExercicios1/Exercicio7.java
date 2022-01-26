/*
 * 7. Um sistema de equações lineares do tipo:
 * pode ser resolvido segundo mostrado abaixo :
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */
package ListaExercicios1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, d,e,f,x,y; 
				
		System.out.println("Digite os coeficientes do sistema de equações: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		d = leia.nextInt();
		e = leia.nextInt();
		f = leia.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de x é: "+x+" , e o valor de y é: "+y);
		leia.close();
		
		
		

	}

}
