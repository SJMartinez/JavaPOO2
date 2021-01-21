package com.SantiagoMartinez.EjercicioPOO2;
//Interfaz para las fábricas concretas FabricaAuto y FabricaMoto.
public interface IFabricaConcreta {
	
	//Método que sobreescriben las fábricas concretas (moto, auto) con el objetivo
	// de instanciar objeto Moto o Auto respectivamente.
	public Vehiculo fabricar(String marca, String modelo, String precio, Object param);
	
	
}