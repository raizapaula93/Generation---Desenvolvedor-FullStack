package ListaExercicios5;

public class Cavalo extends Animal {
	private String acao;

	public Cavalo(String nome, int idade, boolean som, String acao)
	{
		
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
