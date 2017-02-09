package org.foobarspam.YearBisiestoTest;

import static org.junit.Assert.*;

import org.foobarspam.YearBisiesto.*;
import org.junit.Before;
import org.junit.Test;
public class TestYearBisiesto {
	YearBisiesto yearBisiesto = new YearBisiesto();
	
	@Before
	public void setUp(){
		yearBisiesto = new YearBisiesto();
	}
	@Test
	public void test_esBisiesto_uno() {
		yearBisiesto.setYear(651);
		assertEquals("Numero acabado en 1",false, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_dos() {
		yearBisiesto.setYear(9542);
		assertEquals("Numero acabado en 2",false, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_tres() {
		yearBisiesto.setYear(4253);
		assertEquals("Numero acabado en 3",false, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_cuatro() {
		yearBisiesto.setYear(1984);
		assertEquals("Numero acabado en 4",true, yearBisiesto.esBisiesto());;
	}
	@Test
	public void test_esBisiesto_cinco() {
		yearBisiesto.setYear(1995);
		assertEquals("Numero acabado en 5",false, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_seis() {
		yearBisiesto.setYear(9766);
		assertEquals("Numero acabado en 6",false, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_siete() {
		yearBisiesto.setYear(5737);
		assertEquals("Numero acabado en 7",false, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_ocho() {
		yearBisiesto.setYear(3548);
		assertEquals("Numero acabado en 8",true, yearBisiesto.esBisiesto());
	}
	@Test
	public void test_esBisiesto_nueve() {
		yearBisiesto.setYear(1999);
		assertEquals("Numero acabado en 9",false, yearBisiesto.esBisiesto());
	}
}
