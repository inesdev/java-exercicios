package exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		// Supondo que a popula��o de um pais A seja da ordem de 80000
		// habitantes com uma taxa anual de crescimento de 3% e que a 
		// popula��o de B seja 200000 habitantes com uma taxa de crescimento
		// de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos
		// necess�rios para que a popula��o do pa�s A ultrapasse ou igual a
		// popula��o do pais B, mantidas as taxas de crescimento:
		
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		while (paisA < paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		
		System.out.println("Pa�s A: " + paisA);
		System.out.println("Pa�s B: " + paisB);
		System.out.println("Quantidade de anos: " + anos);
	}
}