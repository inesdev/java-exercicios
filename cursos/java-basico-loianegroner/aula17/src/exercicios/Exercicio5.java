package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Altere o programa anterior permitindo o usu�rio informar as 
		// popula��es e as taxas de crescimento iniciais. Valide a entrada 
		// e permita reptir a opera��o:
		
		Scanner scanner = new Scanner(System.in);
		
		double paisA;
		double paisB;
		double taxaPaisA;
		double taxaPaisB;
		
		boolean valido = false;
		do {
			System.out.print("Digite a quantidade de habitantes do Pa�s A: ");
			paisA = scanner.nextDouble();
			
			if (paisA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o do Pa�s A precisa ser maior que zero.");
			}
		} while (!valido);
		
		
		valido = false;
		do {
			System.out.print("Digite a quantidade de habitantes do Pa�s B: ");
			paisB = scanner.nextDouble();
			
			if (paisB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o do Pa�s B precisa ser maior que zero.");
			}
		} while (!valido);
		
		
		valido = false;
		do {
			System.out.print("Digite a taxa de crescimento anual do Pa�s A: ");
			taxaPaisA = scanner.nextDouble();
			
			if (taxaPaisA > 0) {
				valido = true;
			} else {
				System.out.print("Taxa de crescimento do Pa�s A precisa ser maior que zero.");
			}
		} while (!valido);
		
		
		valido = false;
		do {
			System.out.print("Digite a taxa de crescimento anual do Pa�s B: ");
			taxaPaisB = scanner.nextDouble();
			
			if (taxaPaisB > 0) {
				valido = true;
			} else {
				System.out.print("Taxa de crescimento do Pa�s B precisa ser maior que zero.");
			}
		} while (!valido);
		
		
		int anos = 0;
		while (paisA < paisB) {
			paisA += (paisA / 100) * taxaPaisA;
			paisB += (paisB / 100) * taxaPaisB;
			anos++;
		}
		
		System.out.println("Pa�s A: " + paisA);
		System.out.println("Pa�s B: " + paisB);
		System.out.println("Quantidade de anos: " + anos);
		
		scanner.close();
	}	
}