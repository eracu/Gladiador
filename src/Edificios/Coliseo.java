package Edificios;

import java.util.Scanner;

import Personajes.Persona;

public class Coliseo {
	
	// ATRIIBUTOS
	
	private int publico;
	private int recompensa;
	
	// CONSTRUCTOR
	
	public Coliseo()
	{
		this.publico = (int) (Math.random()*100);
		this.recompensa = (int) (Math.random()*20);
	}
	
	// METODOS
	
	public Persona contrincanteAleatorio()
	{
		Persona persona = new Persona();
		return persona;
	}
	
	public boolean ofertaPelea(Persona contrincante)
	{
		System.out.println("Su posible adversario (publico=" + this.publico + "/recompensa=" + this.recompensa + ")");
		contrincante.verEstadisticas();
		System.out.println("¿Desea luchar?:(S=1/N=2)");
		
    	Scanner entrada = new Scanner(System.in);
    	int respuesta;
    	
    	respuesta = entrada.nextInt(); 
    	
    	if(respuesta == 1) return true;
    	else return false;
	}
	
	public int pelea(Persona persona1,Persona persona2)
	{
		System.out.println("¡¡ EMPIEZA LA BATALLA ¡¡");
		
		while (persona1.isVivo() == true && persona2.isVivo() == true)
		{
			persona1.hacerDaño(persona2);
			persona2.hacerDaño(persona1);
		}
		
		if(persona1.isVivo() ==  false && persona2.isVivo() == false)
		{
			return 0;
		}
		else if(persona2.isVivo() == false) return 1;
		else return 2;
	}


	// GET Y SET
	

	public int getPublico() {
		return publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}

	public int getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}
	
}
