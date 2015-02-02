package objetos;

/**
 * Clase hija de Objeto que representa
 * armas en el juego
 * @author fonsi
 *
 */
public class Arma extends Objeto{
	
	// Atributos
	int fuerza;
	
	// Constructores
	public Arma() {
		super();
		fuerza = 5;
	}
	
	public Arma(int nivel){
		super(nivel);
		fuerza = 5;
	}
	
	public Arma(int nivel, int fuerza) {
		super(nivel);
		this.fuerza = fuerza;
	}
	
	// Obtención y Establecimiento
	/**
	 * Método que calcula el daño
	 * producido por el arma
	 * dependiendo de su nivel y su fuerza
	 * @return Daño producido por el arma
	 */
	public int getDano() {
		int aleatorio = (int) (Math.random()*100);
		
		return aleatorio + fuerza + this.nivel;
	}
	
	// Métodos
}
