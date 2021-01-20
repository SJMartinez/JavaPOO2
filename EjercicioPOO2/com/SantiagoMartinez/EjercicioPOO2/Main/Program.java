package com.SantiagoMartinez.EjercicioPOO2.Main;
import java.util.List;

import com.SantiagoMartinez.EjercicioPOO2.*;
public class Program {
//El main solo se encarga de instanciar Garage y Fábrica e invocar sus métodos.
	public static void main(String[] args) {
		Garage garage = new Garage();
		Fabrica fabrica = new Fabrica();
		garage.agregar(fabrica.fabricar("Peugeot","206", "200.000,00", 4));
		garage.agregar(fabrica.fabricar("Honda","Titan", "60.000,00", "125cc"));
		garage.agregar(fabrica.fabricar("Peugeot","208", "250.000,00", 5));
		garage.agregar(fabrica.fabricar("Yamaha","YBR", "80.500,50", "160cc"));
		garage.listar();
		garage.ordenarListar();
	}

}
