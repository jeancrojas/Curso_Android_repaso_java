package com.scriptingsystems.tutorialjava.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner (new FileInputStream("expresionesRegulares.txt"));
			//sc.useDelimiter("\\s*bla\\s*");
			double suma = 0;
			while (sc.hasNext()) {
				try {
					int x = sc.nextInt();
					System.out.println("Numero "+ suma );
					suma+=x;
					
				} catch (InputMismatchException e) {
					
					try {
						double d = sc.nextDouble();
						System.out.println("Sumando "+d+ "...");
						suma += d;
					} catch ( InputMismatchException e2 ) {
						sc.next();
					}
				}
			}
			System.out.println("El resultado es: "+suma);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
