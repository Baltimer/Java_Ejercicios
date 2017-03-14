package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.foobarspam.cotxox.conductores.*;

public class ConductorTest {
	Conductor conductor;
	
	@Before
	public void setUp(){
		conductor = new Conductor("Lluis");
	}
	
	@Test
	public void constructorTest() {
		assertEquals("Lluis", conductor.getNombre());
	}
	
	@Test
	public void setValoracionesTest(){
		short valoracion = 4;
		short valoracion2 = 5;
		short valoracion3 = 4;
		conductor.setValoracion(valoracion);
		System.out.println("La valoracion media debe ser 4 y es: " + conductor.getValoracionMedia());
		conductor.setValoracion(valoracion2);
		System.out.println("La valoracion media debe ser 4.5 y es: " + conductor.getValoracionMedia());
		conductor.setValoracion(valoracion3);
		System.out.println("La valoracion media debe ser 4.33 y es: " + conductor.getValoracionMedia());
	}
	
	@Test
	public void ocupadoTest(){
		conductor.setOcupado(true);
		assertTrue(conductor.getOcupado());
	}

}
