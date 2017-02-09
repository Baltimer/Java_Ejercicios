package org.foobarspam.VentasSupermercado.Testing;

import static org.junit.Assert.*;

import org.foobarspam.VentasSupermercado.Supermercado.Supermercado;
import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void constructorSupermercadoTest() {
		Supermercado supermercado = new Supermercado("Mercadona", 500);
		assertEquals("Mercadona", supermercado.getNombre());
		assertEquals(500, supermercado.getRecaudacionAnual(), 0);
	}

}
