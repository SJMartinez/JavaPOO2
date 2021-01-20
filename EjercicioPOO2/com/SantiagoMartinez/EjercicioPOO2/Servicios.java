package com.SantiagoMartinez.EjercicioPOO2;

//Esta interfaz est� especializada en los m�todos que involucran a los vehiculos y su ordenamiento.
//La utilizaci�n de esta interfaz provee una mejor especializaci�n y abstracci�n del proyecto.
public interface Servicios {
	default void listar() {};
	default void ordenarListar() {};
	//m�todo abstracto que sobreescriben las subclases para imprimir por consola
	//sus atributos
	default void imprimir() {};
	//m�todo de parseo para el atributo "precio", ya que para una f�cil representaci�n
	//del precio con puntos y comas como en la consigna decid� representarlo en un campo
	//"String" y luego parsear ese campo a la hora de realizar calculos comparativos.
	default double parseo(Vehiculo vehiculo) {
		String precioAux = vehiculo.precio.replace(".", "");
		String precioAux2 = precioAux.replace(",", ".");
		
		double precioDouble = Double.parseDouble(precioAux2);
		return precioDouble;
	}
}
