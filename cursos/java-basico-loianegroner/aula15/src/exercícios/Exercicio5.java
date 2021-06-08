package exerc�cios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Fa�a um programa para a leitura de duas notas parciais de um aluno.
		// O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		// - A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		// - A mensagem "Reprovado" se a m�dia for menor do que sete;
		// - A mensagem"Aprovado com Distin��o", se a m�dia for igual a dez.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("\nSua m�dia �: " + media);
		
		if (media == 10) {
			System.out.println("\nAprovado com Distin��o. Parab�ns!");
		} else if (media < 7) {
			System.out.println("\nReprovado!");
		} else if (media >= 7) {
			System.out.println("\nAprovado!");
		}
		scanner.close();
	}
}