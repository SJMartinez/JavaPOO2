package com.SantiagoMartinez.EjercicioPOO2.Main;
import java.util.List;

import com.SantiagoMartinez.EjercicioPOO2.*;
public class Program {
	//El main solo se encarga de instanciar Garage, la f�brica abstracta y las f�bricas concretas
	//e invocar sus m�todos. el m�todo .fabricar de FabricaAbstracta recibe por parametro el tipo
	//de f�brica que va a darme el objeto Vehiculo a agregar a la lista de Garage, ademas de los
	//atributos comunes de Veh�culo y el atributo propio de cada clase de forma impl�cita, que
	//luego ser� casteado al tipo de dato correspondiente a Auto o Vehiculo.
	//Esto es en pos de una estrategia Abstract Factory para especializar el instanciamiento de los
	//Veh�culos, a su vez que facilita la inserci�n de alguna supuesta nueva subclase de Veh�culos en el proyecto.
	public static void main(String[] args) {
		Garage garage = new Garage();
		FabricaMoto moto = new FabricaMoto();
		FabricaAuto auto = new FabricaAuto();		
		FabricaAbstracta fabrica = new FabricaAbstracta();
		garage.agregar(fabrica.fabricar(auto,"Peugeot","206", "200.000,00", (Object)4));
		garage.agregar(fabrica.fabricar(moto,"Honda","Titan", "60.000,00", (Object)"125cc"));
		garage.agregar(fabrica.fabricar(auto,"Peugeot","208", "250.000,00",(Object) 5));
		garage.agregar(fabrica.fabricar(moto,"Yamaha","YBR", "80.500,50", (Object)"160cc"));
		garage.listar();
		garage.ordenarListar();
	}

}
