package org.foobarspam.furnaceKata.main;

import org.foobarspam.furnaceKata.Temperature.AmbientTemperature;
import org.foobarspam.furnaceKata.devices.GasHeater;
import org.foobarspam.furnaceKata.devices.Regulator;
import org.foobarspam.furnaceKata.devices.RemoteComandSensor;
import org.foobarspam.furnaceKata.interfaces.Heater;
import org.foobarspam.furnaceKata.interfaces.Thermometer;

public class Main {
	public static void main(String[] args){		
		System.out.println("Arrancando\n");
		
		final double minTemp = 15.0;
		final double maxTemp = 21.0;
		
		AmbientTemperature temperature = new AmbientTemperature(15.2);
		
		Heater gasHeater = new GasHeater();
		Thermometer remoteComandSensor = new RemoteComandSensor();
		
		Regulator regulator = new Regulator();
		regulator.regulate(remoteComandSensor, gasHeater, minTemp, maxTemp, temperature);
	}
}