package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [numero]:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int numero = scanner.nextInt();
		
		System.out.println("O n�mero informado foi: " + numero);
		
		scanner.close();
	}
}