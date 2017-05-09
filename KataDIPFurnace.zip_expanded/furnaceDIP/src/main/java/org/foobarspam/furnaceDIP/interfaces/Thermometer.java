package org.foobarspam.furnaceDIP.interfaces;

import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Singleton;


public interface Thermometer {
	
	public double read(RoomTemperature temperature);
}
