package org.foobarspam.furnaceKata.devices;

import org.foobarspam.furnaceKata.Temperature.AmbientTemperature;
import org.foobarspam.furnaceKata.interfaces.Heater;

public class GasHeater implements Heater {

	public void engage(AmbientTemperature temperature) {
		temperature.changeTemperature(+1);
	}

	public void disengage(AmbientTemperature temperature) {
		temperature.changeTemperature(-1);
	}
	
}
