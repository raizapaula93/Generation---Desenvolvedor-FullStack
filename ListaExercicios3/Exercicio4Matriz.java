/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */

package ListaExercicios3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma =0, d = 0;		
		int m1[][] = new int [3][3];
		
		for (int x=0;x<3;x++)//preenchendo a matriz
		{
			for(int y=0;y<3;y++)
			{
				System.out.println("Digite aqui para preencher a matriz ");
				m1[x][y] = leia.nextInt();
			}
		}
		
		for (int x=0;x<3;x++) //somando os valores da minha matriz
		{
			for(int y=0;y<3;y++)
			{
				soma= soma+m1[x][y];
				
			}
		}
		for (int x=0; x<3; x++) //somando os valores da diagonal
		{						
			for (int y=0; y<3; y++) 
			{
				if (x == y) 
				{
					d = d + m1[x][y]; 
				}
			}
		}
		System.out.println("\nA soma dos elementos da matriz é: "+soma);
		System.out.println("\nA soma da diagonal principal da matriz é: "+d);
		
		leia.close();
	}
}

