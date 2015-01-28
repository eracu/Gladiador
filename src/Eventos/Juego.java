package Eventos;

import java.util.ArrayList;
import java.util.Scanner;

import Edificios.Tienda;
import Objetos.Armas;
import Personajes.Gladiador;

public class Juego {

	
	// ATRIBUTOS
	
	private int dinero;
	private int fama;
    private Tienda tienda;
	private ArrayList<Gladiador> gladiadores = new ArrayList<Gladiador>();
	
    // CONSTRUCTOR
    
    public Juego()
    {
    	this.dinero = 300;
    	this.fama = 0;
    	
    	Tienda tienda = new Tienda();
    	this.tienda = tienda;
    	
    	Armas arma1 = new Armas();
    	Gladiador gladiador1 = new Gladiador(arma1);
    	
    	Armas arma2 = new Armas();
    	Gladiador gladiador2 = new Gladiador(arma2);  
    	
    	this.gladiadores.add(gladiador1);
    	this.gladiadores.add(gladiador2);
    }
    
    
    // ATRIBUTOS
    
    public void Menu()
    {
    	
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	while(true)
    	{
    		System.out.println("--------------");
    		System.out.println("Dinero: " + dinero + " // Fama: " + fama);
	    	System.out.println("-----MENU-----");
	    	System.out.println("1)Ver Disponibles");
	    	System.out.println("2)Tienda");
	    	System.out.println("3)Luchar");
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
	    		ArrayList<Gladiador> gladiadoresAux = tienda.oferta();
	    		
	    		if(gladiadoresAux.size() == 0)
	    		{
	    			return;
	    		}
	    		dinero = dinero - 100;
	    		gladiadores.addAll(gladiadoresAux);
	    	}
	    	
	    	// LUCHAR
	    	
	    	
	    	if(respuesta == 3)
	    	{
		    	Armas arma = new Armas();
		    	Gladiador gladiador = new Gladiador(arma);	
		    	Combate combate = new Combate(100);	
		    	
		    	System.out.println("Su posible contrincante");
		    	gladiador.verEstadisticas();
		    	System.out.println("¿Desea Luchar, lo veran " + combate.getEspectadores() + "? (S=1/N=2)");
		    	
		    	respuesta = entrada.nextInt(); 
		    	if ( respuesta == 1)
		    	{
		    		
		    		Gladiador gladiador2 = new Gladiador(gladiador);
		    		gladiador2 = seleccionarGladiador();
		    				
		    		combate.combate(gladiador2,gladiador);
		    		
		    		if((gladiador2.isVivo() == false) && (gladiador.isVivo() == false))
		    		{
		    			System.out.println("ESTA DOBLE MUERTE SERA ESCUCHADA POR EL POPULACHO ¡¡¡");
		    			System.out.println("Recibes el doble de fama ¡¡");
		    			
		    			this.fama = fama + combate.getEspectadores() * 2;
		    		}
		    		
		    		else if((gladiador2.isVivo() == false))
		    		{
		    			System.out.println("Tu gladiador " + gladiador2.getNombre() + " fue asesinado por "
		    					+ gladiador.getNombre());
		    			System.out.println("Pierdes 30 de fama");
		    			
		    			this.fama = fama - 30;
		    		}
		    		else if((gladiador.isVivo() == false))
		    		{
		    			System.out.println("Tu gladiador " + gladiador2.getNombre() + " DESTROZA A "
		    					+ gladiador.getNombre() + " ¡¡");
		    			
		    			System.out.println("Ganas " + combate.getEspectadores());
		    			
		    			this.fama = fama + combate.getEspectadores();
		    		}
		    		
		    	}
		    	
		    	
	    	}
	    
	    	
	    	
	    	
	    	
	    	
    	}
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //         METODOS           METODOS              METODOS 
    ////////////////////////////////////////////////////////////////////////////
    
    public void verDisponibles ()
    {
    	System.out.println("Esclavos en propiedad:");
    	for(int i = 0; i < gladiadores.size();i++)
    	{
    		gladiadores.get(i).verEstadisticas();
    	}
    }
    
    public Gladiador seleccionarGladiador()
    {
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	System.out.println("¿Cual de sus gladiadores selecciona ? : ");
    	verDisponibles();

    	respuesta = entrada.nextInt(); 
    	
    	return		gladiadores.get(respuesta);
    }
    
    
    
    
}
    
