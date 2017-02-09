package BiciPalmaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;
import estacion.Estacion;

public class appalmaTest {
	// Inicializamos los parámetros a utilizar en los casos test
	Estacion estacion;
	Bicicleta bicicleta, bicicleta1, bicicleta2;
	TarjetaUsuario tarjeta, tarjeta2;
	
	// Inicializamos los casos test con los parámetros predefinidos
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
		 * Devolvera la información inicializada en estacion:
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
		 * Imprimirá la bicicleta estacionada para testear si la
		 * detecta en el método y le resta 1 a anclajesLibres
		 */
		System.out.println("\nCaso Test anclajesLibres\n");
		assertEquals(3, estacion.anclajesLibres());
		estacion.anclarBicicleta(bicicleta);
		assertEquals(2, estacion.anclajesLibres());
	}
	
	@Test
	public void consultarAnclajesTest(){
		/*
		 * Devolverá la información de las bicicletas en Anclaje, como está
		 * inicializado a 0, devolverá:
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
		 * Ancla las bicicletas y nos devuelve dónde las ha metido:
		 * 
		 * La bicicleta 27 está en el Anclaje numero: 0
		 * La bicicleta 20 está en el Anclaje numero: 1
		 * La bicicleta 10 está en el Anclaje numero: 2
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
