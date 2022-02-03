package ListaExercicios5;

public class TodosAnimais {

	public static void main(String[] args) 
	{
		Animal cao = new Cachorro("Pluto",10,true, "Correr");
		Animal ponei = new Cavalo("Spirit",2,true, "Relinchar");
		Animal pregui = new Preguica("Soninho",6 ,false, "Balidos");
		
		System.out.println(pregui.getNome());
		
		
	}
	
}
