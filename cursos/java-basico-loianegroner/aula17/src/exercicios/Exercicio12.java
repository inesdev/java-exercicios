package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Desenvolva um gerador de tabuada, capaz de gerar a tabuada
		// de qualquer n�mero inteiro entre 1 a 10. O usu�rio deve informar
		// de qual n�mero ele deseja ver a tabuada:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero o qual voc� deseja ver a tabuada: ");
		int numero = scanner.nextInt();
		
		int produto = 0;
		for (int i = 1; i <= 10; i++) {
			produto = numero * i;
			System.out.println(numero + " X " + i + " = " + produto);
		}
		scanner.close();
	}
}