package exercicios_java;

import java.util.Locale;
import java.util.Scanner; /* Importa��o Scanner para leitura de dados */

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); /* Objeto sc declarado para leitura de dados */
		
		double baseRetangulo, alturaRetangulo, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		baseRetangulo = sc.nextDouble(); /* Comando para leitura de dados */
		System.out.print("Altura do Retangulo: ");
		alturaRetangulo = sc.nextDouble(); 
		
		area = baseRetangulo * alturaRetangulo;
		perimetro = 2 * baseRetangulo + 2 * alturaRetangulo;
		diagonal = Math.sqrt(Math.pow(baseRetangulo, 2.0) + Math.pow(alturaRetangulo, 2.0));
		/* Fun��o Math.sqrt: fun��o de raiz quadrada | Fun��o Math.pow: fun��o de potencia��o */
		
		System.out.println("Area = " + String.format("%.4f", area));
		/* Fun��o String.format: formata casas decimais "%.4f", neste caso 4 � o n�mero de casas decimais */
		
		System.out.println("Perimetro = " + String.format("%.4f", perimetro));
		System.out.println("Diagonal = " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
