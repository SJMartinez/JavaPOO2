package com.SantiagoMartinez.EjercicioPOO2;

public class FabricaMoto implements IFabricaConcreta {
	
	public Vehiculo fabricar(String marca, String modelo, String precio, Object param) {
		return new Moto(marca,modelo,precio,(String)param);
	}

}
