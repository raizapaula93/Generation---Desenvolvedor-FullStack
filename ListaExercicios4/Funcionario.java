/*
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */
package ListaExercicios4;

public class Funcionario {
	
	//ATRIBUTOS
	String nome_funcionario;
	String matricula;
	String setor;
	float salario;
	
	//METODO CONSTRUTOR
	
	public Funcionario (String nome, String matricula,String setor, float s)
	{
		
		this.nome_funcionario = nome;
		this.matricula = matricula;
		this.setor = setor;
		this.salario = s;
			
	}
	//METODO VOID ()
	public void consultar()
	{
		System.out.println("\nNome do funcionario: "+ this.nome_funcionario);
		
		if(this.matricula.length()==6)  
			System.out.println("\nMatr�cula: "+this.matricula);
		
		else 
			System.out.println("\nInsira o n�mero de matr�cula com 6 d�gitos: ");
		
		System.out.println("\nSetor: "+ this.setor);
		System.out.println("\nInpute o salario: " + this.salario);
	
	}
	
}


