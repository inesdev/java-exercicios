package exceptions.ex02;

import java.util.Scanner;

public class ErroCalculo2 {
	
	/* Tratamento do ArithmeticException
	 * 
	 * dividendo / divisor
	 *    2 / 2       =         1
	 *    
	 *    2 / 0       = infinito ou indeterminado
	 */	
	
	public static void main(String [] args) {
		
		System.out.println("\t\t Divisor de n�meros");
		
		int dividendo;
		int divisor;
		int verificador = 1;
		
		Scanner entradaTipoInteiro = new Scanner(System.in);
				
			while(verificador == 1) {
				
				try {
				System.out.print("Digite o dividendo: ");
				dividendo = entradaTipoInteiro.nextInt();
				
				System.out.print("\nDigite o divisor: ");
				divisor = entradaTipoInteiro.nextInt();
				
				System.out.println("\n" +dividendo+ " / " +divisor+ " = "+(dividendo/divisor));
				
				System.out.print("\n Deseja continuar com a divis�o?"
						+ "\n Caso Sim, digite 1"
						+ "\n Caso N�o, digite qualquer n�mero: ");
				
				verificador = entradaTipoInteiro.nextInt();
				
			} catch(ArithmeticException erro) {
			
				System.out.println("\n Mensagem de Erro"+erro.getMessage());
				System.out.println("\n Ops! Zero n�o pode ser o divisor! Por gentileza tente novamente!");
				System.out.println("Vamos repetir o processo. Fa�a com aten��o :D");
				
				System.out.print("Digite o dividendo: ");
				dividendo = entradaTipoInteiro.nextInt();
				
				System.out.print("\nChegou a grande hora, n�o vacile novamente! Digite o divisor: ");
				divisor = entradaTipoInteiro.nextInt();
				
				System.out.println("\n" +dividendo+ " / " +divisor+ " = "+(dividendo/divisor));

				System.out.print("\n Deseja continuar com a divis�o?"
						+ "\n Caso Sim, digite 1"
						+ "\n Caso N�o, digite qualquer n�mero: ");
				
				verificador = entradaTipoInteiro.nextInt();
			}
		}
		
		System.out.print("\n\n Muito obrigado por utilizar a nossa aplica��o!");
		entradaTipoInteiro.close();
	}
}