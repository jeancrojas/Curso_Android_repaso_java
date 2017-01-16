package com.scriptingsystems.tutorialjava.poo.interfaces;

public class ClasificadorTest {
	
	public static void main (String[] args) {
                // clase Comparable 
		Comparable[] list = {	new Racional (3, 4), 
					new Racional (5, 2),
					new Racional (7, 5),
					new Racional (5, 8),
					new Racional (7, 8)};
		try {
                        // La clase Clasificador tiene un metodo static 
                        //getMinimo con un parametro de tipo Comparable,
                        //se hace un casting de la array pasado
			Racional r = (Racional) Clasificador.getMinimo(list);
			System.out.println(r);
		} catch ( ComparationException e ) {
			e.printStackTrace();
		}
		
		
	}
	
}
