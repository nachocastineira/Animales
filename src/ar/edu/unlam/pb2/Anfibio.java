package ar.edu.unlam.pb2;

public class Anfibio extends Vertebrado implements Nadador, Caminador{  //clase que hereda de Vertebrado e implementa interfaces
	
	//atributos
	private String branqueas;
	private String pulmones;
	
	//constructor
	public Anfibio (Integer edad)
	{
		super(edad);
	}
		
	// GETTER Y SETTER
	public String getBranqueas() {
		return branqueas;
	}

	public void setBranqueas(String branqueas) {
		this.branqueas = branqueas;
	}

	public String getPulmones() {
		return pulmones;
	}

	public void setPulmones(String pulmones) {
		this.pulmones = pulmones;
	}


	//escribo los metodos abstractos heredados
	
	public void nacer()  //no es necesario poner el override porque la clase es abstracta
	{
		super.setEdad(0);
		System.out.println("El animal ha nacido");		
	}
	
	public void comer()
	{
		System.out.println("El animal comio");
	}
	
	public void nadar()
	{
		System.out.println("Ha nadado");
	}
	
	public void caminar()
	{
		System.out.println("Ha caminado");
	}

}
