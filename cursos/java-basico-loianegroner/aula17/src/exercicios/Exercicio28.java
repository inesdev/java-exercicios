package exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// Os n�meros primos possuem v�rias aplica��es dentro da Computa��o, por exemplo na Criptografia.
		// Um n�mero primo � aquele que � divis�vel apenas por um e por ele mesmo. Fa�a um programa que 
		// pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("N�mero n�o � primo!");
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("N�mero � primo!");
		}
		scanner.close();
	}
}