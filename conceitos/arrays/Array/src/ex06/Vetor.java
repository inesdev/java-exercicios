package ex06;

public class Vetor {

	public static void main(String[] args) {
		int A[] = new int[6]; // 0, 1, 2, 3, 4, 5
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = -7;
		
		int soma = A[0] + A[1] + A[5];
		
		A[4] = 100;
		
		System.out.println(
				"\n Posi��o 0: " + A[0] + 
				"\n Posi��o 1: " + A[1] + 
				"\n Posi��o 2: " + A[2] +
				"\n Posi��o 3: " + A[3] +
				"\n Posi��o 4: " + A[4] +
				"\n Posi��o 5: " + A[5]
		);
	}
}
