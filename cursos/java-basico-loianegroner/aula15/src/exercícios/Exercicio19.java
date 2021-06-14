package exerc�cios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Fa�a um programa que leia dois n�meros e em seguida pergunte
		// ao usu�rio qual opera��o ele deseja realizar. O resultado da 
		// opera��o deve ser acompanhado de uma frase que diga se o n�mero
		// � par ou impar e positivo ou negativo:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		double numero2 = scanner.nextDouble();
		
		System.out.println("Qual opera��o voc� deseja realizar? (+ - / *): ");
		String operacao = scanner.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = numero1 + numero2;
		break;
		
		case "-": resultado = numero1 - numero2;
		break;
		
		case "/": resultado = numero1 / numero2;
		break;
		
		case "*": resultado = numero1 * numero2;
		break;
		
		default: System.out.println("Opera��o Inv�lida!"); 
		valida = false;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0 ) {
				System.out.println("O n�mero " + resultado + " � positivo!");
			} else {
				System.out.println("O n�mero " + resultado + " � negativo!");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("O n�mero " + resultado + " � par!");
			} else {
				System.out.println("O n�mero " + resultado + " � impar!");
			}
		}	
		scanner.close();
	}
}