package org.foobarspam.PuntoDeSillaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.foobarspam.PuntoDeSilla.*;

public class PuntoDeSillaTest {
	private PuntoDeSilla silla;
	private int[] puntoDeSilla;
	
	@Before
	public void setUp(){
		silla = new PuntoDeSilla();
		puntoDeSilla = new int[2];
	}
	
	@Test
	public void recorrerMatrizTest(){
		int[][] matriz = {{1,2,4},
						{3,0,1},
						{7,8,9}};
		silla.setMatriz(matriz);
		assertEquals(9, silla.recorrerMatriz());
	}
	
	@Test
	public void posicionValorMasBajoFilaTest(){
		int[][] matriz = {{1,2,4},
						{3,0,1},
						{7,8,9}}; 
		silla.setMatriz(matriz);
		assertEquals(0, silla.posicionValorMasBajoFila(0));
	}
	
	@Test
	public void valorMasAltoColumnaTest(){
		int[][] matriz = {{1,2,4},
						{3,0,1},
						{7,8,9}}; 
		silla.setMatriz(matriz);
		assertEquals(2, silla.valorMasAltoColumna(0));
	}
	
	@Test
	public void sillaConNumerosDistintos() {
		int[][] matriz = {{1,2,4},
						{3,0,1},
						{7,8,9}};
		puntoDeSilla[0] = 2;
		puntoDeSilla[1] = 0;
		silla.setMatriz(matriz);
		silla.calcularPuntoDeSilla();
		assertArrayEquals(puntoDeSilla, silla.getPuntoDeSilla());
	}
	
	@Test
	public void sillaConNumerosDistintos2() {
		int[][] matriz = {{8,7,9},
						{3,0,1},
						{1,2,3}};
		puntoDeSilla[0] = 0;
		puntoDeSilla[1] = 1;
		silla.setMatriz(matriz);
		silla.calcularPuntoDeSilla();
		assertArrayEquals(puntoDeSilla, silla.getPuntoDeSilla());
	}
	
	@Test
	public void sillaCon2NumerosIgualesEnFilaYColumna() {
		int[][] matriz = {{8,7,9},
						{3,0,3},
						{1,2,3}};
		puntoDeSilla[0] = 0;
		puntoDeSilla[1] = 1;
		silla.setMatriz(matriz);
		silla.calcularPuntoDeSilla();
		assertArrayEquals(puntoDeSilla, silla.getPuntoDeSilla());
	}
	
	@Test
	public void sillaCon3NumerosIgualesEnFila() {
		int[][] matriz = {{8,7,9},
						{3,0,3},
						{3,3,3}};
		puntoDeSilla[0] = 0;
		puntoDeSilla[1] = 1;
		silla.setMatriz(matriz);
		silla.calcularPuntoDeSilla();
		assertArrayEquals(puntoDeSilla, silla.getPuntoDeSilla());
	}
	
	@Test
	public void sillaConTodosLosNumerosIguales() {
		int[][] matriz = {{8,8,8},
						{8,8,8},
						{8,8,8}};
		puntoDeSilla[0] = 0;
		puntoDeSilla[1] = 0
				;
		silla.setMatriz(matriz);
		silla.calcularPuntoDeSilla();
		assertArrayEquals(puntoDeSilla, silla.getPuntoDeSilla());
	}
}
