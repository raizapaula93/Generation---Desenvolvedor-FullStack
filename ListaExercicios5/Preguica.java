package ListaExercicios5;

public class Preguica extends Animal {
	private String acao;

	public Preguica(String nome, int idade, boolean som, String acao)
	{
		super(nome, idade, som);
		this.acao = acao;
		
	}
	public String getAcao() 
	{
		return acao;
	}

	public void setAcao(String acao) 
	{
		this.acao = acao;
	}
	
	
}
