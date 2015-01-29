package Eventos;

import java.util.ArrayList;
import java.util.Scanner;

import Edificios.Coliseo;
import Personajes.Persona;

public class Juego {

	
	// ATRIBUTOS
	
	private int dinero;
	private int fama;
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
    // CONSTRUCTOR
    
    public Juego()
    {
    	this.dinero = 300;
    	this.fama = 0;
    	
    	Persona persona = new Persona();
    	Persona persona1 = new Persona();
    	
    	this.personas.add(persona1);
    	this.personas.add(persona);
    }
    
    // ATRIBUTOS
    
    public void Menu()
    {
    	
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	while(true)
    	{
    		
    		eliminarMuertos();
    		
    		System.out.println("--------------");
    		System.out.println("Dinero: " + dinero + " // Fama: " + fama);
	    	System.out.println("-----MENU-----");
	    	System.out.println("1)Ver Disponibles");
	    	System.out.println("2)Coliseo");
	    	System.out.println("3)Tienda de Esclavos");
	    	System.out.println("4)Salir");
	    	System.out.println("Inserte una opcion: ");   	
	
	    	respuesta = entrada.nextInt(); 
	    	
	    	
	    	// VER DISPONIBLES
	    	
	    	if(respuesta == 1)
	    	{
	    		verDisponibles();
	    	}	    	
	    	
	    	// TIENDA
	    	
	    	if(respuesta == 2)
	    	{	
	    		coliseo();
	    	}
	    	
	    	// LUCHAR
	    		    	
	    	if(respuesta == 3)
	    	{
	    		System.out.println("No disponible en BETA");
		    }
	    	
    	}
    }
		    			
    ////////////////////////////////////////////////////////////////////////////
    //         METODOS           METODOS              METODOS 
    ////////////////////////////////////////////////////////////////////////////
    
    public void verDisponibles ()
    {
    	System.out.println("Esclavos en propiedad:");
    	for(int i = 0; i < personas.size();i++)
    	{
    		personas.get(i).verEstadisticas();
    	}
    }
    
    public Persona seleccionarPersona()
    {
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	System.out.println("¿Cual de tus Esclavos seleccionas? : ");
    	verDisponibles();

    	respuesta = entrada.nextInt(); 
    	
    	return	personas.get(respuesta);
    }
    
    public void eliminarMuertos()
    {
    	for(int i = 0; i < personas.size();i++)
    	{
    		if(personas.get(i).isVivo() == false)
    		{
    			personas.remove(i);
    		}
    	}
    }
    
    public void coliseo()
    {
    	Coliseo coliseo = new Coliseo();
    	Persona contrincante = new Persona(coliseo.contrincanteAleatorio());
    	int ganador;

    	boolean aux = coliseo.ofertaPelea(contrincante);
    	
    	if (aux == true)
    	{
    		Persona esclavo = new Persona();
    		esclavo = seleccionarPersona();
    		ganador = coliseo.pelea(esclavo, contrincante);
    		
    		if(ganador == 0)
    		{
    			System.out.println("¡¡ DOBLE MUERTE , EL POPULACHO ENLOQUECE ESTA MASACRE¡¡");
    			System.out.println("Recibes el doble de fama: " + coliseo.getPublico() * 2 +
    					" // Recibes dinero: " + coliseo.getRecompensa());
    			
    		    this.fama = this.fama + coliseo.getPublico() * 2; 
    		    this.dinero = this.dinero + coliseo.getRecompensa();
    		}
    		
    		else if(ganador == 1)
    		{
    			System.out.println("Tu Gladiador " + esclavo.getApodo() + " Destruye a su adversario ¡¡");
    			System.out.println("Recibes fama: " + coliseo.getPublico() +
    					" // Recibes dinero: " + coliseo.getRecompensa());
    			
    		    this.fama = this.fama + coliseo.getPublico(); 
    		    this.dinero = this.dinero + coliseo.getRecompensa();
    		}
    		else 
    		{
    			System.out.println("Tu Gladiador " + esclavo.getApodo() + " muere contra " + contrincante.getApodo() + " ¡¡");
    			System.out.println("Pierdes fama: " + 30);
    			
    		    this.fama = this.fama - coliseo.getPublico(); 
    		}
    	}
    }


}


    
