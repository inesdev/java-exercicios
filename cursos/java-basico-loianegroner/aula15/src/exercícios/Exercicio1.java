package exerc�cios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a dois n�meros e imprima o maior deles:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior n�mero �: " + numero1);
		} else {
			System.out.println("O maior n�mero �: " + numero2);
		}
		scanner.close();
	}
}
