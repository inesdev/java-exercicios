package exerc�cios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		// Fa�a um programa que leia tr�s n�meros e mostre-os em ordem decrescente:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		int numero3 = scanner.nextInt();
		
		
		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			System.out.println("Ordem decrescente: " + numero3 + " | " + numero2 + " | " + numero1);
			
		}  else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2){
			System.out.println("Ordem decrescente: " + numero2 + " | " + numero3 + " | " + numero1);
			
		}  else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3){
			System.out.println("Ordem decrescente: " + numero3 + " | " + numero1 + " | " + numero2);
			
		}  else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1){
			System.out.println("Ordem decrescente: " + numero1 + " | " + numero3 + " | " + numero2);
			
		}  else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2){
			System.out.println("Ordem decrescente: " + numero2 + " | " + numero1 + " | " + numero3);
			
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1){
			System.out.println("Ordem decrescente: " + numero1 + " | " + numero2 + " | " + numero3);
		} 
		
		scanner.close();
	}
}
