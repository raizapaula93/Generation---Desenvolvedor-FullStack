/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */

package ListaExercicios3;

import java.util.Random;//biblioteca de sorteio
import java.util.Scanner;//biblioteca de entrada de dados

public class Exercicio2Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random dado = new Random();
		
		int lanca[]= new int[10];//criando vetor vazio
		int x1=0;//cirando variável contadora
		int cont_maior = 0;//criando variável que irá receber numero maior a partir do teste
		int somalanca= 0;//criando variável de soma
		int media = 0;//criando avriavel que ria receber media
		
		System.out.println("Jogue o dado 10 vezes:");//interaçao com ux
		for (x1=0;x1<10;x1++)// o contador iniciando em 0, rodando 10 vezes, com salto de 1 em 1
		{					//ou seja, 10 jogadas
			
			lanca[x1] = dado.nextInt(6)+1;//função chamda da biblioteca para sortear - função de preenchimento
			somalanca =somalanca+ lanca[x1];//a cada laço, a variavel soma ira receber o valor atribuido a ela anteriormente+a o valor da estrutura da variavel contadora(vetor)
			
			
			if (lanca[x1]==6)//se o valor do loop da estrutura do contador for igual a 6
			{
				cont_maior++;// a cada laço V, a variavel cont_maior ira receber o valor de estrutura da variavel contadora
				
				
				}
		}
		for (x1=0;x1<10;x1++)
		{
			System.out.println((lanca[x1]));// a cada laço , a variavel cont_maior ira imprimir o valor de estrutura da variavel contadora
			
		}
		media = somalanca/10;//a media//calculo va variavel soma dividido pelo valor de loops(vezes que a variavel contadora foi acionada)
		System.out.println("\nA média dos lançamentos é: "+(media));
		System.out.println("\nA quantidade de vezes que o maior valor apareceu: "+(cont_maior));
	}

}
