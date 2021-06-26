package exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// A s�rie de Fibonacci � formada pela sequ�ncia 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
		// Fa�a um programa capaz de gerar a s�rie at� o n-�simo termo.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o n-�simo termo da s�rie de Fibonacci: ");
		int n = scanner.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		for (int i = 3; i <= n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		scanner.close();
	}
}