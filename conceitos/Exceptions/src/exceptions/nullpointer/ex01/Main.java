package exceptions.nullpointer.ex01;

public class Main {

	public static void main(String[] args) {
		//Objeto n�o tem uma refer�ncia
		Address address = null;
		
		// Ser� gerado um nullpointer exception porque o objeto � nulo
		System.out.println(address.getAllAdress());
	}
}