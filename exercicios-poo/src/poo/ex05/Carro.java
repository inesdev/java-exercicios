package poo.ex05;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	/* Os m�todos getters and setters s�o usados para quando queremos encapsular uma classe,
	/* os atributos privados desta classe s� poder�o ser acessados por outras classes atrav�s 
	/* destes m�todos.
	/* 
	 * O m�todo get serve para obter um atributo
	 * E o m�todo get serve para atualizarmos o estado deste atributo
	 */
	
	
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int  getNumPassageiros() {
		return this.numPassageiros;
	}
	
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
}
