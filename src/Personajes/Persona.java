package Personajes;

import Habilidades.Maestria;
import Habilidades.Naturaleza;
import Habilidades.Rasgo;

public class Persona {
	
	
	// ATRIBUTOS
	
	private int vidaMax;
	private int vida;
	private int energiaMax;
	private int energia;
	private int fuerza;
	private int destreza;
	private int inteligencia;	
	private int hambre;
	private int hambreMax;
	private Nombres apodo;
	
	private int nivel;
	private int enfado;
	
	private Rasgo rasgo;
	private Maestria maestria;
	private Naturaleza naturaleza;
	
	private int locura;
	
	// CONSTRUCTORES
	
	
	
	public Persona ()
	{
		int aux = (int) (Math.random()*40);
		this.vidaMax = aux + 60;
		this.vida = this.vidaMax;
		
		aux = (int) (Math.random()*40);
		this.energiaMax = aux + 60;
		this.energia = this.energiaMax;
		
		aux = (int) (Math.random()*20);
		this.fuerza = 30 + 20;
		
		aux = (int) (Math.random()*20);
		this.destreza = 30 + 20;		
	
		aux = (int) (Math.random()*20);
		this.inteligencia = 30 + 20;	
		
		this.hambreMax = 100;
		this.hambre = 100;
		
		this.nivel = 0;
		
		this.enfado = 0;
		
		this.rasgo = Rasgo.Nada;
		this.naturaleza = Naturaleza.Nada;
		this.maestria = Maestria.Nada;
		
		this.apodo = Nombres.nombreAleatorio();
	}
	
	//METODOS
	
	public void verEstadisticas()
	{
		
		System.out.println("Esclavo " + this.apodo + ": Vida= " + this.vida + "/" + this.vidaMax + " - "
				+ " Energia= " + this.energia + "/" + this.energiaMax + " - " + "Fuerza= " + this.fuerza + " - "
				+ "Destreza= " + this.destreza + " - " + "Inteligencia= " + this.inteligencia + " - "
				+ "Enfado= " + this.enfado + " - " );
		
	}
	
	
	
	// GET Y SET

}
