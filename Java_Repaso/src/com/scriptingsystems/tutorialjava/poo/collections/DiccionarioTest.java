package com.scriptingsystems.tutorialjava.poo.collections;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            try {
		Diccionario myDiccionary = new Diccionario("palabras.txt");
		System.out.println(myDiccionary);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
	}

}
