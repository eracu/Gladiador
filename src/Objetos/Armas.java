package Objetos;

public class Armas {

	// ATRIBUTOS
	
	private int daño;
	private	Tipo tipo;
	
	// CONSTRUCTOR
	
	public  Armas() {

		
		
		int aux = (int) (Math.random()*20) ;	// Quita daño del arma aleatoriamente
		this.daño = 50 - aux;
		
		int aux2 = (int) (Math.random()*1) ;	// Pone el tipo aleatoriamente
		if	(aux2 == 2)
			{
			this.tipo = Tipo.agilidad;
			}
		else 
			{
			this.tipo = Tipo.fuerza;
			}
	}

	// GET Y SET
	
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	// METODOS
	
}
