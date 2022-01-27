/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */
package ListaExercicios2;

public class Exercicio1FOR {

	public static void main(String[] args) {
		int i = 1000;
		
		for (i=1000; i <= 1999; i++)
		{	
			while (i%11==5)
			{
				System.out.println("\t"+i);	
				i+=1;
			}
		
		}
	}

}
