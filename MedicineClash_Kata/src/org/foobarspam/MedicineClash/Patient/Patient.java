package org.foobarspam.MedicineClash.Patient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.foobarspam.MedicineClash.Medicine.*;

public class Patient {
	// ---------- Properties ----------
	private int defaultDaysBack = 90;
    private Collection<Medicine> medicines = new ArrayList<Medicine>();

    public Collection<Medicine> getMedicines(){
    	return this.medicines;
    }
    public void addMedicine(Medicine medicine) {
        this.medicines.add(medicine);
    }

    public Collection<Date> clash(Collection<String> medicineNames) {
        return clash(medicineNames, this.defaultDaysBack);
    }

    public Collection<Date> clash(Collection<String> medicineNames, int daysBack) {
        // TODO: implement this method
        return null;
    }
}