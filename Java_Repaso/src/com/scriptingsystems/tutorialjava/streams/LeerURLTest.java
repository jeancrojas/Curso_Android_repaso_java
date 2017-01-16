package com.scriptingsystems.tutorialjava.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class LeerURLTest {

	public static void main(String[] args) {
		String urlStr = "http://www.mit.edu/";
		
		
		try {
			URL url = new URL (urlStr);
			URLConnection con = url.openConnection();
			InputStream in = con.getInputStream();
			
			BufferedReader reader = new BufferedReader( new InputStreamReader(in) );
			
                        
                        
                        //Recorriendo el codigo fuente de la WEB
			
			
			/*
                        Leer la URL
                        int byteLeido;
                        
			while ( (byteLeido = in.read()) != -1 ){
				System.out.println(byteLeido);
			}
			*/
                        
                        
                        /*
                        Leer la URL
                        
                        Scanner sc = new Scanner (new InputStreamReader(in));
                        sc.useDelimiter("\\n");
                        
                        while ( sc.hasNext() ) {
                            String str = sc.next();
                            System.out.println(str);
                        }
                        */
                        
			String line;
			while ( (line = reader.readLine() ) != null ) {
				System.out.println(line);
			}
			
			
		} catch (MalformedInputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
