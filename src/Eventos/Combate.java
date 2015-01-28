package Eventos;

import Objetos.Armas;
import Personajes.*;

public class Combate {

	// ATRIBUTO
	
	private int espectadores;
	
	// CONSTRUCTOR
	
	public Combate (int esperactodres)
	{
		this.espectadores = espectadores;
	}
	
	
	// METODO
	
	public void combate (Gladiador gladiador1,Gladiador gladiador2)
	{
		
		while( (gladiador1.isVivo() == true) && (gladiador2.isVivo() == true))
		{
			gladiador1.hacerDaño(gladiador2);
			gladiador2.hacerDaño(gladiador1);
		}	
		if (gladiador1.isVivo() == false && (gladiador2.isVivo() == false))
				{
			System.out.println("DOBLE MUERTE ¡¡¡");
				}
		else if (gladiador1.isVivo() == false)
		{
			System.out.println("El Gladiador " + gladiador1.getNombre() + " MUERE ¡¡¡");
			System.out.println("Gladiador " + gladiador2.getNombre() + " GANA ¡¡¡");
		}
		else if (gladiador2.isVivo() == false)
		{
			System.out.println("El Gladiador " + gladiador2.getNombre() + " MUERE ¡¡¡");
			System.out.println("Gladiador " + gladiador1.getNombre() + " GANA ¡¡¡");
		}
	}

	public void Oferta ()
	{
		
		Armas arma = new Armas();
		Gladiador gladiadorAux = new Gladiador(arma);
		
		System.out.println("¡¡ RIVAL ENCONTRADO ¡¡ ");
		System.out.println("Posible Adversario: ");
		gladiadorAux.verEstadisticas();
		System.out.println("¿Luchar?(S=1/n=2)");
	}
	
	// GET Y SET
	
	public int getEspectadores() {
		return this.espectadores;
	}

	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}
	
}
