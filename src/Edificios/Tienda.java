package Edificios;

import java.util.ArrayList;
import java.util.Scanner;

import Eventos.Juego;
import Objetos.Armas;
import Personajes.Gladiador;

public class Tienda {

	
	// ATRIBUTOS
	
	// CONSTRUCTOR
    
    public Tienda ()
    {
    }
	
	// METODOS
	
	public  ArrayList<Gladiador> oferta()
	{
		ArrayList<Gladiador> gladiadores = new ArrayList<Gladiador>();
		
    	Armas arma1 = new Armas();
    	Gladiador gladiador1 = new Gladiador(arma1);
    	
    	Armas arma2 = new Armas();
    	Gladiador gladiador2 = new Gladiador(arma2);  
    	
    	System.out.println("Hola ¡¡ Bienvenido a la tienda, estos son mis mejores esclavos: ");
    	gladiador1.verEstadisticas();
    	gladiador2.verEstadisticas();
    	
    	System.out.println("¿Quiere comprarlos por 100$?(S=1/N=0)");
    	
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	respuesta = entrada.nextInt();
    	
    	if(respuesta == 1)
    	{
        	gladiadores.add(gladiador1);
        	gladiadores.add(gladiador2);
        	
        	return gladiadores;
        	
        	
    	}
    	
    	return gladiadores;
    	
	}
	
	
}
