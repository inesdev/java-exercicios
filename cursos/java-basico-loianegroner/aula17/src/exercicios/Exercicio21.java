package exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule o n�mero m�dio de alunos por turma.
		// Para isto, pe�a a quantidade de turmas e a quantidade de alunos 
		// para cada turma. As turmas n�o poder�o ter mais de 40 alunos:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de turmas: ");
		int turmas = scanner.nextInt();
		
		int alunos;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 1; i <= turmas; i++) {
			
			invalido = true;
			do {
				System.out.print("Digite o n�mero de alunos da " + i + "� turma: ");
				alunos = scanner.nextInt();
				
				if (alunos <= 40) {
					invalido = false;
			
				} else {
					System.out.println("N�mero de alunos invalido! Digite novamente.");
				}
			} while (invalido);
			
			soma = soma + alunos;
		}
		
		double media = soma / turmas;
		
		System.out.println("M�dia: " + media);
		scanner.close();
	}
}