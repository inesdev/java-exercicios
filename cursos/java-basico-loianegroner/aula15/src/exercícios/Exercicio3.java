package exerc�cios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Fa�a um programa que verifique se a letra digitada � "F" ou "M". 
		// Conforme a letra escrever: F - Feminino, M - M�sculino, Sexo Inv�lido!

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o sexo F ou M: ");
		String letra = scanner.nextLine();
		
		if (letra.equalsIgnoreCase("F")) {
			System.out.println("Sexo F - Feminino");
		} else if (letra.equalsIgnoreCase("M")){
			System.out.println("Sexo M - M�sculino");
		} else {
			System.out.println("Sexo Inv�lido!");
		}
		scanner.close();
	}
}