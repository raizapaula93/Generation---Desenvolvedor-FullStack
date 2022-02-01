/*
 * Características -> atributos ->variaveis
 * Comportamentos - métodos -> funções -> coisas q seu objeto faz
 * Metodo void -> ele executa uma ação mas ele nao retorna um resultado de volta
 */
package IntroducaoOO;

public class Caneta {
	
	//ATRIBUTOS
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//MÉTODOS
	
	public Caneta() // -> método construtor - precisa ter o nome da classe -> estou determinando o padrão dessa classe para o atributo tampado
	{				//qundo cria o objeto, ele já vem com o construtor
		this.tampada=true;
			
	}
	
	public void tampar() 
	{
		this.tampada= true;//atribuindo valor à variável tampada
	}
	public void destampar() 
	{
		this.tampada= false;//atribuindo valor à variável tampada
	}
	public void escrever() 
	{
		
		
			if(this.tampada==true)
				System.out.println("ERRO!!! Caneta está tampada!!!");
			else
				System.out.println("Escrevendo....");
		
	}
	public void status()
	{
		System.out.println("A cor da caneta é: "+this.cor);
		System.out.println("A ponta é: "+this.ponta);
		System.out.println("Está tampada? "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}
}