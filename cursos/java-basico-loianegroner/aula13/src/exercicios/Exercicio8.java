package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Fa�a um programa que pergunte quanto uma pessoa ganha 
		// por hora e o n�mero de horas trabalhadas no m�s. 
		// Calcule e mostre o total do sal�rio no referido m�s:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double hora = scanner.nextDouble();
		
		System.out.println("Digite o total de horas trabalhadas no m�s: ");
		double totalHoras = scanner.nextDouble();
		
		double salario = hora * totalHoras;
		
		System.out.println("O sal�rio deste m�s ser�: R$"+salario);
		
		scanner.close();
	}
}