/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package ListaExercicios4;

public class Aviao {
	//ATRIBUTOS
		String empresa;
		String n_voo;
		float valor_compra;
		boolean decolagem;
		
		//METODO CONSTRUTOR
		
		public Aviao (String empresa, String n_voo, float v)
		{
			
			this.empresa = empresa;
			this.n_voo = n_voo;
			this.valor_compra = v;
				
		}
		//METODO VOID ()
		
		public void decolar()
		{
			this.decolagem=true;
		}
		
		public void subir()
		{
			this.decolagem=false;
		}
		
		
		public void embarcar()
		{
			System.out.println("\nCadastre o nome aqui: "+ this.empresa);
			System.out.println("\nInsira o n�mero do vo�: "+this.n_voo);
			System.out.println("\nInsira o valor da compra: "+this.valor_compra);
			if(this.decolagem==false)
			 
				System.out.println("\nO avi�o ainda n�o partiu!");
			
			else
				System.out.println("\n O avia� j� partiu! ");
		
		}
		
	}

