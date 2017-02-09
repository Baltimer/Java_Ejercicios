package tarjetaUsuario;

public class TarjetaUsuario {
	// -------------------- Propiedades --------------------
	private String id = null;
	private Boolean activada = false;
	
	// -------------------- Constructores --------------------
	public TarjetaUsuario(){
		
	}
	public TarjetaUsuario(String id, Boolean activada){
		this.id = id;
		this.activada = activada;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	
	// -------------------- Getters y Setters --------------------
	public void setActivada(Boolean activada){
		this.activada = activada;
	}
	public Boolean getActivada(){
		return this.activada;
	}
}

