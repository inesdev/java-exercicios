package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Fa�a um programa que receba dois n�meros	inteiros, gere os n�meros inteiros 
		// que est�o no intervalo compreendido por eles e mostre a soma destes n�meros:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();
		
		int soma = 0;
		for (int i = numero1; i <= numero2; i++) {
			soma = soma + i;			
		}
		
		System.out.println(soma);
		scanner.close();
	}
}