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
	private boolean vivo;
	
	private int nivel;
	private int enfado;
	
	private Rasgo rasgo;
	private Maestria maestria;
	private Naturaleza naturaleza;
	
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
		
		this.vivo = true;
	}
	
	//METODOS
	
	public void verEstadisticas()
	{
		
		System.out.println("Esclavo " + this.apodo + ": Vida= " + this.vida + "/" + this.vidaMax + " - "
				+ " Energia= " + this.energia + "/" + this.energiaMax + " - " + "Fuerza= " + this.fuerza + " - "
				+ "Destreza= " + this.destreza + " - " + "Inteligencia= " + this.inteligencia + " - "
				+ "Enfado= " + this.enfado + " - " );
		
	}

	public void recibirDaño(int daño)
	{
		 this.vida = this.vida - daño;
		 comprobarVivo();
	}
	
	public void comprobarVivo()
	{
		if(this.vida <= 0)this.vivo = false;
	}
	
	// GET Y SET

	public int getVidaMax() {
		return vidaMax;
	}

	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getEnergiaMax() {
		return energiaMax;
	}

	public void setEnergiaMax(int energiaMax) {
		this.energiaMax = energiaMax;
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

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getHambre() {
		return hambre;
	}

	public void setHambre(int hambre) {
		this.hambre = hambre;
	}

	public int getHambreMax() {
		return hambreMax;
	}

	public void setHambreMax(int hambreMax) {
		this.hambreMax = hambreMax;
	}

	public Nombres getApodo() {
		return apodo;
	}

	public void setApodo(Nombres apodo) {
		this.apodo = apodo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getEnfado() {
		return enfado;
	}

	public void setEnfado(int enfado) {
		this.enfado = enfado;
	}

	public Rasgo getRasgo() {
		return rasgo;
	}

	public void setRasgo(Rasgo rasgo) {
		this.rasgo = rasgo;
	}

	public Maestria getMaestria() {
		return maestria;
	}

	public void setMaestria(Maestria maestria) {
		this.maestria = maestria;
	}

	public Naturaleza getNaturaleza() {
		return naturaleza;
	}

	public void setNaturaleza(Naturaleza naturaleza) {
		this.naturaleza = naturaleza;
	}

	
	public boolean isVivo() {
		return vivo;
	}

	
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


}
