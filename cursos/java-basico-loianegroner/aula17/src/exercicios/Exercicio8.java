package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Fa�a um programa que leia cinco n�meros e informe 
		// a soma e a m�dia dos n�meros: 
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int media;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite um n�mero: ");
			numero = scanner.nextInt();
			soma = soma + numero;
		}
		
		media = soma / 5;
		
		System.out.println("A soma dos n�meros �: " + soma);
		System.out.println("A m�dia dos n�meros �: " + media);
		
		scanner.close();
	}
}