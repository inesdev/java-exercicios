package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a dois n�meros, base e expoente,
		// calcule e mostre o primeiro n�mero elevado ao segundo n�mero:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		int base = scanner.nextInt();
		
		System.out.print("Digite a pot�ncia: ");
		int potencia = scanner.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i < potencia; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}
}