package Introducao;

import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		
		int n1, n2, media; //declaração de variáveis
		Scanner calc = new Scanner (System.in);
 		
		System.out.println("Digite um número: ");
		n1 = calc.nextInt();
				
		System.out.println("Digite um número: ");
		n2 = calc.nextInt();
		
		media =(n1+n2)/2;
		
		System.out.println("A media é :"+media);
		calc.close();
	}

}
