package VetorEMatriz;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		int[]vet = new int[5];
		int soma = 0;
		int maior=0;
		
		for(int x=0;x<5; x++)
		{
			System.out.println("Digite um número: ");
			vet[x] = leia.nextInt();
			soma=soma+vet[x];
			if (vet[x]>maior)
			{
				maior=vet[x];
			}
			
			
		}
		
		System.out.println("\nA soma dos valores é: "+soma);
		System.out.println("\nO maior valor é: "+maior);
		
		for(int x=0;x<5;x++)
			System.out.println(vet[x]);
		
	}

}
