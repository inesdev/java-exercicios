import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		System.out.println("\t\t Exerc�cio Array ");
		
		int posicao0;
		int posicao1;
		int posicao2;
		int soma;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[3];
		
		System.out.print("\nDigite o n�mero que ocupar� a primera posi��o do Array: ");
		array[0] = posicao0 = scanner.nextInt();
		
		System.out.print("\nDigite o n�mero que ocupar� a segunda posi��o do Array: ");
		array[1] = posicao1 = scanner.nextInt();
		
		System.out.print("\nDigite o n�mero que ocupar� a terceira posi��o do Array: ");
		array[2] = posicao2 = scanner.nextInt();		
		
		soma = array[0] + array[1] + array[2];
		System.out.println("\nA soma dos valores do Array �: " + soma);
	}
}
