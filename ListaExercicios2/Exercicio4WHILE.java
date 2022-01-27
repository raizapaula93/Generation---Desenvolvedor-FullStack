/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 * 
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

 * 
 */
package ListaExercicios2;

import java.util.Scanner;

public class Exercicio4WHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, genero,temp;
		int i=1;
		int pnerv40;
		int p_calm=0, m_nerv=0,h_ag= 0,o_calm = 0, pnerv401 = 0,p_calm18 = 0; 
		
		while(i<=150) 
		{
			System.out.println("\nPesquisa n�: "+i);
			
			System.out.println("\nDigite a idade da pessoa pesquisada abaixo:");
			idade = leia.nextInt();
			System.out.println("\nDigite o genero da pessoa pesquisada:1 - feminino, 2 - masculino, 3 - outros");
			genero = leia.nextInt();
			System.out.println("\nDigite o temperamento da pessoa pesquisada:1 - calmo, 2 - nervoso, 3 - agressivo");
			temp = leia.nextInt();
			
			if(temp==1) {
			
				p_calm++;
			}
			if(genero == 1 && temp ==2) {
				
				m_nerv++;
				
			}
			if(genero ==2 && temp ==3) {
				
				h_ag++;
			}
			if(genero ==3 && temp ==1) {
				
				o_calm++;
			}
			if(temp ==2 && idade>40) {
				
				pnerv401++;
			}	
			if(temp ==1 && idade<18) {
				
				p_calm18++;
			}
		
			i++;
		}
		System.out.println("\n----------RELAT�RIO DE PESQUISA------- ");
		System.out.println("\no n�mero de pessoas calmas;"+p_calm+ "\r\n"
				+ "o n�mero de mulheres nervosas; "+m_nerv+" \r\n"
				+ "o n�mero de homens agressivos; "+h_ag+ "\r\n"
				+ "o n�mero de outros calmos; "+o_calm+"\r\n"
				+ "o n�mero de pessoas nervosas com mais de 40 anos; "+pnerv401+"\r\n"
				+ "o n�mero de pessoas calmas com menos de 18 anos. "+p_calm18);
	}
}	


