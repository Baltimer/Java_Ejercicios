package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.*;
import org.foobarspam.cotxox.tarifa.*;

public class Carrera {
	// ---------- Atributos ----------
	private double costeTotal = 0;
	private Conductor conductor;
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0;
	private int tiempoEsperadoMinutos = 0;
	private int propina = 0;
	
	
	// ---------- Constructores ----------
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}
	
	// ---------- Setters y Getters ----------
	public void setOrigen(String origen){
		this.origen = origen;
	}
	public void setDestino(String destino){
		this.destino = destino;
	}
	public void setTiempoEsperado(int tiempoEsperado){
		this.tiempoEsperadoMinutos = tiempoEsperado;
	}
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	public void setConductor(Conductor conductor){
		this.conductor = conductor;
	}
	public void setCosteTotal(double costeTotal){
		this.costeTotal = costeTotal;
	}
	public void setPropina(int propina){
		this.propina = propina;
	}
	
	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}
	public String getOrigen(){
		return this.origen;
	}
	public String getDestino(){
		return this.destino;
	}
	public double getDistancia(){
		return this.distancia;
	}
	public int getTiempoEsperado(){
		return this.tiempoEsperadoMinutos;
	}
	public Conductor getConductor(){
		return this.conductor;
	}
	public double getCosteTotal(){
		return this.costeTotal;
	}
	public int getPropina(){
		return this.propina;
	}
	
	
	// ---------- Métodos ----------
	public double getCosteEsperado(){
		return Tarifa.getCosteTotalEsperado(getDistancia(), getTiempoEsperado());
	}
	
	public void asignarConductor(PoolConductores conductores){
		setConductor(conductores.asignarConductor());
	}
	
	public void realizarPago(double pago){
		setCosteTotal(pago);
	}
	
	public void recibirPropina(int propina){
		setPropina(propina);
	}
	
	public void liberarConductor(){
		getConductor().setOcupado(false);
	}
}