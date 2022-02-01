/*
 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */

package ListaExercicios3;

public class Exercicio3Matriz {

	public static void main(String[] args) {

		int N1[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 12, 11, 10, 9, 8, 7 }, { 6, 5, 4, 3, 2, 1 } };// Pré detrminando os elemtnso da matriz
		int N2[][] = { { 1, 3, 7, 11, 13, 17 }, { 19, 23, 29, 31, 37, 43 }, { 12, 11, 10, 9, 8, 7 },
				{ 1, 2, 3, 4, 5, 6 } };//pré determinando os elemetnos da matriz
		int M1[][] = new int[4][6];//criando matriz vazia
		int M2[][] = new int[4][6];//cirando matriz vazia
		int x, y;

		// printando n1
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++) {
				System.out.print(N1[x][y] + "\t");
			}
			System.out.print("\n");

		}
		// printando n2
		for (x = 0; x < 4; x++) {
			System.out.print("\n");

			for (y = 0; y < 6; y++) {
				System.out.print(N2[x][y] + "\t");
			}
			System.out.print("\n");
		}
		// operando adição
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++)

			{
				M1[x][y] = N1[x][y] + N2[x][y];

			}
		}
		// operando subtração
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++)

			{
				M2[x][y] = N1[x][y] - N2[x][y];

			}
		}
		// printando M1
		for (x = 0; x < 4; x++) 
		{
			System.out.print("\n");
			for (y = 0; y < 6; y++) {
				System.out.print(M1[x][y] + "\t");
			}
			System.out.print("\n");

		}
		// printando M2
		for (x = 0; x < 4; x++) 
		{
			System.out.print("\n");

			for (y = 0; y < 6; y++) {
				System.out.print(M2[x][y] + "\t");
			}
			System.out.print("\n");
		}

	}
}
