package ListaExercicios4;

public class Paciente {

	//ATRIBUTOS
	String nome_paciente;
	String prontuario;
	boolean vivo;
	
	//METODO CONSTRUTOR
	
	public Paciente (String nome, String prontuário)
	{
		
		this.nome_paciente = nome;
		this.prontuario = prontuário;
		
							
	}
	//METODO VOID ()
	public void recuperar()
	{
		this.vivo=true;
	}
	
	public void encaminhar()
	{
		this.vivo=false;
	}
	
	
	public void consultar()
	{
		System.out.println("\nNome do paciente:"+ this.nome_paciente);
		System.out.println("\nNº do prontuário:"+ this.prontuario);
		
		
		if(this.vivo==true) 
		  
			System.out.println("\nO paciente está se recuperando");
					
				
		else 
			System.out.println("\nO paciente veio à óbito, sentimos muito!");
		
		}

	}	
	

