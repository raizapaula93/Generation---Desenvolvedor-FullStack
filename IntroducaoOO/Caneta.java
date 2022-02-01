/*
 * Caracter�sticas -> atributos ->variaveis
 * Comportamentos - m�todos -> fun��es -> coisas q seu objeto faz
 * Metodo void -> ele executa uma a��o mas ele nao retorna um resultado de volta
 */
package IntroducaoOO;

public class Caneta {
	
	//ATRIBUTOS
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//M�TODOS
	
	public Caneta() // -> m�todo construtor - precisa ter o nome da classe -> estou determinando o padr�o dessa classe para o atributo tampado
	{				//qundo cria o objeto, ele j� vem com o construtor
		this.tampada=true;
			
	}
	
	public void tampar() 
	{
		this.tampada= true;//atribuindo valor � vari�vel tampada
	}
	public void destampar() 
	{
		this.tampada= false;//atribuindo valor � vari�vel tampada
	}
	public void escrever() 
	{
		
		
			if(this.tampada==true)
				System.out.println("ERRO!!! Caneta est� tampada!!!");
			else
				System.out.println("Escrevendo....");
		
	}
	public void status()
	{
		System.out.println("A cor da caneta �: "+this.cor);
		System.out.println("A ponta �: "+this.ponta);
		System.out.println("Est� tampada? "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}
}