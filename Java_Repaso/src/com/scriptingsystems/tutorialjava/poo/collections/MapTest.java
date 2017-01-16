package com.scriptingsystems.tutorialjava.poo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.scriptingsystems.tutorialjava.poo.Persona;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Persona> myPersonMap = new HashMap<>();
		
		myPersonMap.put("p-80001", new Persona("Jean Carlos", 22,"Calle Falsa, 01"));
		myPersonMap.put("p-80002", new Persona("Ángel", 4,"Calle Falsa, 02"));
		myPersonMap.put("p-80003", new Persona("Javier", 22,"Calle Falsa, 03"));
		myPersonMap.put("p-80004", new Persona("Rosa", 22,"Calle Falsa, 04"));
		
		Set<String> keys = myPersonMap.keySet();
		
		for (String key : keys) {
			Persona p = myPersonMap.get (key);
			System.out.println("\n"+p);
		}
		

	}

}
