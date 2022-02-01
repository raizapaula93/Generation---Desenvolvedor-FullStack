/*
 * 5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package ListaExercicios4;

public class Patinete {

	//ATRIBUTOS
		String cor;
		String tamanho;
		float price;
		
		//METODO CONSTRUTOR
		
		public Patinete (String cor, String tamanho,float p)
		{
			
			this.cor = cor;
			this.tamanho = tamanho;
			this.price = p;
				
		}
		//METODO VOID ()
		public void consultar()
		{
			System.out.println("\nCor do produto:"+ this.cor);
			System.out.println("\nTamanho: "+ this.tamanho);
			System.out.println("\nPreço: " + this.price);
		
		}
		
	}
	

