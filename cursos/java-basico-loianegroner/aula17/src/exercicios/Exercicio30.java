package exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que
		// ser� digitado pelo usu�rio, mas a tabuada n�o deve necessariamente iniciar em 1
		// e terminar em 10, o valor inicial e o final devem ser informados tamb�m pelo usu�rio:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero o qual voc� deseja ver a tabuada: ");
		int numero = scanner.nextInt();
		
		int inicio;
		int fim;
		boolean invalido = false;
		int produto = 0;
		
		do {
			System.out.print("Digite o n�mero inicial da tabuada: ");
			inicio = scanner.nextInt();
			
			System.out.print("Digite o n�mero final da tabuada: ");
			fim = scanner.nextInt();
			
			if (fim > inicio) {
				invalido = true;
			}
			
		} while (!invalido);
		
		System.out.println("Tabuada do: " + numero);
		System.out.println("Come�ar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		
		for (int i = inicio; i <= fim; i++) {
			produto = numero * i;
			System.out.println(numero + " X " + i + " = " + produto);
		}
		scanner.close();
	}
}