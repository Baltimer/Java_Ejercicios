package org.foobarspam.furnaceDIP.Main;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.Regulator;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.inyector.RegulatorModule;
import org.foobarspam.furnaceDIP.otherstuff.Jedi;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	final double minTemp = 15.0;
//        final double maxTemp = 21.0;
        
        Injector injector = Guice.createInjector(new RegulatorModule());
        
        Regulator regulator = injector.getInstance(Regulator.class);
        
        regulator.setMinTemp(15);
        regulator.setMaxTemp(21);
//        RoomTemperature temperature = new RoomTemperature(15);
//        Heater heater = new GasHeater();
//        Thermometer thermometer = new RemoteCommandSensor();
        
//        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate();
        
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate();
        yoda.speak();
    }
}
