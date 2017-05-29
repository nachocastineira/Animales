package ar.edu.unlam.pb2;

public abstract class Animal {
	
	//atributo
	private Integer edad;
	
	//constructor
	public Animal (Integer edad)
	{
		this.edad = edad;
	}
	
	// metodos abstractos
	public abstract void nacer();
	public abstract void comer();
	
	
	//Getter y Setter
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	// metodos comunes
	public void crecer(){
		
		edad++;
		System.out.println("El animal ha crecido");
	}
	
	

}
