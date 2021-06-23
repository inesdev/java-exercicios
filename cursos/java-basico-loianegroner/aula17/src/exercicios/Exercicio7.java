package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Fa�a um programa que leia cinco n�meros e informe o n�mero maior:
		
		Scanner scanner = new Scanner(System.in);
		
		int numero; 
		int maiorNumero = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um n�mero: ");
			numero = scanner.nextInt();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}	
		}
		
		System.out.println("O maior n�mero digitado foi: " + maiorNumero);
		scanner.close();
	}
}