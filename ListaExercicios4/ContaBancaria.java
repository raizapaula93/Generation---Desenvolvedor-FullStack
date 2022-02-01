package ListaExercicios4;

public class ContaBancaria {
	//ATRIBUTOS
			String nome_cliente;
			String senha;
			float saldo;
			
			//METODO CONSTRUTOR
			
			public ContaBancaria (String nome, String senha)
			{
				
				this.nome_cliente = nome;
				this.senha = senha;
									
			}
			//METODO VOID ()
			public void logar()
			{
				System.out.println("\nDigite seu nome:"+ this.nome_cliente);
				
				if(this.senha.length()==6) 
				{  
					System.out.println("\n"+this.senha);
						
							
					System.out.println("\nSaldo em conta: "+ this.saldo);}
					
						
				else 
					System.out.println("\nInsira a senha correta! ");
				}

			}
			

	
	

