package exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int numeroInteiro = scanner.nextInt();
		
		System.out.println("Fatorial de " + numeroInteiro);
		
		System.out.print(numeroInteiro + "! = ");
		
		int fatorial = 1;
		for(int i = numeroInteiro; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print(" 1 = " + fatorial);
		
		scanner.close();
	}
}