package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio: 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do quadrado: ");
		int base = scanner.nextInt();
		
		int area = base * base;
		
		int dobro = area * 2;
		
		System.out.println("O dobro da �rea do quadrado � " + dobro);
		
		scanner.close();
	}
}