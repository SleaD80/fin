package ru.slead;

import java.lang.String;
import java.util.*;
import java.io.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
        	System.out.println( readData().get(0)[0] );
        } catch (IOException e) {}
    }

    public static List<String[]> readData() throws IOException 
    { 
	    int count = 0;
	    String file = "20180723_233328_147.csv";
	    List<String[]> content = new ArrayList<>();
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            content.add(line.split(","));
	        }
	    } catch (FileNotFoundException e) {
	      //Some error logging
	    }
	    return content;
	}
}
