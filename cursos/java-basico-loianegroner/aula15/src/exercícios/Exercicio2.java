package exerc�cios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("Este n�mero � negativo!");
		} else if (numero == 0) {
			System.out.println("Zero � neutro!");
		} else {
			System.out.println("Este n�mero � positivo!");
		}
		scanner.close();
	}
}