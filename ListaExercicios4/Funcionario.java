/*
 * 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
			System.out.println("\nMatrícula: "+this.matricula);
		
		else 
			System.out.println("\nInsira o número de matrícula com 6 dígitos: ");
		
		System.out.println("\nSetor: "+ this.setor);
		System.out.println("\nInpute o salario: " + this.salario);
	
	}
	
}


