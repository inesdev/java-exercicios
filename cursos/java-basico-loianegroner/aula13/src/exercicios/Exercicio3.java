package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a dois n�meros e imprima a soma: 
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite um n�mero: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		numero2 = scanner.nextInt();
		
		System.out.println("A soma dos n�meros digitados �: " + (numero1 + numero2));
		
		scanner.close();
	}
}