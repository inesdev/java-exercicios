package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a uma nota, entre zero e dez.
		// Mostre uma mensagem caso o valor seja inv�lido e continue
		// pedindo at� que o usu�rio informe um valor v�lido:
		
		Scanner scanner = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.print("Digite a nota entre zero e dez: ");
			double nota = scanner.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voc� digitou: " + nota);
			} else {
				System.out.println("Valor Inv�lido! Por favor, digite novamente.");
			}
		
		} while (!notaValida);
		
		scanner.close();
	}
}