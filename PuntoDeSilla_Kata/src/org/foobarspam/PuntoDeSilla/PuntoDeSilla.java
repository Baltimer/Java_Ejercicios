package org.foobarspam.PuntoDeSilla;

public class PuntoDeSilla {
	private int[][] matriz = new int[3][3];
	private int[] puntoDeSilla = new int[2];
	
	public PuntoDeSilla(int[][] matriz){
		this.matriz = matriz;
	}
	public PuntoDeSilla(){
		
	}
	
	public void setMatriz(int[][] matriz){
		this.matriz = matriz;
	}
	public int[][] getMatriz(){
		return this.matriz;
	}
	public int[] getPuntoDeSilla(){
		return this.puntoDeSilla;
	}
	public void setPuntoDeSilla(int fila, int columna){
		this.puntoDeSilla[0] = fila;
		this.puntoDeSilla[1] = columna;
	}
	
	public int recorrerMatriz(){
		int contador = 0;
		for (int fila = 0; fila < getMatriz()[0].length; fila++){
			for (int columna = 0; columna <getMatriz().length; columna++){
				contador += 1;
			}
		}
		return contador;
	}
	
	public int posicionValorMasBajoFila(int fila){
		int valorBajo = 10;
		Boolean iguales = false;
		int posicionIndiceFila = 5;
		for(int valor = 0; valor < getMatriz()[fila].length; valor++){
			if (getMatriz()[fila][valor] < valorBajo){
				valorBajo = getMatriz()[fila][valor];
				iguales = false;
				posicionIndiceFila = valor;
			}else if (getMatriz()[fila][valor] == valorBajo){
				iguales = true;
			}
		}
		if (iguales){
			posicionIndiceFila = 5;
		}
		return posicionIndiceFila;
	}
	
	public int valorMasAltoColumna(int posIndice){
		int valorAlto = 0;
		int posicionIndiceColumna = 5;
		for (int valor = 0; valor < getMatriz()[0].length; valor++){
			if(getMatriz()[valor][posIndice] > valorAlto){
				valorAlto = getMatriz()[valor][posIndice];
				posicionIndiceColumna = valor;
			}
		}
		return posicionIndiceColumna;
	}
	
	public void calcularPuntoDeSilla(){
		for (int fila = 0; fila < getMatriz()[0].length; fila++){
			if (posicionValorMasBajoFila(fila) != 5 && valorMasAltoColumna(posicionValorMasBajoFila(fila)) == fila){
				setPuntoDeSilla(fila, posicionValorMasBajoFila(fila));
			}
		}
	}
}
