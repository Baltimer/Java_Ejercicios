package org.foobarspam.VentasSupermercado.Supermercado;

public class Supermercado {
	
	// Propiedades
	private String nombre = null;
	private double recaudacionAnual = 0;
	
	// Constructores
	public Supermercado(){
		
	}
	
	public Supermercado(String nombre, double recaudacionAnual){
		this.nombre = nombre;
		this.recaudacionAnual = recaudacionAnual;
	}
	
	// Setters y Getters
	public String getNombre(){
		return this.nombre;
	}
	public double getRecaudacionAnual(){
		return this.recaudacionAnual;
	}
	
}