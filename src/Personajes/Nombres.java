package Personajes;

public enum Nombres {

	Julio,
	Tilus,
	Rines,
	Yakob,
	Usune,
	
	Rastos,
	Marcu,
	Jacop,
	Gulant,
	Rexxor,
	
	Eracu;
	
	public static Nombres nombreAleatorio() {
		Nombres direcciones[] = values();
		return direcciones[(int)(Math.random()*direcciones.length)];
	}
}


