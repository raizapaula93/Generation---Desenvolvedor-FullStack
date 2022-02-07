/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

package ListaExercicios5;

import java.util.ArrayList;

public class Lista {
					
	public static void main (String[]args) {
			String pao1 = "Franc�s";// cria��o de vari�veis
			String pao2 = "Pao de queijo"; // cria��o de vari�veis
			String pao3 = "Recheado";// cria��o de vari�veis
			String pao4 = "Italiano";// cria��o de vari�veis
			
			ArrayList<String> padaria = new ArrayList<>();//cria objeto lista
			
			System.out.println(padaria);//printa objeto lista - vazio
			
			padaria.add("Sonho");//Armazena dados dos objetos na list
			padaria.add(pao1);
			padaria.add(pao2);
			padaria.add(pao3);
			padaria.add(pao4);
			
			System.out.println(padaria); //printa dados da lista - preenchida
			
			padaria.clear(); // remove todos os elementos do array
			
				
			System.out.println(padaria);
			
			padaria.add(pao1);//adiciona elementos no array vazio
						
			System.out.println(padaria);
			padaria.set(0, pao4);//atualiza elemento na posi��o do array ja preenchida
			System.out.println(padaria);
	}
}