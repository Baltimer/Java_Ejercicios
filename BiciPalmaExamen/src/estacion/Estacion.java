package estacion;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
	// -------------------- Propiedades --------------------	
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = new Bicicleta[numeroAnclajes];

	// -------------------- Constructores --------------------
	public Estacion() {

	}

	public Estacion(int id, String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}

	// -------------------- Getters y Setters --------------------
	public int getId() {
		return this.id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}


	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}

	// -------------------- METODOS --------------------
	public void consultarEstacion() {
		/*
		 * M�todo que imprime la informaci�n de la estaci�n
		 */
		System.out.println("Id: " + getId());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Numero anclajes: " + getNumeroAnclajes());
	}

	public int anclajesLibres() {
		/*
		 * M�todo que recorre el array Anclajes y devuelve la cantidad 
		 * de huecos disponibles.
		 */
		int libres = 0;
		for (Bicicleta bicicleta : getAnclajes()) {
			if (bicicleta == null) {
				libres++;
			}
		}
		return libres;
	}

	public void consultarAnclajes() {
		/*
		 * M�todo que recorre el array Anclajes e imprime las bicicletas
		 * que se encuentran en �l.
		 */
		for (int i = 0; i < anclajes.length; i++) {
			if (anclajes[i] != null) {
				System.out.println("En el anclaje " + (i + 1) + " se encuentra la bicicleta: " + anclajes[i].getId());
			} else {
				System.out.println("En el anclaje " + (i + 1) + " no hay ninguna bicicleta.");
			}
		}
	}

	public void anclarBicicleta(Bicicleta bicicleta) {
		/*
		 * M�todo que recorre el array Anclajes para comprobar que hay un anclaje
		 * libre y, si lo hay, ancla la bicicleta a esa posici�n y muestra un
		 * mensaje de d�nde se ha mostrado la bicicleta.
		 */
		int numeroAnclaje = -1; // Inicializamos a -1 (No ha encontrado)
		for (int i = 0; i < getAnclajes().length; i++) {
			if (getAnclajes()[i] == null) {
				setAnclaje(i, bicicleta);
				numeroAnclaje = i + 1;
				break;
			}
		}
		if (numeroAnclaje != -1) {
			mostrarAnclaje(bicicleta, numeroAnclaje);
		} else {
			System.out.println("No se ha podido anclar, no hay espacio");
		}
	}
	
	private void setAnclaje(int posicion, Bicicleta bicicleta){
		/*
		 * M�todo que ancla una bicicleta a una posicion del array Anclaje.
		 * 
		 * Se utiliza para cumplir el est�ndar DRY, ya que necesitamos introducir
		 * una bicicleta en el array y lo abstraemos a este m�todo.
		 */
		getAnclajes()[posicion] = bicicleta;
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		/*
		 * M�todo auxiliar que complementa a anclarBicicleta:
		 * 
		 * Muestra si se ha podido anclar la bicicleta al array
		 * Anclajes.
		 */
		if (numeroAnclaje != -1) { // si numeroAnclaje = -1 es que no hay bcicletas
			System.out.println("La bicicleta " + bicicleta.getId() + " est� en el Anclaje numero: " + numeroAnclaje);
		} else {
			System.out.println("No se ha podido anclar, no hay espacio");
		}
	}

	public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		/*
		 * M�todo que devuelve el estado de la tarjeta del Usuario
		 */
		return tarjetaUsuario.getActivada();
	}

	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		/*
		 * M�todo que retira una bicicleta del array Anclaje si la tarjeta est�
		 * activada y hay alguna bicicleta disponible, y muestra por pantalla 
		 * la bicicleta retirada. 
		 */
		if (!tarjetaUsuario.getActivada()) {
			System.out.println("Lo sentimos, la tarjeta no est� activada.");
		} else {
			int numeroAnclaje = generarAnclaje();
			if(numeroAnclaje != -1){
				mostrarBicicleta(getAnclajes()[numeroAnclaje], numeroAnclaje + 1);
				setAnclaje(numeroAnclaje, null);
			} else{
				System.out.println("No hay ninguna bicicleta disponible");
			}
		}
	}
	
	private void mostrarBicicleta(Bicicleta bicicleta, int posicion) {
		/* M�todo auxiliar que complementa a retirarBicicleta: 
		 * 
		 * Muestra la bicicleta retirada.
		 */
		System.out.println("Se ha retirado la " + bicicleta.getId() + " del anclaje numero " + posicion);
	}

	public int generarAnclaje() {
		/*
		 * M�todo auxiliar que complementa a retirarBicicleta:
		 * 
		 * Devuelve una posicion aleatoria del array Anclaje si hay almenos
		 * una bicicleta en el, sino devuelve -1.
		 */
		int numeroAnclaje = -1;
		if (hayBicicletas()){
			numeroAnclaje = ThreadLocalRandom.current().nextInt(0, getAnclajes().length);
			while (getAnclajes()[numeroAnclaje] == null) {
				numeroAnclaje = ThreadLocalRandom.current().nextInt(0, getAnclajes().length);
			}
			return numeroAnclaje;
		}
		return numeroAnclaje;
	}
	
	private Boolean hayBicicletas(){
		/*
		 * M�todo auxiliar que complementa a generarAnclaje:
		 * 
		 * Devuelve verdadero o falso dependiendo de si hay o no bicicletas 
		 * dentro del array Anclaje.
		 */
		for (int i = 0; i<getAnclajes().length; i++){
			if (getAnclajes()[i] != null){
				return true;
			}
		}
		return false;
	}
}