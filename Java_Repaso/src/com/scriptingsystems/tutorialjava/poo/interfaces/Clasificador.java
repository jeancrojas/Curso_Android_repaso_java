package com.scriptingsystems.tutorialjava.poo.interfaces;

public class Clasificador {
	public static void sort ( Comparable[] list ) {
		
	}
	
	public static Object getMinimo (Comparable[] list ) throws ComparationException {
		int min = 0;
		
		for (int i = 1; i < list.length; i++) {
			
			if ( list[min].compareTo(list[i]) > 0 ) {
				min=i;
			}
			
		}
		
		return list[min];
	}
	
}
