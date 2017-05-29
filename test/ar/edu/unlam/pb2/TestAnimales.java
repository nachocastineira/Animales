package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimales {

	@Test
	public void testQueCreaUnAnfibio() 
	{
		Anfibio rana = new Anfibio(10);  //instancio el objeto rana
		
		rana.setCabeza("cabeza");
		rana.setExtremidades("extremidades");
		rana.setBranqueas("branqueas");
		
		rana.nacer(); //nace el animal, su edad será 0 por defecto.
		
		rana.comer();  //pruebo metodos
		rana.caminar();
		rana.nadar();	
		rana.reproducir();
		
		
		rana.crecer(); //la edad crece de 1 en 1
		rana.crecer();
		rana.crecer();
		rana.crecer();
		
		assertEquals(rana.getEdad(), 4, 0);	//comparo edad, subio por el metodo crecer			
	}

}
