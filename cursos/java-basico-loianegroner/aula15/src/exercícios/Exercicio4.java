package exerc�cios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fa�a um programa que verifique se uma letra digitada � vogal ou consoante.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scanner.next();
		
		if (letra.equalsIgnoreCase("A") 
			|| letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
			|| letra.equalsIgnoreCase("O") ||  letra.equalsIgnoreCase("U")) {
				System.out.println("Esta letra � uma Vogal!");
		} else {
			System.out.println("Esta letra � uma Consoante!");
		}
		scanner.close();
	}
}