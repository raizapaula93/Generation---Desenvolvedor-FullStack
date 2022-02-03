package ListaExercicios5;

public class TodosAnimaisPoli {

	public static void main(String[] args) {
		
		CachorroPoli cachorro = new CachorroPoli();
		CavaloPoli cavalo = new CavaloPoli();
		PreguicaPoli preguica = new PreguicaPoli();
		
		
		cachorro.nome();
		cachorro.idade();
		cachorro.emitirSom();
		cachorro.movimentar();
		cachorro.line();
		
		cavalo.nome();
		cavalo.idade();
		cavalo.emitirSom();
		cavalo.movimentar();
		cavalo.line();
		
		preguica.nome();
		preguica.idade();
		preguica.emitirSom();
		preguica.movimentar();
		preguica.line();
		

	}

}
