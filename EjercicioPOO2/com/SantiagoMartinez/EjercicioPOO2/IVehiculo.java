package com.SantiagoMartinez.EjercicioPOO2;

public interface IVehiculo {
	//m�todo abstracto que sobreescriben las subclases para imprimir por consola
		//sus atributos
		void imprimir();
		//m�todo de parseo para el atributo "precio", ya que para una f�cil representaci�n
		//del precio con puntos y comas como en la consigna decid� representarlo en un campo
		//"String" y luego parsear ese campo a la hora de realizar calculos comparativos.
		 double parseo();
		 
}
