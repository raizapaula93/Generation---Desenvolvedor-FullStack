/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */

package ListaExercicios4;

public class Cliente {
	
	//ATRIBUTOS
	String nome;
	String n_compra;
	float valor_compra;
	
	//METODO CONSTRUTOR
	
	public Cliente (String nome, String n_compra, float v)
	{
		
		this.nome = nome;
		this.n_compra = n_compra;
		this.valor_compra = v;
			
	}
	//METODO VOID ()
	public void cadastrar()
	{
		System.out.println("\nCadastre o nome aqui: "+ this.nome);
		System.out.println("\nInsira o n�mero da compra: "+this.n_compra);
		
		if(this.valor_compra<0)
		 
			System.out.println("\nColoque um valor v�lido de compra: "+ this.valor_compra);
		
		else
			System.out.println("\n O Valor da compra �: " + this.valor_compra);
	
	}
	
}
