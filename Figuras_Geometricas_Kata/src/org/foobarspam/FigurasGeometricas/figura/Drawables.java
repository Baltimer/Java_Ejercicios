package org.foobarspam.FigurasGeometricas.figura;

import java.util.ArrayList;

public class Drawables {
	
	public static void dibujarFiguras(ArrayList<Drawable> figuras){
		for (Drawable figura : figuras){
			figura.draw();
		}
	}
	
	public static void aplicarTemas(ArrayList<Drawable> figuras) {
		for (Drawable figura : figuras) {
			try {
				figura.aplicarTema();
			} catch (UnsupportedOperationException exception){
				System.out.println(exception);
				// Si se quiere a�adir el nombre de la figura habr�a que acceder
				// a la vista FigurasGeometricas que es donde est� implementado
				// el m�todo getNombre()
			}
		}
	}
}
