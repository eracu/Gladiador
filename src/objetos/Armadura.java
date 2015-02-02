package objetos;

/**
 * Clase hija de Objeto que representa
 * armaduras en el juego
 * @author fonsi
 *
 */
public class Armadura extends Objeto{
	// Atributos
	int fortaleza;
	
	// Constructores
	public Armadura() {
		super();
	}
	
	public Armadura(int nivel) {
		super(nivel);
	}
	
	public Armadura(int nivel, int fortaleza) {
		super(nivel);
		this.fortaleza = fortaleza;
	}
	
	// Consulta y Establecimiento
	
	/**
	 * Método que calcula la protección
	 * de la armadura
	 * dependiendo de su nivel y su fortaleza
	 * @return Daño producido por el arma
	 */
	public int getProteccion() {
		int aleatorio = (int) Math.random()*100;
		
		return aleatorio + fortaleza + nivel;
	}
	
	// Métodos
	
	
}
