/*
 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
package ListaExercicios1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Quantos segundos demorou o evento da fábrica que a máquina contabilizou? ");
		segundos = leia.nextInt();
		
		horas = (segundos/3600);
		
		segundos = (segundos%3600);
		
		minutos = (segundos/60);
		
		segundos = (segundos%60);
		
				
		System.out.println("Nossa! O evento durou então "+horas+" horas, "+minutos+" minutos , e "+segundos+" segundos.");
		leia.close();	
		

	}

}
