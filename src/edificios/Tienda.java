package edificios;

import java.util.ArrayList;
import java.util.Scanner;

import personajes.Persona;

public class Tienda {
	
	// ATRIBUTOS
	
	private int precioEsclavos;
	
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	// CONSTRUCTORES
	
	public Tienda ()
	{
		this.precioEsclavos = 100;
		this.personas = generarEsclavosNuevos();
	}

	// METODOS

	public ArrayList<Persona> generarEsclavosNuevos()
	{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Persona persona = new Persona();
		Persona persona1 = new Persona();
		
		personas.add(persona);
		personas.add(persona1);
		
		return personas;
	}
	
	public boolean ofertaEsclavos()
	{

		System.out.println("Este Pack de esclavos por " + this.precioEsclavos + " Denarios:");
		verEsclavos();
		System.out.println("¿Comprar?(S=1/N=2)");
		
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	respuesta = entrada.nextInt();
    	
    	if(respuesta == 1)
    	{return true;}
    	else 
    	{return false;}
	}
	
	public void verEsclavos()
	{
		for (int i = 0 ; i < this.personas.size() ; i ++)
		{
			personas.get(i).verEstadisticas();
		}
	}
	
	public int menuTienda()
	{
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
		
		System.out.println("¿Que desea Comprar?");
		System.out.println("1)Esclavos");
		System.out.println("2)Armas");
		System.out.println("3)Armaduras");
		System.out.println("4)Accesorios");
		System.out.println("*)Àtras");
		
		respuesta = entrada.nextInt(); 
		
		return respuesta;
		
	}
	
	// GET Y SET

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public int getPrecioEsclavos() {
		return precioEsclavos;
	}

	public void setPrecioEsclavos(int precioEsclavos) {
		this.precioEsclavos = precioEsclavos;
	}
}
