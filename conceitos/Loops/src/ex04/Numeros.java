package ex04;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		System.out.println("1. Fa�a um algoritmo que imprima todos os n�meros inteiros de 1 a N (fornecido pelo usu�rio). ");
		
		int n; 
		
		System.out.println("\nDigite um n�mero: ");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
