package VetorEMatriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int mat[][] = {{1,2,3},{4,5,6}};
		int mat2[][] = new int[2][3];
		
		for(int linha=0; linha<2; linha++)
		{
			for(int coluna=0; coluna<2; coluna++)
			{
				System.out.println("Digite um número");
				mat2[linha][coluna] = leia.nextInt();
				
			}
		}
		for (int x=0; x<2; x++)
		{
			for (int y=0; y<3; y++)
			{	
				System.out.print(mat[x][y]+"\t");
			}	
			System.out.print("\n");
		}
		for (int x=0; x<2; x++)
		{
			for (int y=0; y<3; y++)
			{	
				System.out.print(mat2[x][y]+"\t");
			}	
			System.out.print("\n");
		}
	}

}
