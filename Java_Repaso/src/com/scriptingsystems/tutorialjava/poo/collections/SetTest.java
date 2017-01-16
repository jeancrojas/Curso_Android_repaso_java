package com.scriptingsystems.tutorialjava.poo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.scriptingsystems.tutorialjava.poo.interfaces.Racional;

public class SetTest {

        /**
         * 
         * @see Set para ordenar hace uso de "equals" y "hashCode"
         */
    
	public static void main (String[] args) {
	
        
                Set<String> myStringSet = new HashSet<>();
                Set<Racional> myRacionalSet = new HashSet<>();
		
		
		myStringSet.add("Luis");
		myStringSet.add("Luis");
		myStringSet.add("Manuel");
		myStringSet.add("Jose");
		myStringSet.add("Alberto");
		
		
		System.out.println("\n\nRecorriendo con FOREACH...");
		for (String s : myStringSet) {
			System.out.println(s);
		}
		
		Iterator<String> i = myStringSet.iterator();
		
		System.out.println("\n\nRecorriendo con un iterador...");
		while ( i.hasNext() ) {
                    String str=i.next();
                    System.out.println( str );
		}
		
		
		System.out.println("\n\nInicializando pruebas de Racionales");
		
		myRacionalSet.add(new Racional(2, 3));
		myRacionalSet.add(new Racional(1, 3));
		myRacionalSet.add(new Racional(2, 7));
		myRacionalSet.add(new Racional(9, 3));
		myRacionalSet.add(new Racional(2, 3));
		myRacionalSet.add(new Racional(4, 6));
		
		System.out.println("PENDIENTE DE VER RESULTADOS: Recorriendo la lista con un Iterator");
		
                Iterator<Racional> it2=myRacionalSet.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
                
                System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Manuel").hashCode());
		
		
		
		
	}

}
