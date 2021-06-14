package exerc�cios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// Fa�a um programa que fa�a cinco perguntas para uma pessoa 
		// sobre um crime. As perguntas s�o:
		// a) Telefonou para a v�tima?
		// b) Esteve no local do crime?
		// c) Mora perto da v�tima?
		// d) Devia para a v�tima?
		// e) J� trabalhou com a v�tima?
		
		// O programa deve no final emitir uma classifica��o sobre a 
		// participa��o da pessoa no crime. Se a pessoa responder 
		// positivamente a 2 quest�es ela deve ser classificada como
		// "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassino".
		// Caso contr�rio, ele ser� classificado como "Inocente".
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- INVESTIGADOR DIGITAL -----");
		System.out.print("\nTelefonou para a v�tima? ");
		String resposta1 = scanner.next();
		
		System.out.print("Esteve no local do crime? ");
		String resposta2 = scanner.next();
		
		System.out.print("Mora perto da v�tima? ");
		String resposta3 = scanner.next();
		
		System.out.print("Devia para a v�tima? ");
		String resposta4 = scanner.next();
		
		System.out.print("J� trabalhou com a v�tima? ");
		String resposta5 = scanner.next();
				
		int soma = 0;
		
		if (resposta1.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta2.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta3.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta4.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta5.equalsIgnoreCase("Sim")) {
			soma++;
		}
		
		if (soma == 2) {
			System.out.println("\nEsta pessoa � suspeita!");
		} else if (soma == 3 || soma == 4) {
			System.out.println("\nEsta pessoa � cumplice!");
		} else if (soma == 5) {
			System.out.println("\nEsta pessoa � o assassino!");
		} else if (soma == 0 || soma == 1) {
			System.out.println("\nEsta pessoa � inocente!");
		}
		
		scanner.close();
	}
}