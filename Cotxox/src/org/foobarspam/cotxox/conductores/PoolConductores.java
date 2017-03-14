package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	// ---------- Atributos ----------
	ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	// ---------- Constructores ----------
	public PoolConductores(ArrayList<Conductor> conductores){
		for (Conductor conductor : conductores){
			this.poolConductores.add(conductor);
		}
	}
	// ---------- Setters y Getters ----------
	public ArrayList<Conductor> getPoolConductores(){
		return this.poolConductores;
	}
	
	// ---------- Métodos ----------
	public Conductor asignarConductor(){
		// Nos aseguramos que sea un conductor aleatorio, para que no perdamos trabajadores.
		int numeroConductor = ThreadLocalRandom.current().nextInt(getPoolConductores().size());
		while(getPoolConductores().get(numeroConductor).getOcupado() != false){
			numeroConductor = ThreadLocalRandom.current().nextInt(getPoolConductores().size());
		}
		getPoolConductores().get(numeroConductor).setOcupado(true);
		return getPoolConductores().get(numeroConductor);
	}
}
