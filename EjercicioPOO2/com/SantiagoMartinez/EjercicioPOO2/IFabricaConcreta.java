package com.SantiagoMartinez.EjercicioPOO2;
//Interfaz para las f�bricas concretas FabricaAuto y FabricaMoto.
public interface IFabricaConcreta {
	
	//M�todo que sobreescriben las f�bricas concretas (moto, auto) con el objetivo
	// de instanciar objeto Moto o Auto respectivamente.
	public Vehiculo fabricar(String marca, String modelo, String precio, Object param);
	
	
}