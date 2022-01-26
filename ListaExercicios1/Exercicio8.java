/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */

package ListaExercicios1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float custo_c,comiss_dis=(float) 0.28,imp= (float) 0.45,custo_f; 
				
		System.out.println("Digite o custo de fabrica do carro XPTO ");
		custo_f = leia.nextFloat();
		
		custo_c= (custo_f*comiss_dis) + (custo_f*imp) + custo_f;
		
		System.out.println("O custo de um carro ao consumidor é:R$ "+custo_c);
	}

}
