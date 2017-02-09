package org.foobarspam.FigurasGeometricas.figura;

public class Cuadrado extends FiguraGeometrica {

	private double lado = 0d;
	
	public Cuadrado(){
		super();
	}
	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double area(){
		double area = getLado() * getLado();
		return area;
	}
}
