package com.scriptingsystems.tutorialjava.streamsj8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcesandoFicherosStreams2 {

	public static void main(String[] args) {
		// \\s+ el separador son los espacios en blanco de uno o mas espacios en blanco
		/*
		String [] tokens = "Jean   Carlos bla  24 27 angel 23,6 89".split("\\s+");
		
		for (String s : tokens) {
			System.out.println(s);
		}
		
		
		Stream.of (tokens).forEach(token -> System.out.println(token));
		*/
		
		/* Muestra los numeros del archivo incluidos los q tiene decimales
		try {
			Files.lines(Paths.get("expresionesRegulares.txt"))
			.flatMap(line-> Stream.of(line.split("\\s+")))
			.filter(token -> {
				try{
					Double.parseDouble((String)token);
					return true;
				}catch (NumberFormatException e){
					return false;
				}
			})
			.forEach(token->System.out.println(token));
		
		} catch (IOException e){
			e.printStackTrace();
		}
		*/
		try {
			Serializable opt = Files.lines(Paths.get("expresionesRegulares.txt"))
			.flatMap(line-> Stream.of(line.split("\\s+")))
			.filter(token -> {
				try{
					Double.parseDouble((String)token);
					return true;
				}catch (NumberFormatException e){
					return false;
				}
			})
			.mapToDouble(x -> Double.parseDouble(x))
			.reduce(0,(x,y)->x+y);
			System.out.println(opt);
			
		
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
	}

}
