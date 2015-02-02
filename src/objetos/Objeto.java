package objetos;

/**
 * Clase padre de la que heredarán 
 * todo los objetos
 * @author fonsi
 *
 */
public class Objeto {
	
	// Atributos
	int nivel;
	
	// Constructores
	public Objeto(){
		int aleatorio = (int) (Math.random()*10);
		nivel = aleatorio + 60;
		
	}
	
	public Objeto(int nivel){
		this.nivel = nivel;
	}

	
	// Obtención y Establecimiento
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * Método que calcula el precio de un objeto
	 * dependiendo de su nivel
	 * @param nivel
	 * @return Precio del objeto
	 */
	public int getPrecio(int nivel) {
		return nivel * 100;
	}
	
	// Métodos
	
}
