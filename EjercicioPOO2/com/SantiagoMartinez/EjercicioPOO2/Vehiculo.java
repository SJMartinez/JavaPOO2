package com.SantiagoMartinez.EjercicioPOO2;

//Vehiculo es superclase abstracta de Moto y Auto. Contiene solo sus atributos en común.

public abstract class Vehiculo implements IVehiculo {
	
	protected String marca;
	protected String modelo;
	protected String precio;
	
		
	public Vehiculo(String marca, String modelo, String precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	@Override
	public double parseo() {
		String precioAux = this.precio.replace(".", "");
		String precioAux2 = precioAux.replace(",", ".");
		
		double precioDouble = Double.parseDouble(precioAux2);
		return precioDouble;
	}
	
}
