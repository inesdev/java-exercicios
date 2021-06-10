package exerc�cios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// As organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores
		// e lhe contrataram para desenvolver um programa que calcular� os reajustes:
		
		// 1) Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste seguindo o seguinte
		// crit�rio, baseado no sal�rio Antigo:
		// a) Sal�rios at� R$280,00 (incluindo): Aumento de 20%		
		// b) Sal�rios entre R$280,00 e R$700,00: Aumento de 15%
		// b) Sal�rios entre R$700,00 e R$1500,00: Aumento de 10%
		// c) Sal�rios de R$1500,00 em diante: Aumento de 5%.
		
		// Ap�s o aumento ser ralizado, informe na tela:
		// - Sal�rio antes do reajuste
		// - Percentual de aumento aplicado
		// - Valor do aumento
		// - Novo sal�rio, ap�s o aumento
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- SITEMA DE REAJUSTES -----");
		System.out.print("\nDigite o sal�rio do colaborador: ");
		double salarioAntigo = scanner.nextDouble();
		
		int percentual = 0;
		if(salarioAntigo <= 280.00) {
			percentual = 20;
			
		} else if (salarioAntigo > 280.00 && salarioAntigo <= 700.00) {
			percentual = 15;
			
		} else if (salarioAntigo > 700.00 && salarioAntigo <= 1500.00) {
			percentual = 10;
			
		} else if (salarioAntigo > 1500.00) {
			percentual = 5;
		}
		
		double valorAumento = (salarioAntigo / 100) * percentual;
		double salarioNovo = salarioAntigo + valorAumento;
		
		System.out.println("\n----- SAL�RIO AP�S REAJUSTE -----");
		System.out.println("\nSal�rio Antigo: R$" + salarioAntigo);
		System.out.println("Percentual de Aumento: " + percentual + "%");
		System.out.println("Valor do Aumento: R$" + valorAumento);
		System.out.println("Sal�rio Reajustado: R$" + salarioNovo);
		
		scanner.close();
	}
}