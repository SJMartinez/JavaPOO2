package com.SantiagoMartinez.EjercicioPOO2;

public interface IVehiculo {
	//método abstracto que sobreescriben las subclases para imprimir por consola
		//sus atributos
		void imprimir();
		//método de parseo para el atributo "precio", ya que para una fácil representación
		//del precio con puntos y comas como en la consigna decidí representarlo en un campo
		//"String" y luego parsear ese campo a la hora de realizar calculos comparativos.
		 double parseo();
		 
}
