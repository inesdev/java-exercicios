package exerc�cios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a um n�mero correspondente a um determinado
		// ano e em seguida informe se este ano � ou n�o bissexto:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = scanner.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("O ano de " + ano + " � bissexto!");
		} else {
			System.out.println("O ano de " + ano + " n�o � bissexto!");
		}
		
		scanner.close();
	}
}