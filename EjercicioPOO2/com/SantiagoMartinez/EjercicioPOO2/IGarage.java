package com.SantiagoMartinez.EjercicioPOO2;

//Esta interfaz está especializada en los métodos que involucran a Garage.
//La utilización de esta interfaz provee una mejor especialización y abstracción del proyecto.
public interface IGarage {
	void listar();
	void ordenarListar();
	void agregar(Vehiculo vehiculo);
	
}
