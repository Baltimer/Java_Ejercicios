package org.foobarspam.furnaceDIP.inyector;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.otherstuff.Jedi;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;


public class RegulatorModule extends AbstractModule {

	@Override
	protected void configure(){
		// Binds de Heater
		bind(Heater.class).to(GasHeater.class);
		bind(Heater.class).annotatedWith(Force.class).to(Jedi.class);
		
		// Binds de Thermometer
		bind(Thermometer.class).to(RemoteCommandSensor.class);
	}
	
	@Provides @Singleton
	RoomTemperature provideRoomTemperature(){
		RoomTemperature roomTemperature = new RoomTemperature();
		roomTemperature.setTemperature(15);
		return roomTemperature;
	}
}
