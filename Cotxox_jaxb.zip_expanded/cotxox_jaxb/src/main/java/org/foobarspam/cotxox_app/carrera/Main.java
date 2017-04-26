package org.foobarspam.cotxox_app.carrera;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {
	
	public static void main(String[] args) {	
		try {
			final JAXBContext jc = JAXBContext.newInstance(Carrera.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
			InputStream in = new FileInputStream("src/main/resources/org/foobarspam/cotxox_app/schemas/CotxoxSchema.xml");
	        final JAXBElement<Carrera> menuElement = (JAXBElement<Carrera>)u.unmarshal(in);
			System.out.println("Tarjeta Credito:\t" + menuElement.getValue().getTarjetaCredito());
			System.out.println("Origen:\t\t\t" + menuElement.getValue().getOrigen());
			System.out.println("Destino:\t\t" + menuElement.getValue().getDestino());
			System.out.println("Distancia:\t\t" + menuElement.getValue().getDistancia());
			System.out.println("Tiempo esperado (min):\t" + menuElement.getValue().getTiempoEsperadoMinutos());
			System.out.println("Tiempo carrera:\t\t" + menuElement.getValue().getTiempoCarrera());
			System.out.println("Coste esperado:\t\t" + menuElement.getValue().getCosteEsperado());
			System.out.println("Coste total:\t\t" + menuElement.getValue().getCosteTotal());
			System.out.println("Propina:\t\t" + menuElement.getValue().getPropina());
			System.out.println("Conductor:\t\t"+menuElement.getValue().getConductor().getNombre());
	
			// Marshalling to a java.io.OutputStream == a consola:
			
			System.out.println("Objeto en memoria marshalled a XML: ");
			
			Marshaller m = jc.createMarshaller(); 			
			m.marshal(menuElement, System.out );
			
			// Marshalling to a File:
			
			File fichero = new File("src/main/resources/org/foobarspam/cotxox_app/schemas/marshalizado.xml");
			fichero.createNewFile();
			// createNewFile() atomically creates a new, empty file named by this abstract pathname 
			// if and only if a file with this name does not yet exist.
			
			m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "https://api.mobipalma.mobi/docs/ CotxoxSchema.xsd");
			m.marshal(menuElement, fichero );
			System.out.println("\n Objeto en memoria marshalled a fichero: " + fichero.getPath());
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}