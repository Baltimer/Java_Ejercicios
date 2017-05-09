package org.foobarspam.furnaceDIP.hardware;

import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Regulate;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.inyector.Force;
import org.foobarspam.furnaceDIP.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Inject;


public class Regulator implements Regulate{
	
	private Thermometer t;
	private Heater h;
	double minTemp;
	double maxTemp;
	private RoomTemperature roomTemperature;
	private RegulatorDisplayCodes code;
	
	@Inject
	public Regulator(Thermometer t, @Force Heater h){
		this.h = h;
		this.t = t;
	}
	
	public void regulate(){
			while(t.read(roomTemperature) < maxTemp){
				code = RegulatorDisplayCodes.HEATING;				
				h.engage(roomTemperature);
				message();
			}
			while (t.read(roomTemperature) > minTemp){
				code = RegulatorDisplayCodes.WAITING;
				h.disengage(roomTemperature);			
				message();
			}
	}

	public void message(){
		switch(code){
			case HEATING:
				System.out.println("Calentando => temperatura "+ roomTemperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => temperatura " + roomTemperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}
	
	@Inject
	public void setRoomTemperature(RoomTemperature t){
		this.roomTemperature = t;
	}
	
	public void setMinTemp(double minTemp){
		this.minTemp = minTemp;
	}
	
	public void setMaxTemp(double maxTemp){
		this.maxTemp = maxTemp;
	}

}
