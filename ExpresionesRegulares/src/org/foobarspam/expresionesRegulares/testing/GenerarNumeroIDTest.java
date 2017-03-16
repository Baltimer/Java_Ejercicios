package org.foobarspam.expresionesRegulares.testing;

import static org.junit.Assert.*;

import org.foobarspam.expresionesRegulares.Dni;
import org.foobarspam.expresionesRegulares.GenerarNumeroID;
import org.foobarspam.expresionesRegulares.Nie;
import org.junit.Before;
import org.junit.Test;

public class GenerarNumeroIDTest {
	
	Dni dni;
	Nie nie;
	
	@Before
	public void setUp(){
		dni = new Dni();
		nie = new Nie();
	}
	
	@Test
	public void GenerarDNIValidoTest() {
		String numeroDNI = GenerarNumeroID.generarDNIValido();
		System.out.println(numeroDNI);
		dni.setNumeroId(numeroDNI);
		assertTrue(dni.tieneFormatoValido());
	}
	
	@Test
	public void GenerarDNINoValidoTest() {
		String numeroDNI = GenerarNumeroID.generarDNINoValido();
		System.out.println(numeroDNI);
		dni.setNumeroId(numeroDNI);
		assertFalse(dni.tieneFormatoValido());
	}
	
	@Test
	public void GenerarNIEValidoTest() {
		String numeroNIE = GenerarNumeroID.generarNIEValido();
		System.out.println(numeroNIE);
		nie.setNumeroId(numeroNIE);
		assertTrue(nie.tieneFormatoValido());
	}

	@Test
	public void GenerarNIENoValidoTest() {
		String numeroNIE = GenerarNumeroID.generarNIENoValido();
		System.out.println(numeroNIE);
		nie.setNumeroId(numeroNIE);
		assertFalse(nie.tieneFormatoValido());
	}
}
