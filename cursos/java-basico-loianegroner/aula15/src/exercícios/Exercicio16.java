package exerc�cios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau,
		// na f�rmula ax2 + bx + c. O programa dever� pedir os valores de a, b e c 
		// e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
		//
		// a) Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do 
		// segundo grau e o programa n�o deve pedir os demais valores, sendo encerrado;
		// b) Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais.
		// Informe ao usu�rio e encerre o programa.
		// c) Se o delta calculado for igual a zero a equa��o possui apenas uma ra�z
		// real. Informe ao usu�rio;
		// d) Se o delta for positivo, a equa��o possui duas ra�zes reais. 
		// Informe ao usu�rio;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = scanner.nextInt();	
		
		if (a == 0) {
			System.out.print("N�o � equa��o de segundo grau!");
		} else {
			System.out.print("Digite o valor de B: ");
			int b = scanner.nextInt();
			
			System.out.print("Digite o valor de C: ");
			int c = scanner.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("\nDelta Negativo!");
			} else {
				
				System.out.println("\nO valor de delta �: " + delta);
				
				double x1 = ((- b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((- b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("\nx1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			scanner.close();
		} 
	}
}