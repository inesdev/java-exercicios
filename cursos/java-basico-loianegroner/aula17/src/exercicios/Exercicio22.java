package exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule o valor total investido por um colecionador
		// em sua cole��o de CDs e o valor m�dio gasto em cada um deles. O usu�rio 
		// dever� informar a quantidade de CDs e o valor para em cada um:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de CDs: ");
		int cds = scanner.nextInt();
		
		double preco;
		double soma = 0;
		
		for (int i = 1; i <= cds; i++) {
			System.out.print("Informe o valor do " + i + "� CD: ");
			preco = scanner.nextDouble();
			
			soma = soma + preco;
		}
		
		double media = soma / cds;
		
		System.out.println("M�dia de gasto com cada CD: R$" + media);
		
		scanner.close();
	}
}