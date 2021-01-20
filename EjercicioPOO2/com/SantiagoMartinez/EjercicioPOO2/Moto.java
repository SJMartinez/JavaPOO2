package com.SantiagoMartinez.EjercicioPOO2;

public class Moto extends Vehiculo implements Servicios {

	private String cilindrada;
	
	public Moto (String marca, String modelo, String precio,String cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Marca: " + this.marca + " // Modelo: " + this.modelo + " // Cilindrada: " + this.cilindrada + " // Precio: $" + this.precio);
	}
	
}
