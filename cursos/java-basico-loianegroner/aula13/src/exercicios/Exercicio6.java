package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a um raio de um c�rculo, calcule e mostre a sua �rea:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo: ");
		double raio = scanner.nextDouble();
		
		final double pi = 3.1415;
		double area = pi * raio * raio;
		
		System.out.println("A �rea do c�rculo � " + area);
		
		scanner.close();
	}
}