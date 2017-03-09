package org.foobarspam.MedicineClash.Prescription;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prescription {
    
    private Date dispenseDate = new Date();
    private int daysSupply = 30;
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private String dia = "17/01/2017";
    Date startDate = df.parse(dia);
    
    public Prescription(Date dispenseDate, int daysSupply) {
    	this.dispenseDate = dispenseDate;
        this.daysSupply = daysSupply;
    }
    public Date getDispenseDate(){
    	return this.dispenseDate;
    }
}