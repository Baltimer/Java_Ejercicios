package org.foobarspam.MedicineClash.testing;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import org.foobarspam.MedicineClash.Patient.*;
import org.foobarspam.MedicineClash.Medicine.*;
import org.foobarspam.MedicineClash.Prescription.*;

public class PatientTest {
	Prescription prescription, prescription2, prescription3;
	Medicine medicine, medicine2, medicine3;
	Patient uglyPatient;
	
	@Before
	public void setUp(){
		prescription = new Prescription(new Date(2017-01-17), 4);
		prescription2 = new Prescription(new Date(2017-01-17), 4);
		medicine = new Medicine("Paracetamol");
		medicine2 = new Medicine("Ibuprofeno");
		medicine.addPrescription(prescription);
		medicine2.addPrescription(prescription2);
		uglyPatient = new Patient();
		uglyPatient.addMedicine(medicine);
		uglyPatient.addMedicine(medicine2);
	}
	
	@Test
	public void comprobarPacieteTest() {
		assertTrue(uglyPatient.getMedicines().contains(medicine));
		assertFalse(uglyPatient.getMedicines().contains(medicine3));
		System.out.println(prescription.finishDate());
	}

}