package Pruebas;

import Eventos.*;
import Objetos.*;
import Personajes.*;

public class PruebaBatalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armas arma = new Armas();
		Gladiador gladiador1 = new Gladiador(arma);
		
		Armas arma2 = new Armas();
		Gladiador gladiador2 = new Gladiador(arma2);	
		
		
		Armas arma3 = new Armas();
		Gladiador gladiador3 = new Gladiador(arma3);
		
		//Combate combate = new Combate(5,gladiador1,gladiador2);	
		
		Persona persona = new Persona();
		
		persona.verEstadisticas();
		
		
		
		//  PRUEBA CREACION DE GLADIADOR
		
		
	/*	
		System.out.println("Gladiador " + gladiador1.getNombre() + ": Vida=" + gladiador1.getVida() + " // Fuerza=" + gladiador1.getFuerza() + " // Vivo=" + gladiador1.isVivo() + " // Arma=" + gladiador1.getArma().getDaño() + " // Agilidad=" + gladiador1.getAgilidad());
		System.out.println("Gladiador " + gladiador2.getNombre() + ": Vida=" + gladiador2.getVida() + " // Fuerza=" + gladiador2.getFuerza() + " // Vivo=" + gladiador2.isVivo() + " // Arma=" + gladiador2.getArma().getDaño() + " // Agilidad=" + gladiador2.getAgilidad());	
		System.out.println("Gladiador " + gladiador3.getNombre() + ": Vida=" + gladiador3.getVida() + " // Fuerza=" + gladiador3.getFuerza() + " // Vivo=" + gladiador3.isVivo() + " // Arma=" + gladiador3.getArma().getDaño() + " // Agilidad=" + gladiador3.getAgilidad());	
		
		combate.combate(gladiador1, gladiador2);
		
		System.out.println("Gladiador " + gladiador1.getNombre() + ": Vida=" + gladiador1.getVida() + " // Fuerza=" + gladiador1.getFuerza() + " // Vivo=" + gladiador1.isVivo() + " // Arma=" + gladiador1.getArma().getDaño() + " // Agilidad=" + gladiador1.getAgilidad());
		System.out.println("Gladiador " + gladiador2.getNombre() + ": Vida=" + gladiador2.getVida() + " // Fuerza=" + gladiador2.getFuerza() + " // Vivo=" + gladiador2.isVivo() + " // Arma=" + gladiador2.getArma().getDaño() + " // Agilidad=" + gladiador2.getAgilidad());	
		System.out.println("Gladiador " + gladiador3.getNombre() + ": Vida=" + gladiador3.getVida() + " // Fuerza=" + gladiador3.getFuerza() + " // Vivo=" + gladiador3.isVivo() + " // Arma=" + gladiador3.getArma().getDaño() + " // Agilidad=" + gladiador3.getAgilidad());	
	*/
		
		// PRUEBA MENU

		
		
	}

}
