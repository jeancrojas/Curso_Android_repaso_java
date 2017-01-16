package com.scriptingsystems.tutorialjava.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Estudiante extends Persona {

	private String nie;
	private List<String> cursos;

	
	//Constructores
        public Estudiante () {
            cursos = new ArrayList<>();
        }
        
	/**
	 * @param nombre String
	 * @param edad int
	 * @param domicilio String
	 */
	public Estudiante(String nombre, int edad, String domicilio) {
		super(nombre, edad, domicilio);
	}

	/**
	 * @param nombre String
	 * @param edad int
	 * @param domicilio String
	 * @param nie String
	 * @param cursos String[]
	 */
	public Estudiante(String nombre, int edad, String domicilio, String nie, String[] cursos) {
		super(nombre, edad, domicilio);
		this.nie = nie;
		this.cursos = new ArrayList<>(Arrays.asList(cursos));
	}

	/**
	 * @param p Persona
	 * @param nie String
	 * @param cursos String[]
	 */
	public Estudiante(Persona p, String nie, String...cursos) {
		super(p.getNombre(), p.getEdad(), p.getDomicilio());
		this.nie = nie;
		this.cursos = new ArrayList<>(Arrays.asList(cursos));
	}

	//funciones
	@Override
	public String toString() {
		String datos = "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDomicilio: "+getDomicilio()+"\nNIE: "+nie;
		String listCourse = "";
		
		for (String c : this.cursos) {
			listCourse += "\n" + c;
		}
		
		return datos+ "\n\nCursos:"+ listCourse;
	}
	
	/**
	 * 
	 * @param curso
	 */
	public void addCurso (String curso) {
		cursos.add(curso);
		System.out.println("\nSe ha añadido el curso: " + curso);
	}
	
	/**
	 * 
	 * @param curso
	 */
	public void delCurso (String curso) {
		Iterator<String> i = cursos.iterator();
		
		while ( i.hasNext() ) {
			if ( i.next().equals(curso) ) {
				i.remove();
				System.out.println("\nSe ha eliminado el curso: " + curso);
			}
		}
	}
	

	//Funciones GET - SET
	/**
	 * @return the nie
	 */
	public String getNie() {
		return nie;
	}

	/**
	 * @param nie the nie to set
	 */
	public void setNie(String nie) {
		this.nie = nie;
	}
	


}
