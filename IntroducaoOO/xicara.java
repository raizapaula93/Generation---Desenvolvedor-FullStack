package IntroducaoOO;

public class xicara {
	
		//ATRIBUTOS
		String cor;
		String tamanho;
		float capacidade;
		String material;
		boolean cheia;
		String formato;
		
		//METODOS
		public void encher()
		{
			
			this.cheia= true;
			
		}
		public void esvaziar()
		{
			
			this.cheia= false;
			
		}
		public void recarregar()
		{	
			if(this.cheia==false)
			
				System.out.println("\nOpa, encha  a caneca novamente!!!");
			else
				System.out.println("\n a caneca está cheia, continue bebendo!");
		}
		public void status()
		{
			System.out.println("A cor da caneca é: "+this.cor);
			System.out.println("O tamanho da caneca é: "+this.tamanho);
			System.out.println("Está cheia? "+this.cheia);
			System.out.println("Formato: "+this.formato);
			System.out.println("O material da caneca é: "+this.material);
		}
	}

