package com.scriptingsystems.tutorialjava.poo.interfaces;

import java.util.Comparator;
import com.scriptingsystems.tutorialjava.poo.Persona;

/**
 * 
 * @author jeanrojas
 * 
 */
public class ComparadorPersona implements Comparator<Persona>{

        
        /**
         * 
         * @param p1
         * @param p2
         * @return 
         * @see SE HACE USO DE ESTA CLASE EN LA CLASE "OrdenarPersonasTest.JAVA" del paquete com.scriptingsystems.tutorialjava.poo.collections;
         */
	@Override
	public int compare(Persona p1, Persona p2) {   
		return p1.getEdad()-p2.getEdad();
                
	}
           

}
