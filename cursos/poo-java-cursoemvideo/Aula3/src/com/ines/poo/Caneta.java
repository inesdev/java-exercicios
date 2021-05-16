package com.ines.poo;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
		
	}
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! N�o � poss�vel rabiscar");
		} else {
			System.out.println("Rabiscando!");
		}
	}
	
	protected void tampar() {
		this.tampada = true;		
	}
	
	protected void destampar() {
		this.tampada = false;
	}
}
