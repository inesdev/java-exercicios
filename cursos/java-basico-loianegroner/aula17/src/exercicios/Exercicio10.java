package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Fa�a um programa que receba dois n�meros	inteiros e gere os
		// n�meros inteiros que est�o no intervalo compreendido por eles:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();
		
		for (int i = numero1; i <= numero2; i++) {
			System.out.println(i);
		}
		scanner.close();
	}
}