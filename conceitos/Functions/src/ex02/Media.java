package ex02;

public class Media {

	public static void main(String[] args) {
		System.out.println("Escreva um procedimento que recebe as 3 notas de um aluno por par�metro \r\n" + 
				"e uma letra. Se a letra for A o procedimento calcula a m�dia aritm�tica das \r\n" + 
				"notas do aluno, se for P, a sua m�dia ponderada (pesos: 5, 3 e 2) e se for H, a \r\n" + 
				"sua m�dia harm�nica. A m�dia calculada tamb�m deve retornar por par�metro.\r\n");
		
		   double notaUm = 10.0; double notaDois = 8.0; double notaTres = 7.00;
		   // double notaUm = 10.0; double notaDois = 8.0; double notaTres = 7.00;
		char letra = 'H';  
		
		calcularMedias(notaUm, notaDois, notaTres, letra); // Media.calcularMedias(); 
	}
	
	public static void calcularMedias(double nota1, double nota2, double nota3, char l) { // Somente a classe pode utilizar um m�todo/procedimento est�tico.
		double n1 = nota1; double n2 = nota2; double n3 = nota3;
		double media; double mmcDenominador = 1; double mmcNumerador = 0; double mmc = 0;
		int quantidadeElementos = 3;
		if (l == 'A') {
			media = (nota1 + nota2 + nota3) / 3;
			System.out.printf("M�dia Aritm�tica: %.2f", media); // %f � igual a tipo flutuante 
		} else if (l == 'P') {
			media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
			System.out.printf("M�dia Ponderada: %.2f", media);
		} else if (l == 'H') {
			int contador = 0; int i = 2; int contarDivisao = 0;
			while( nota1 != 1 || nota2 != 1 || nota3 != 1) {
				
				if (nota1 % i == 0) {
					nota1 = nota1 / i;
					contarDivisao++;
				}
				if (nota2 % i == 0) {
					nota2 = nota2 / i;
					contarDivisao++;
				}
				if (nota3 % i == 0) {
					nota3 = nota3 / i;
					contarDivisao++;
				}
				
				if (contarDivisao == 0) {
					i++;
				}else {
					contador++;
					System.out.println("i:"+i);
				}
				contarDivisao = 0;
				
				
				System.out.println("N1: " + nota1 + " N2: " + nota2 + " N3: " + nota3);
			}
			
			System.out.println("N1: " + nota1 + " N2: " + nota2 + " N3: " + nota3);
			System.out.println("Contador: "+contador);
			System.out.println("i: "+i);
			
			int armazenar[] = new int[contador];
			contador = 0;
			contarDivisao = 0;
			i = 2;
			nota1 = n1; nota2 = n2; nota3 = n3;

			while(nota1 != 1 || nota2 != 1 || nota3 != 1) {
				
				if (nota1 % i == 0) {
					nota1 = nota1 / i;
					contarDivisao++;
				}
				if (nota2 % i == 0) {
					nota2 = nota2 / i;
					contarDivisao++;
				}
				if (nota3 % i == 0) {
					nota3 = nota3 / i;
					contarDivisao++;
				}
				
				if (contarDivisao == 0) {
					i++;
				}else {
					armazenar[contador] = i;
					contador++;
				}
				contarDivisao = 0;
			}
			
			
			System.out.println("----------------");
			
			for(int value : armazenar) {
				mmcDenominador = mmcDenominador * value;
				/*
				 *  mmcDenominador = 1
				 *  mmcDenominador = mmcDenominador * 2
				 *  mmcDenominador = 2
				 *  mmcDenominador = mmcDenominador * 2
				 *  mmcDenominador = 4
				 *  mmcDenominador = mmcDenominador * 3
				 *  mmcDenominador = 12
				 * 
				 */
				System.out.println(value);
			}
			
						   // 12 / 2                   12 / 4                 12 / 6
		   mmcNumerador = (mmcDenominador / n1) + (mmcDenominador / n2) + (mmcDenominador / n3) ;
		   
		   System.out.println("mmcNumerador:"+mmcNumerador);
		   System.out.println("mmcDenominador:"+mmcDenominador);
		   
		   mmc = mmcNumerador / mmcDenominador;
			
		   System.out.println("mmc:"+mmc);
			
		   
		   media = quantidadeElementos / mmc;
		   
		   System.out.println("Media Harm�nica: "+media);
		   
		} else {
			System.out.println("Digite a letra A, P ou H");
		}
	}
}