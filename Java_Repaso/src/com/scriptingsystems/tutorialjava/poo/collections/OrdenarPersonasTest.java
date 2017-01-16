/**
 * 
 */
package com.scriptingsystems.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 * @author cice
 *
 */
import com.scriptingsystems.tutorialjava.poo.Persona;

public class OrdenarPersonasTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Persona> list = new ArrayList<>(); 
	
		list.add(new Persona("Jean Carlos", 33));
		list.add(new Persona("Ángel", 4));
		list.add(new Persona("Javier", 40));
		list.add(new Persona("Rosa", 41));
		list.add(new Persona("Flor", 43));
		
		/*
		Collections.sort(list, new Comparator<Persona>(){
			
			
			@Override
			public int compare (Persona p1, Persona p2) {
				return p1.getEdad()-p2.getEdad();
			}
			
		});
		*/
		Collections.sort(list, (o1, o2) -> o1.getEdad() - o2.getEdad());
		
		/*
		 * Tambien se puede hacer de la siguiente manera
		 
		Collections.sort(list, new ComparacionPersona() );
		*/
		
		for (Persona p : list) {
			System.out.println(p);
		}
	}

}
