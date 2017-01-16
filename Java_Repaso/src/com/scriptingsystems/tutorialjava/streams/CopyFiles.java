package com.scriptingsystems.tutorialjava.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {
	
	public static void main(String[] args) {
		
		//Es la "\"
		String fs = System.getProperty("file.separator");
		
		File file = new File("src" + fs + "com"+fs+"scriptingsystems"+fs+"tutorialjava"+fs+"ArrayTest.java");
		
		
		if (file.exists()) {
			try (
				InputStream in = new FileInputStream(file);
				OutputStream out = new FileOutputStream("copy.txt");
			) {
				
				int byteLeido;
				byte[] buffer = new byte [1024];
				System.out.println("Iniciando la copia de ficheros...");
				
				/*
				while ( (byteLeido = in.read()) != -1 ) {
					out.write(byteLeido);
				}
				*/
				
				do {
					byteLeido = in.read(buffer);
					if (byteLeido > 0) {
						out.write(buffer, 0, byteLeido);
					}
						
				} while (byteLeido == buffer.length);
				
				
				System.out.println("Copia terminada...");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 
	}
}
