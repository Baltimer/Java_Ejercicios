package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.foobarspam.cotxox.carrera.*;

public class CarreraTest {
	Carrera carrera;
	
	@Before
	public void setUp(){
		String tarjetaCredito = "12345678";
		carrera = new Carrera(tarjetaCredito);
	}
	
	@Test
	public void settersYGettersTest() {
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setOrigen(origen);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		assertEquals(destino, carrera.getDestino());
		assertEquals(origen, carrera.getOrigen());
		// Método assertEquals (doube, double) está en desuso.
		System.out.println("La distancia debería ser 7.75, y es: " + distancia);
	}

}
