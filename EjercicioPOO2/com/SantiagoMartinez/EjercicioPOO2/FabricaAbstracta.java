package com.SantiagoMartinez.EjercicioPOO2;
//La clase FabricaAbstracta obedece a una estrategia Abstract Factory.

public class FabricaAbstracta{
	//El método fábricar de FabricaAbstracta recibe por argumento el tipo de fábrica que va a darme
	//el objeto concreto, los atributos en común y el atributo propio en forma implícita.
	
	public  Vehiculo fabricar(IFabricaConcreta fabrica, String marca, String modelo, String precio, Object param) {
		return fabrica.fabricar(marca, modelo, precio, param);
	}

}
