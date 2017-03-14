package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.foobarspam.cotxox.conductores.*;

public class PoolConductoresTest {
	Conductor conductor1;
	Conductor conductor2;
	PoolConductores poolConductores;
	ArrayList<Conductor> conductores = new ArrayList<>();
	@Before
	public void setUp(){
		conductor1 = new Conductor("Lluis");
		conductor2 = new Conductor("David");
		conductores.add(conductor1);
		conductores.add(conductor2);
		poolConductores = new PoolConductores(conductores);
	}
	
	@Test
	public void constructorTest() {
		assertEquals("Lluis", poolConductores.getPoolConductores().get(0).getNombre());
		for (Conductor conductor : poolConductores.getPoolConductores()){
			System.out.println(conductor.getNombre());
		}
	}
	
	@Test
	public void asignarConductorTest(){
		conductor2.setOcupado(true);
		assertEquals(conductor1, poolConductores.asignarConductor());
	}

}
