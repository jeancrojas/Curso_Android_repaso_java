package com.scriptingsystems.tutorialjava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		
		Estudiante e = new Estudiante( new Persona("Angel", 4, "Calle Falsa"), "1234J", "Matematica", "Lenguaje","Íngles");
		
		
		e.addCurso("Deporte");
		e.addCurso("Música");
		
		System.out.println(e);
		
		System.out.println("\n\nResultado: ");
		e.delCurso("Lenguaje");
		System.out.println(e);
	}

}
