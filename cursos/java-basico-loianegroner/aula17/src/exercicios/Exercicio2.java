package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fa�a um programa que leia um nome de usu�rio e a sua senha
		// e n�o aceite a senha igual ao nome do usu�rio, mostrando uma
		// mensagem de erro e voltando a pedir informa��es:
		
		Scanner scanner = new Scanner(System.in);
		
		boolean informacoesValidas = false;
		do {
			System.out.println("Digite o nome do usu�rio: ");
			String nome = scanner.nextLine();
			
			System.out.println("Digite a senha: ");
			String senha = scanner.nextLine();
			
			if (nome.equalsIgnoreCase(senha)) {
				informacoesValidas = false;
				System.out.println("Senha igual a usu�rio, digite novamente.");
			} else {
				informacoesValidas = true;
				System.out.println("Senha e Usu�rios V�lidos");
			}
		} while (!informacoesValidas);
		
		scanner.close();
	}
}
