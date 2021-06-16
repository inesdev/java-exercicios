package exerc�cios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// O hipermercado Tabajara est� com uma promo��o de carnes
		// que � imperd�vel. Confira:
		
		//                At� 5Kg       |      Acima de 5Kg
		// Fil� Duplo   R$4,90 por Kg   |      R$5,80 por Kg
		// Alcatra      R$5,90 por Kg   |      R$6,80 por Kg
		// Picanha      R$6,90 por Kg   |      R$7,80 por Kg
		
		// Para atender a todos os cliente, cada cliente poder� 
		// levar apenas um dos tipos de carne da promo��o, por�m]
		// n�o h� limites para a quantidade de carne por cliente.
		// Se a compra for feita no cart�o Tabajara o cliente 
		// receber� ainda um desconto de 5% sobre o total da compra.
		// Escreva um programa que pe�a o tipo e a quantidade de carne 
		// comprada pelo usu�rio e gere um cupom fiscal, contendo 
		// informa��es da compra: tipo e quantidade de carne, pre�o
		// total, tipo de pagamento, valor do desconto e valor a pagar.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tipo da carne: ");
		System.out.println("1 - Fil� Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipo = scanner.nextInt();
		
		System.out.println("Digite a quantidade de carne (Kg): ");
		double quantidade = scanner.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(quantidade + "Kg - Fil� Duplo");
			
			if (quantidade < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
			
		} else if (tipo == 2) {
			
			System.out.println(quantidade + "Kg - Alcatra");
			
			if (quantidade < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if (tipo == 3) {
			
			System.out.println(quantidade + "Kg - Picanha");
			
			if (quantidade < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}		
		}
		double total = quantidade * precoKg;
		System.out.println(quantidade + "Kg x " + precoKg + " = " + total);
		
		System.out.println("Compra ser� feita no cart�o Tabajara? Digite 1 para Sim: ");
		int cartao = scanner.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		}
	}
}