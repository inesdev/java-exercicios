package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Fa�a um programa que leia e valide as seguintes informa��es:
		// a) Nome: maior que 3 caracteres;
		// b) Idade: entre 0 e 150;
		// c) Sal�rio: maior que zero;
		// d) Sexo: 'f' ou 'm';
		// e) Estado Civil: 's', 'c', 'v', 'd':
		
		Scanner scanner = new Scanner(System.in);
		
		boolean informacaoValida = false;
		String nome;
		String sexo;
		String estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Digite o nome: ");
			nome = scanner.nextLine();
			
			if (nome.length() > 3) {
				informacaoValida = true;
			} else {
				System.out.println("Nome com caracteres insuficientes, s�o necess�rios no m�nimo tr�s.");
			}
		} while (!informacaoValida);
		
		informacaoValida = false;	
		do {
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				informacaoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		} while (!informacaoValida);
		
		
		informacaoValida = false;	
		do {
			System.out.println("Digite o salario: ");
			salario = scanner.nextDouble();
			
			if (salario > 0) {
				informacaoValida = true;
			} else {
				System.out.println("Sal�rio deve ser maior que zero.");
			}
		} while (!informacaoValida);
		
		informacaoValida = false;	
		do {
			System.out.println("Digite o sexo: ");
			sexo = scanner.nextLine();
			
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				informacaoValida = true;
			} else {
				System.out.println("Sexo deve ser 'F' ou 'M'.");
			}
		} while (!informacaoValida);
		
		informacaoValida = false;	
		do {
			System.out.println("Digite o estado civil: ");
			estadoCivil = scanner.nextLine();
			
			if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") 
				|| estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")) {
				informacaoValida = true;
			} else {
				System.out.println("Estado Civil deve ser S, C, V ou D.");
			}
		} while (!informacaoValida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}