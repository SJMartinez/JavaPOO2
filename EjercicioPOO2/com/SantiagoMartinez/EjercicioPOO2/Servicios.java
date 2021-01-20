package com.SantiagoMartinez.EjercicioPOO2;

//Esta interfaz está especializada en los métodos que involucran a los vehiculos y su ordenamiento.
//La utilización de esta interfaz provee una mejor especialización y abstracción del proyecto.
public interface Servicios {
	default void listar() {};
	default void ordenarListar() {};
	//método abstracto que sobreescriben las subclases para imprimir por consola
	//sus atributos
	default void imprimir() {};
	//método de parseo para el atributo "precio", ya que para una fácil representación
	//del precio con puntos y comas como en la consigna decidí representarlo en un campo
	//"String" y luego parsear ese campo a la hora de realizar calculos comparativos.
	default double parseo(Vehiculo vehiculo) {
		String precioAux = vehiculo.precio.replace(".", "");
		String precioAux2 = precioAux.replace(",", ".");
		
		double precioDouble = Double.parseDouble(precioAux2);
		return precioDouble;
	}
}
