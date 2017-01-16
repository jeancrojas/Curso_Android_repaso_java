package com.scriptingsystems.tutorialjava.poo;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String domicilio;
	
	//Constructores
	/**
	 * @param nombre String
	 * @param edad  int
	 * @param domicilio String
	 */
	public Persona(String nombre, int edad, String domicilio) {
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
	}
	
	/**
	 * @param nombre String
	 * @param edad int
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = "";
	}



	/**
	 * 
	 */
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.domicilio = "";
	}
	/**
         * 
         * @param p Persona
         */
	public Persona(Persona p) {
		this.nombre = p.getNombre ();
		this.edad = p.getEdad ();
		this.domicilio = p.getDomicilio ();
	}
	
	
	// Funciones - GET and SET
	
	/**
	 * @return the nombre type
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		
		if (  edad > 0) {
			this.edad = edad;
		} else {
			this.edad = 0;
		}	
	}
	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
        
        
	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	/* (non-Javadoc)
	 * @return the message the person
	 */
	@Override
	public String toString() {
		return "\nNombre: "+nombre+"\nEdad:"+edad+"\nDomicilio: "+domicilio;
	}	

    
        
        

}
