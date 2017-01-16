package com.scriptingsystems.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.scriptingsystems.tutorialjava.poo.interfaces.Racional;

public class ListTest {
	
	
	
	
	public static void main(String[] args) {
				
				List<String> myStringList = new ArrayList<>();
				List<Racional> myRacinalList = new ArrayList<>();
				
				myStringList.add("Luis");
				myStringList.add("Luis");
				myStringList.add("Manuel");
				myStringList.add("Jose");
				myStringList.add("Alberto");
				
				System.out.println("Inicializando pruebas de String");
				
				System.out.println("\n\nRecorriendo con FOR indexado...");
				for (int i = 0; i < myStringList.size(); i++) {
					System.out.println( myStringList.get(i) );
				}
				
				System.out.println("\n\nRecorriendo con FOREACH...");
				for (String s : myStringList) {
					System.out.println(s);
				}
				
				Iterator<String> i = myStringList.iterator();
				
				System.out.println("\n\nRecorriendo con WHILE iterador...");
				while ( i.hasNext() ) {
					System.out.println(i.next());
				}
				
				System.out.println("\n\nInicializando pruebas de Racionales");
		
				myRacinalList.add(new Racional(2, 3));
				myRacinalList.add(new Racional(1, 3));
				myRacinalList.add(new Racional(2, 7));
				myRacinalList.add(new Racional(9, 3));
				myRacinalList.add(new Racional(2, 3));
				myRacinalList.add(new Racional(4, 6));
				
				System.out.println("Recorriendo la lista con un Iterator");
				Iterator<Racional> it2 = myRacinalList.iterator();
				while (it2.hasNext()) {
					System.out.println(it2.next());
				}
				
				
	}
}
