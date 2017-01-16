package com.scriptingsystems.tutorialjava.poo;

public class PersonaTest {

	public static void main(String[] args) {
		System.out.println("\nConstruyendo un objecto de tipo persona...");
		Persona p = new Persona("Ángel", 4, "Calle No Me Acuerdo, -1" );
		System.out.println( p );
		System.out.println("\nObjecto persona construida... :D\n\n");
		
		p.setNombre("Jean Carlos");
		p.setEdad(-18);
		p.setDomicilio("Calle falsa, 69, Madrid");
		
		System.out.println( p );
	}

}
