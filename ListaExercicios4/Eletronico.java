package ListaExercicios4;

public class Eletronico {

	//ATRIBUTOS
		String nome_do_produto;
		String n_compra;
		String tipo_produto;
		float valor_produto;
		
		//METODO CONSTRUTOR
		
		public Eletronico (String nome, String n_compra,String tipo_produto, float v)
		{
			
			this.nome_do_produto = nome;
			this.n_compra = n_compra;
			this.tipo_produto = tipo_produto;
			this.valor_produto = v;
				
		}
		//METODO VOID ()
		public void consultar()
		{
			System.out.println("\nCadastre aqui o nome do produto: "+ this.nome_do_produto);
			System.out.println("\nInsira o número da compra: "+this.n_compra);
			System.out.println("\nInsira aqui o tipo de eletrônico "+ this.tipo_produto);
			System.out.println("\nO Valor da compra é: " + this.valor_produto);
		
		}
		
	}
