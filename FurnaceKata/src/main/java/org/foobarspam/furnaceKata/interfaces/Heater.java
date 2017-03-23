package org.foobarspam.furnaceKata.interfaces;

import org.foobarspam.furnaceKata.Temperature.AmbientTemperature;

public interface Heater {
	public void engage(AmbientTemperature temperature);
	public void disengage(AmbientTemperature temperature);
}
