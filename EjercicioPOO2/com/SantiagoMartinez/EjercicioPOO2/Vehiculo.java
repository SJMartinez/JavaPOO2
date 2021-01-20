package com.SantiagoMartinez.EjercicioPOO2;

//Vehiculo es superclase abstracta de Moto y Auto. Contiene solo sus atributos en común.

public abstract class Vehiculo implements Servicios {
	
	protected String marca;
	protected String modelo;
	protected String precio;
	
		
	public Vehiculo(String marca, String modelo, String precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
}
