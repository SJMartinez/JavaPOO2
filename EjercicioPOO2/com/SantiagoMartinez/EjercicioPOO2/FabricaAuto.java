package com.SantiagoMartinez.EjercicioPOO2;

public class FabricaAuto implements IFabricaConcreta  {

	public Vehiculo fabricar(String marca, String modelo, String precio, Object param) {
		return new Auto(marca,modelo,precio,(Integer)param);
	}

}
