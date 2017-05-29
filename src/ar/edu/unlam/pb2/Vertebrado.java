package ar.edu.unlam.pb2;

public abstract class Vertebrado extends Animal  { //es una clase abstracta que hereda de Animal
	
	private String cabeza;
	private String tronco;
	private String extremidades;
	
	public Vertebrado (Integer edad)
	{
		super(edad);
	}
	
	// GETTER Y SETTER
	public String getCabeza() {
		return cabeza;
	}

	public void setCabeza(String cabeza) {
		this.cabeza = cabeza;
	}

	public String getTronco() {
		return tronco;
	}

	public void setTronco(String tronco) {
		this.tronco = tronco;
	}

	public String getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(String extremidades) {
		this.extremidades = extremidades;
	}


	//un metodo comun
	public void reproducir()
	{
		System.out.println("Se ha reproducido");
	}
	
	//como la clase es abstracta no tengo que escribir los metodos abstractos de la clase padre Animal

}
