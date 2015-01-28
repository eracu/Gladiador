package Personajes;

import Objetos.Armas;

public class Gladiador {

	// ATRIBUTOS
	
	
	private int	vida;
	private int energia;
	private int fuerza;
	private int agilidad;
	private boolean vivo;
	
	private int nombre;
	
	private Armas arma;
	
	// CONSTRUCTOR
	
	public Gladiador (Armas arma) {
		
		int aux = (int) (Math.random()*20) ;	// Quita daño del arma aleatoriamente
		this.vida = 100 - aux;
		
		aux = (int) (Math.random()*20) ;		
		this.energia = 100 -aux;
		
		aux = (int) (Math.random()*30) ;
		this.fuerza = 100-aux;
		
		aux = (int) (Math.random()*30) ;
		this.agilidad = 100-aux;
		
		this.vivo = true;
		
		this.arma = arma;
		
		this.nombre = (int) (Math.random()*30);
	}
	
	public Gladiador (Gladiador gladiador) {
		
		this.vida = gladiador.getVida();		
		this.energia = gladiador.getEnergia();		
		this.fuerza = gladiador.getFuerza();	
		this.agilidad = gladiador.getAgilidad();	
		this.vivo = gladiador.isVivo();	
		this.arma = gladiador.getArma();	
		this.nombre = gladiador.getNombre();
	}
	
	
	// METODOS
	
	public void recibirDaño(int daño)
	{
		this.vida = this.vida - daño;
		if(this.vida <= 0)
		{
			this.vivo = false;
		}
	}
	
	public void	hacerDaño(Gladiador victima)
	{
		int aux = this.agilidad % 10;
		aux = aux * 5 + 40;
		
		int acierto = (int) (Math.random()*100);
		
		if(acierto <= aux)
		{
			System.out.println("Gladiador " + victima.nombre + " recibe " + this.arma.getDaño());
			victima.recibirDaño(this.arma.getDaño());
		}
		else
		{
			System.out.println("Gladiador " + this.nombre + " falla el ataque.");
		}
		
	}



	public void	verEstadisticas()
	{
		System.out.println("Gladiador " + this.nombre + ": vidaMax=" + this.vida + " // energia=" + this.energia
				+ " // fuerza=" + this.fuerza + " // Agilidad=" + this.agilidad);
	}
	
	// GET Y SET
	
	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getEnergia() {
		return energia;
	}


	public void setEnergia(int energia) {
		this.energia = energia;
	}


	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public int getAgilidad() {
		return agilidad;
	}


	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}


	public boolean isVivo() {
		return vivo;
	}


	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


	public int getNombre() {
		return nombre;
	}


	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


	public Armas getArma() {
		return arma;
	}


	public void setArma(Armas arma) {
		this.arma = arma;
	}

	

	}





