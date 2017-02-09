package bicicleta;

public class Bicicleta {
	// -------------------- Propiedades --------------------
	private int id = 0;
	
	// -------------------- Constructores --------------------
	public Bicicleta(){
		
	}
	public Bicicleta(int id){
		this.id = id;
	}
	
	// -------------------- Getters y Setters --------------------
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}
