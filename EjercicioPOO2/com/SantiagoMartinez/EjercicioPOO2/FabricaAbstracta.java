package com.SantiagoMartinez.EjercicioPOO2;
//La clase FabricaAbstracta obedece a una estrategia Abstract Factory.

public class FabricaAbstracta{
	//El m�todo f�bricar de FabricaAbstracta recibe por argumento el tipo de f�brica que va a darme
	//el objeto concreto, los atributos en com�n y el atributo propio en forma impl�cita.
	
	public  Vehiculo fabricar(IFabricaConcreta fabrica, String marca, String modelo, String precio, Object param) {
		return fabrica.fabricar(marca, modelo, precio, param);
	}

}
