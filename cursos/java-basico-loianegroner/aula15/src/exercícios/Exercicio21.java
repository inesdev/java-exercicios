package exerc�cios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		// �lcool:
		// a) at� 20 litros, desconto de 3% por litro;
		// b) acima de 20 litros, desconto de 5% por litro
		// Gasolina: 
		// c) at� 20 litros, desconto de 4% por litro
		// d) acima de 20 litros, desconto de 6% por litro.
		// Escreva um algoritmo que leia o n�mero de litros vendidos,
		// o tipo de combust�vel (codificado da seguinte forma: A - �lcool
		// G - Gasolia), calcule e imprima o valor a ser pago pelo cliente,
		// sabendo-se que o pre�o do litro da gasolina � R$2,50, o pre�o do
		// litro do �lcool � R$1,90:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos litros voc� deseja comprar? ");
		double litros = scanner.nextDouble();
		
		System.out.println("Voc� deseja comprar �lcool ou gasolina? Digite A para �lcool ou G para gasolina: ");
		String combustivel = scanner.next();
		
		final double precoAlcool = 1.90;
		final double precoGasolina = 2.50; 
		int desconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if (combustivel.equalsIgnoreCase("A")) {
			if (litros <= 20) {
				desconto = 3;
			} else {
				desconto = 5;
			}
			
			total = litros * precoAlcool;
			
		} else if (combustivel.equalsIgnoreCase("G")) {
			if (litros <= 20) {
				desconto = 4;
			} else {
				desconto = 6;
			}
			
			total = litros * precoGasolina;
		}
		
		totalDesconto = (total / 100) * desconto;	
		
		double precoPagamento = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoPagamento);
		
		scanner.close();
	}
}