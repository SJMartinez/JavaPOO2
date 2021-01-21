package com.SantiagoMartinez.EjercicioPOO2;

//Esta interfaz est� especializada en los m�todos que involucran a Garage.
//La utilizaci�n de esta interfaz provee una mejor especializaci�n y abstracci�n del proyecto.
public interface IGarage {
	void listar();
	void ordenarListar();
	void agregar(Vehiculo vehiculo);
	
}
