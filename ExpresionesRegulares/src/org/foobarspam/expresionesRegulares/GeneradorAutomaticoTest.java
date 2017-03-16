package org.foobarspam.expresionesRegulares;

public class GeneradorAutomaticoTest {

	public static void main(String[] args) {
		int CASOS = 20;
		
		System.out.println("----- TEST DNI VALIDOS -----\n");
		for (int i=0; i<CASOS; i++) {
			String numeroDNI = GenerarNumeroID.generarDNIValido();
			Dni dni = new Dni(numeroDNI);
			if (dni.tieneFormatoValido()) {
				System.out.println(i+1 + ": " + dni.getNumeroId() + "\tPASS");
			}
		}
		
		System.out.println("\n----- TEST DNI NO VALIDOS -----\n");
		for (int i=0; i<CASOS; i++) {
			String numeroDNI = GenerarNumeroID.generarDNINoValido();
			Dni dni = new Dni(numeroDNI);
			if (!dni.tieneFormatoValido()) {
				System.out.println(i+1 + ": " + dni.getNumeroId() + "\tPASS");
			}
		}
		
		System.out.println("\n----- TEST NIE VALIDOS -----\n");
		for (int i=0; i<CASOS; i++) {
			String numeroNie = GenerarNumeroID.generarNIEValido();
			Nie nie = new Nie(numeroNie);
			if (nie.tieneFormatoValido()) {
				System.out.println(i+1 + ": " + nie.getNumeroId() + "\tPASS");
			}
		}
		
		System.out.println("\n----- TEST NIE NO VALIDOS -----\n");
		for (int i=0; i<CASOS; i++) {
			String numeroNie = GenerarNumeroID.generarNIENoValido();
			Nie nie = new Nie(numeroNie);
			if (!nie.tieneFormatoValido()) {
				System.out.println(i+1 + ": " + nie.getNumeroId() + "\tPASS");
			}
		}
	}
}
