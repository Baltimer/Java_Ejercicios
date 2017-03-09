package org.foobarspam.Estructuras;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;

public class LoteriaArrayList {

	public static void main(String[] args) {
		int numeroCombinaciones = 5;
		int numeroMaximoCombinacion = 49;
		int numeroBolasReintegro = 9;
		
	    List<Integer> numeros = new ArrayList<Integer>();
	    List<Integer> reintegro = new ArrayList<Integer>();
	
	    for (int i = 1; i <= numeroMaximoCombinacion; i++) {
	    	// Los numeros van desde el 1 al 49
		     numeros.add(i);
	    }
	    for (int i = 0; i <= numeroBolasReintegro; i++) {
		     reintegro.add(i);
	    }
	
	    for (int i = 1; i <= numeroCombinaciones; i++) {
	    	// Empezamos por 1 para escribir directamente las combinaciones
		    Collections.shuffle(numeros);
		    System.out.print("Combinacion " + (i) + ": ");
		    for (int j = 0; j <= numeroCombinaciones; j++) {
		    	// Controlamos que el ultimo numero se escriba sin coma
		    	if (j != numeroCombinaciones){
		    	System.out.print(numeros.get(j) + ",");
		    	} else{
		    		System.out.print(numeros.get(numeroCombinaciones));
		    	}
		    }
		    System.out.print("     Complementario: " + numeros.get(numeroCombinaciones+1));
		    System.out.println("\tReintegro: " + reintegro.get(ThreadLocalRandom.current().nextInt(10)));
		    // Utilizamos un numero aleatorio para no hacer shuffle de reintegro
	    }
	}
}
