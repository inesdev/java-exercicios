package exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// Encontrar n�meros primos � uma tarefa dif�cil. Fa�a um programa que gere
		// uma lista de n�meros primos existentes entre 1 e um n�mero inteiro que o  
		// usu�rio informar:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		boolean primo = true;
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
			}
			scanner.close();
		}
	}
}