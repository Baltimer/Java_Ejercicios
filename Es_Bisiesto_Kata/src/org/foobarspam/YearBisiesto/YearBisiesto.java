package org.foobarspam.YearBisiesto;

public class YearBisiesto {
	private int year = 0;
	
	public YearBisiesto(){
		this.year = 0;
	}
	
	public YearBisiesto(int year){
		this.year = year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public boolean esBisiesto(){
		return (getYear() % 4 == 0 && (getYear() % 100 != 0 || getYear() % 400 == 0));
	}
}