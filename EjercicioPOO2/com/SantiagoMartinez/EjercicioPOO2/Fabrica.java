package com.SantiagoMartinez.EjercicioPOO2;
//La clase Fabrica obedece a una estrategia Factory. Se especializa en el instanciamiento de cada objeto.

public class Fabrica {
	

	public Auto fabricar(String marca, String modelo, String precio, int puertas) {
		Auto auto = new Auto(marca,modelo,precio,puertas);
		return auto;
	}
	
	public Moto fabricar(String marca, String modelo, String precio, String cilindrada) {
		Moto moto = new Moto(marca,modelo,precio, cilindrada);
		return moto;
	}
	
	
}