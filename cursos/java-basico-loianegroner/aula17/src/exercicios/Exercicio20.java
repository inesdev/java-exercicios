package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa
		// dever� verificar se a idade da turma varia entre 0 e 25, 26 e 60 e maior que 60
		// e ent�o dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de idades: ");
		int quantidadeIdades = scanner.nextInt();
		
		double soma = 0;
		double media = 0;
		int idade = 0;
		
		for(int i = 0; i < quantidadeIdades; i++) {
			System.out.print("Digite a " + (i+1) + "� idade: ");
			idade = scanner.nextInt();
			soma = soma + idade;
		}
		
		media = soma / quantidadeIdades;
		
		System.out.println("\nM�dia de idade da turma: " + media);
		
		if(media >= 0 && media <= 25) {
			System.out.println("\nTurma Jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("\nTurma Adulta");
		} else if (media >= 61) {
			System.out.println("\nTurma Idosa");
		}
		
		scanner.close();
	}
}