package org.foobarspam.cotxox.tarifa;

public class Tarifa {
	// ---------- Atributos ----------
//	private String id = null;
	private final static double costeMilla = 1.35;
	private final static double costeMinuto = 0.35;
	private final double porcentajeComision = 20;
	
	// ---------- Constructores ----------
	public Tarifa(){
		
	}
	// ---------- Setters y Getters ----------
	public static double getCosteMilla(){
		return costeMilla;
	}
	public static double getCosteMinuto(){
		return costeMinuto;
	}
	public double getPorcentajeComision(){
		return this.porcentajeComision;
	}
	
	// ---------- Métodos ----------
	public double getCosteDistancia(double distancia){
		return distancia * getCosteMilla();
	}
	
	public double getCosteTiempo(int minutos){
		return minutos * getCosteMinuto();
	}
	
	public static double getCosteTotalEsperado(double distanciaEsperada, double tiempoEsperado){
		double totalCarrera = tiempoEsperado*getCosteMinuto() + distanciaEsperada * getCosteMilla();
		if (totalCarrera < 5){
			totalCarrera = 5;
		}
		return totalCarrera;
	}
}
