package exerc�cios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a um n�mero inteiro e determine se ele � impar ou par:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par!");
		} else {
			System.out.println("O n�mero " + numero + " � impar!");
		}
		
		scanner.close();
	}
}