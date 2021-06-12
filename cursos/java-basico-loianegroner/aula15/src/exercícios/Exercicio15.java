package exerc�cios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a os 3 lados de um triangulo. O programa dever� informar
		// se os valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, 
		// se o mesmo �: equil�tero, is�sceles ou escaleno:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do primeiro lado do tri�ngulo: ");
		double lado1 = scanner.nextDouble();
		
		System.out.println("Digite o tamanho do segundo lado do tri�ngulo: ");
		double lado2 = scanner.nextDouble();
		
		System.out.println("Digite o tamanho do terceiro lado do tri�ngulo: ");
		double lado3 = scanner.nextDouble();
		
		if (((lado1 + lado2) > lado3) ||
			((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Este tri�ngulo � Equil�tero!");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) { 
				System.out.println("Este tri�ngulo � Is�sceles!");
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("Este tri�ngulo � Escaleno!");
			}
			
		} else {
				System.out.println("N�o forma um tri�ngulo");
				}
		
		scanner.close();
	}
}