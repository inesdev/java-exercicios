package exercicios;

public class Exercicio24 {

	public static void main(String[] args) {
		// O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
		// implantar a metodologia da tabelinha, que j� � um sucesso na sua loja
		// de 1,99. Voc� foi contratado para desenvolver o programa que monta a 
		// tabela de pre�os de p�es, de 1 at� 50 p�es, a partir do pre�o do p�o 
		// informado pelo usu�rio:
		
		System.out.println("Pre�o do p�o: R$ 0,18");
		System.out.println("Lojas Quase Dois - Tabela de Pre�os");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (0.18 * i));
		}
	}
}