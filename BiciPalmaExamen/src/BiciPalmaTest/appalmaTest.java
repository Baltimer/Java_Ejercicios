package BiciPalmaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;
import estacion.Estacion;

public class appalmaTest {
	// Inicializamos los par�metros a utilizar en los casos test
	Estacion estacion;
	Bicicleta bicicleta, bicicleta1, bicicleta2;
	TarjetaUsuario tarjeta, tarjeta2;
	
	// Inicializamos los casos test con los par�metros predefinidos
	@Before
	public void setUp(){
		estacion = new Estacion(5, "casa", 3);
		bicicleta = new Bicicleta(27);
		bicicleta1 = new Bicicleta(20);
		bicicleta2 = new Bicicleta(10);
		tarjeta = new TarjetaUsuario("1", true);
		tarjeta2 = new TarjetaUsuario("2", false);
	}
	
	@Test
	public void consultarEstacionTest(){
		/*
		 * Devolvera la informaci�n inicializada en estacion:
		 * Id: 5
		 * Direccion: casa
		 * Numero anclajes: 3
		 */
		System.out.println("\nCaso Test consultarEstacion\n");
		estacion.consultarEstacion();
	}
	
	@Test
	public void anclajesLibresTest(){
		/*
		 * Imprimir� la bicicleta estacionada para testear si la
		 * detecta en el m�todo y le resta 1 a anclajesLibres
		 */
		System.out.println("\nCaso Test anclajesLibres\n");
		assertEquals(3, estacion.anclajesLibres());
		estacion.anclarBicicleta(bicicleta);
		assertEquals(2, estacion.anclajesLibres());
	}
	
	@Test
	public void consultarAnclajesTest(){
		/*
		 * Devolver� la informaci�n de las bicicletas en Anclaje, como est�
		 * inicializado a 0, devolver�:
		 * 
		 * En el anclaje 0 no hay ninguna bicicleta.
		 * En el anclaje 1 no hay ninguna bicicleta.
		 * En el anclaje 2 no hay ninguna bicicleta.
		 */
		System.out.println("\nCaso Test consultarAnclajes\n");
		estacion.consultarAnclajes();
	}
	
	@Test
	public void anclarBicicletaTestYMostrarAnclajeTest(){
		/*
		 * Ancla las bicicletas y nos devuelve d�nde las ha metido:
		 * 
		 * La bicicleta 27 est� en el Anclaje numero: 0
		 * La bicicleta 20 est� en el Anclaje numero: 1
		 * La bicicleta 10 est� en el Anclaje numero: 2
		 */
		System.out.println("\nCaso Test anclarBicicleta y MostrarAnclaje\n");
		estacion.anclarBicicleta(bicicleta);
		estacion.anclarBicicleta(bicicleta1);
		estacion.anclarBicicleta(bicicleta2);
	}
	
	@Test
	public void leerTarjetaUsuarioTest(){
		/*
		 * Devuelve el estado de la tarjeta del usuario
		 */
		assertEquals(true, estacion.leerTarjetaUsuario(tarjeta));
		assertEquals(false, estacion.leerTarjetaUsuario(tarjeta2));
	}
	
	@Test
	public void retirarBicicletaTest(){
		/*
		 * Mete 2 bicicletas y retira una, devolviendo las operaciones
		 * indicadas y de que posicion la ha eliminado.
		 */
		System.out.println("\nCaso Test retirarBicicleta\n");
		estacion.anclarBicicleta(bicicleta);
		estacion.anclarBicicleta(bicicleta1);
//		estacion.anclarBicicleta(bicicleta2);
		estacion.retirarBicicleta(tarjeta);
//		estacion.retirarBicicleta(tarjeta);
		estacion.consultarAnclajes();
	}
}
