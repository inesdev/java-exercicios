package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Fa�a um programa que pergunte quanto a pessoa ganha por hora e o n�mero de horas trabalhadas no m�s.
		// Calcule e mostre o total do seu sal�rio referido no m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda,
		// 8% para o INSS e 5% para o sindicato, fa�a um programa que informe: 
		// a) Sal�rio bruto
		// b) Quanto pagou ao INSS
		// c) Quanto pagou ao Sindicato
		// d) Sal�rio l�quido
		// e) Calcule os descontos e o sal�rio l�quido
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- FOLHA DE PAGAMENTO -----");
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Digite o n�mero de horas trabalhdas no m�s: ");
		int horasTrabalhadas = scanner.nextInt();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		
		double pagInss = salarioBruto * 8 / 100;
		double pagSindicato = salarioBruto * 5 / 100;
		double pagIR = salarioBruto * 11 / 100;
		
		double salarioLiquido = salarioBruto - pagInss - pagSindicato - pagIR;
		
		System.out.println("Sal�rio Bruto: R$" + salarioBruto);
		System.out.println("Desconto INSS: R$" + pagInss);
		System.out.println("Desconto Sindicato: R$" + pagSindicato);
		System.out.println("Desconto Imposto de Renda R$: " + pagIR);
		
		System.out.println("SAL�RIO L�QUIDO: R$" + salarioLiquido);
		
		scanner.close();
	}
}
