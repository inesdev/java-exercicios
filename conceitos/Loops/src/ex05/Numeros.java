package ex05;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um algoritmo que leia um n�mero N, "
				+ "some todos os n�meros inteiros de 1 a N, e mostre \r\n" 
				+ "o resultado obtido.");
		
		int n; 
		int soma = 0;
		
		System.out.println("\nDigite um n�mero: ");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {		
			soma = soma + i;
		}
		
		System.out.println("\n A soma dos valores inteiros de 1 a " + n + " �: " + soma);
		scanner.close();
	}
}
