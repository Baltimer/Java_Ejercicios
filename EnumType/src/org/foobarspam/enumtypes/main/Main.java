package org.foobarspam.enumtypes.main;

import java.util.Scanner;

import org.foobarspam.enumtypes.planeta.Planeta;

public class Main {
	
	public static void main (String[] args) {
		System.out.println("Introduce tu peso en KG: ");
		Scanner input = new Scanner(System.in);
		Integer peso = Integer.parseInt(input.nextLine());

		Planeta tierra = Planeta.EARTH;

		double masa = peso / tierra.getGravedadEnPlaneta();

		for (Planeta planeta : Planeta.values()) {
			double pesoEnPlaneta = masa * planeta.getGravedadEnPlaneta();
			System.out.println("Tu peso en " + planeta.name() + " es:\t" + Math.round((pesoEnPlaneta * 100) / 100));
		}

	}
}
