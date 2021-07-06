package exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule e mostre a m�dia aritm�tica de N notas:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o total de notas para calculo da m�dia: ");
		int notas = scanner.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for(int i = 0; i < notas; i++) {
			System.out.print("Digite a " + (i+1) + "� nota: ");
			nota = scanner.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
		
		scanner.close();
	}
}