package org.foobarspam.cotxox.testing;

import org.foobarspam.cotxox.tarifa.*;
import org.foobarspam.cotxox.carrera.*;
import org.junit.Before;
import org.junit.Test;

public class TarifaTest {
	Carrera carrera;
	Tarifa tarifa;
	@Before
	public void setUp(){
		String tarjetaCredito = "12345678";
		carrera = new Carrera(tarjetaCredito);
		tarifa = new Tarifa();
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setOrigen(origen);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
	}
	
	@Test
	public void getterTest() {
		double distancia = 5;
		int minutos = 20;
		System.out.println("Distancia debería ser 6.75 y es: " + tarifa.getCosteDistancia(distancia));
		System.out.println("Tiempo debería ser 7.0 y es: " + tarifa.getCosteTiempo(minutos));
	}

	@Test
	public void getCosteTotalEsperadoTest(){
		double distancia = 5;
		int minutos = 20;
		System.out.println("Tiempo total esperado debería ser 13.75 y es: " + Tarifa.getCosteTotalEsperado(minutos, distancia));
	}
}
