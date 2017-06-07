package org.foobarspam.nba;

import java.util.ArrayList;

import org.foobarspam.nba.item.CompuestoItem;
import org.foobarspam.nba.item.Item;
import org.foobarspam.nba.item.SimpleItem;

public class Main_test {

	public static void main(String[] args) {
		
		SimpleItem simpleItem = new SimpleItem("Lakers");
		
		System.out.println("\n *** crear item simple y testear su nombre *** \n");
		
		System.out.println("Equipo: " + simpleItem.getNombre());
		
		CompuestoItem compuestoItem = new CompuestoItem("Pacific");
		
		System.out.println("\n *** crear item compuesto y testear su nombre *** \n");
		
		System.out.println("División: " + compuestoItem.getNombre());
		
		System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");
		
		compuestoItem.anhadir(simpleItem);
			
		System.out.println("Ok, se ha añadido el item simple " + compuestoItem.getHijos().get(0).getNombre()
									+ " al item compuesto: " + compuestoItem.getNombre());

		//  recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1
		
		System.out.println("\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");
			
			compuestoItem.iterable();
		
		// añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1
		
		System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");
		
			// crear division "Atlantic"
			CompuestoItem atlantic = new CompuestoItem("Atlantic");
			
			String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
			
			for (String nombre : equiposAtlantic){
				SimpleItem equipo = new SimpleItem(nombre);
				atlantic.anhadir(equipo);
			}
			System.out.println("Ok, se han añadido " + atlantic.getHijos().size() + " equipos");
			
			atlantic.iterable();
		// recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n 
		
		System.out.println("\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");
		
			// crear liga "nba" 
			CompuestoItem nba = new CompuestoItem("nba");
			// crear conferencia Este 
			CompuestoItem conferenciaEste = new CompuestoItem("ConferenciaEste");
			conferenciaEste.anhadir(atlantic);
			nba.anhadir(conferenciaEste);
		
			nba.iterable();
		// crear un elemento compuesto de simples a partir de un array de strings
		
		System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");
		
		String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};
		
			CompuestoItem divisionCentral = new CompuestoItem("divisionCentral");
			// Crear division Central
			divisionCentral.composite(equiposCentral);
			divisionCentral.iterable();
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples

		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");
		
		String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};
		
			// crear un arraylist de equipos SouthEast
			ArrayList<Item> arraySouthEast = new ArrayList<Item>();
			for(String nombre : equiposSouthEast){
				SimpleItem equipo = new SimpleItem(nombre);
				arraySouthEast.add(equipo);
			}
		
			// crear division SouthEast y añadir los equipos SouthEast
			CompuestoItem southEast = new CompuestoItem("South East");
			southEast.composite(arraySouthEast);
			southEast.iterable();
			// añadir division SouthEast
		
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos
		
		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");
		
			// crear un ArrayList de divisiones
			ArrayList<Item> divisiones = new ArrayList<Item>();
			divisiones.add(divisionCentral);
			divisiones.add(southEast);
			//divisiones.add(atlantic);
		
			// añadirlas a la conferencia este
		conferenciaEste.composite(divisiones);
		conferenciaEste.iterable();
		
		// eliminar un hijo entre varios, profundidad 1
		
		System.out.println("\n *** eliminar un hijo a profundidad n *** \n");

				// quitar la division Atlantic
		conferenciaEste.quitar("Atlantic");
		conferenciaEste.iterable();
		
		// Crea la conferencia Oeste completa y añadela a la liga; muestra por pantalla la liga completa
		
		System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");
		
		CompuestoItem conferenciaOeste = new CompuestoItem("Conferencia Oeste");
		CompuestoItem noroeste = new CompuestoItem("Noroeste");
		CompuestoItem suroeste = new CompuestoItem("Suroeste");
		CompuestoItem pacifico = new CompuestoItem("Pacifico");
		String[] equiposNoroeste = {"Nuggets", "Timberwolves", "Thunder", "Blazers", "Jazz"};
		noroeste.composite(equiposNoroeste);
		String[] equiposSuroeste = {"Mavericks", "Rockets", "Grizzlies", "Pelicans", "Spurs"};
		suroeste.composite(equiposSuroeste);
		String[] equiposPacifico = {"Warriors", "Clippers", "Lakers", "Suns", "Kings"};
		pacifico.composite(equiposPacifico);
		divisiones = new ArrayList<Item>();
		divisiones.add(noroeste);
		divisiones.add(suroeste);
		divisiones.add(pacifico);
		conferenciaOeste.composite(divisiones);
		nba.anhadir(conferenciaOeste);
		conferenciaEste.anhadir(atlantic);
		nba.iterable();
		
	}
}