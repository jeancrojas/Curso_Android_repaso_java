package com.scriptingsystems.tutorialjava.streamsj8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcesandoFicherosStreams {

	public static void main (String[] args) {
		
		try {
			
			/* Primera opción
			Stream str = Files.lines(Paths.get("urls.txt"));
			str.forEach(line -> System.out.println(line));
			*/
			Files.lines(Paths.get("urls.txt")).forEach(line -> System.out.println(line));
			
			System.out.println("Solo muestra las lineas con mas de 10 caracteres.");
			Files.lines(Paths.get("urls.txt")).filter(linea -> linea.length() > 10).forEach( line -> System.out.println(line) );
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
