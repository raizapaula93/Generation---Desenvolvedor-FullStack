/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
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
		
		System.out.println("O custo de um carro ao consumidor �:R$ "+custo_c);
	}

}
