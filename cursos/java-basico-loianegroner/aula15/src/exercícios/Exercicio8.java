package exerc�cios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto comprar,
		// sabendo que a decis�o � sempre pelo mais barato.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do primeiro produto: ");
		double produto1 = scanner.nextDouble();
		
		System.out.println("Digite o pre�o do segundo produto: ");
		double produto2 = scanner.nextDouble();
		
		System.out.println("Digite o pre�o do terceiro produto: ");
		double produto3 = scanner.nextDouble();
		
		if ((produto1 < produto2) && (produto1 < produto3)) {
			System.out.println("O primeiro produto � o mais barato, � este que voc� deve comprar!");
		} else if ((produto2 < produto1) && (produto2 < produto3)) {
			System.out.println("O segundo produto � o mais barato, � este que voc� deve comprar!");
		} else {
			System.out.println("O terceiro produto � o mais barato, � este que voc� deve comprar!");
		}
		
		scanner.close();
	}
}