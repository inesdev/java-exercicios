package exceptions.nullpointer.ex01;

public class MainAvoidException {

	public static void main(String[] args) {
		Address address = null;
		
		try {
			System.out.println(address.getAllAdress());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		/*if (address != null) {
			System.out.println(address.getAllAdress());
		} else {
			System.out.println("A vari�vel � nula, n�o referencia um objeto!");
		}*/
	}
}