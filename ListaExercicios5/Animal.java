/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
 */

package ListaExercicios5;

public class Animal { //SUPER CLASSE
		
		//ATRIBUTOS
		private int idade;
		private String nome;
		private boolean emitir_som;
	
		//METODO CONSTRUTOR
		public Animal (String nome, int idade, boolean som)
		{
			this.nome= nome;
			this.idade= idade;
			this.emitir_som= som;
				
		}
		//GET AND SET - METODOS "PUBLICOS" -> PODEM SER CHAMADOS POR OUTRAS API'S
		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean isEmitir_som() {
			return emitir_som;
		}

		public void setEmitir_som(boolean emitir_som) {
			this.emitir_som = emitir_som;
		}
		

}
