package exerc�cios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fa�a um programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite mais um n�mero: ");
		int numero3 = scanner.nextInt();
		
		if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("\nO maior n�mero �: " + numero1);
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("\nO maior n�mero �: " + numero2);
		} else {
			System.out.println("\nO maior n�mero �: " + numero3);
		}
	
		scanner.close();
	}
}