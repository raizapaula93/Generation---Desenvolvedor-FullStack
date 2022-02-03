package ListaExercicios5;

public class CavaloPoli extends AnimalPoli {
	public void movimentar()
	{					
		System.out.println("\nCorrendo");
				
	}
	@Override
	public void nome()
	  {
		  System.out.print("\nNome: Ponei");
	  }
	 @Override
	  public void idade()
	  {
		  System.out.print("\nIdade: "+ 9);
	  }
	
	 @Override	
	  public void emitirSom()
	  {
		  System.out.print("\nRelinchar");
	  }
	  
	  
}
	

