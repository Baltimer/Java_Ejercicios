package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	// ---------- Atributos ----------
	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private double valoracionMedia = 0;
	private ArrayList<Short> valoraciones = new ArrayList<>();
	private Boolean ocupado = false;
	
	// ---------- Constructores ----------
	public Conductor(String nombre){
		this.nombre = nombre;
	}
	
	// ---------- Setters y Getters ----------
	public ArrayList<Short> getValoraciones(){
		return this.valoraciones;
	}
	public void setValoracionMedia(double valoracionMedia){
		this.valoracionMedia = valoracionMedia;
	}
	public void setOcupado(Boolean estado){
		this.ocupado = estado;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public Boolean getOcupado(){
		return this.ocupado;
	}
	public double getValoracionMedia(){
		return this.valoracionMedia;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getMatricula(){
		return this.matricula;
	}
	public double getValoracion(){
		return this.valoracionMedia;
	}
	
	// ---------- Métodos ----------
	public void setValoracion(short puntuacion){
		getValoraciones().add(puntuacion);
		double valoracionTotal= 0;
		for (short valoracion : getValoraciones()){
			valoracionTotal += valoracion;
		}
		setValoracionMedia(valoracionTotal/getValoraciones().size());
	}
	public Boolean isOcupado(){
		return getOcupado();
	}
}