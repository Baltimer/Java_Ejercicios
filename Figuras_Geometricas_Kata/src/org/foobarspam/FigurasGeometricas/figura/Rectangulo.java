package org.foobarspam.FigurasGeometricas.figura;

//Constructores de las figuras geometricas
public class Rectangulo extends FiguraGeometrica{
	//Inicializamos las variables para calcular el area
	private double altura = 0d;
	private double anchura = 0d;
	
	//Sobrecarga de los constructores
	public Rectangulo(){
		//Invoca al constructor de la clase abstracta FigurasGeometricas
		//dependiendo de los argumentos
		super();
	}
	
	public Rectangulo(double altura, double anchura){
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(String nombre, double altura, double anchura){
		super(nombre);
		this.altura = altura;
		this.anchura = anchura;
	}

	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.anchura = anchura;
	}
	
	//Sobreescritura de los métodos
	@Override
	public double area(){
		double area = getAltura() * getAnchura();
		return area;
	}
}