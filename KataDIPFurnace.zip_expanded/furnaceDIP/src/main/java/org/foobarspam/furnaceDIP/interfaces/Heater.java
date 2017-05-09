package org.foobarspam.furnaceDIP.interfaces;

import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Singleton;


public interface Heater {
	
	public void engage(RoomTemperature temperature);
	public void disengage(RoomTemperature temperature);

}