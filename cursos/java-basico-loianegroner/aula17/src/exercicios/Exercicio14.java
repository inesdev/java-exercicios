package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a dez n�meros inteiros, calcule e mostre
		// a quantidade de n�meros pares e quantidade de n�meros �mpares:
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int quantPares = 0;
		int quantImpares = 0;
		
		for (int i = 0; i < 10; i ++) {
			System.out.print("Digite um n�mero: ");
			numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				quantPares = quantPares + 1;
			} else {
				quantImpares = quantImpares + 1;
			}
		
		}
		
		System.out.println("Quantidade de n�meros pares: " + quantPares);
		System.out.println("Quantidade de n�meros �mpares: " + quantImpares);
		
		scanner.close();
	}
}