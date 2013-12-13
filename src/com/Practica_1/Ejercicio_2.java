package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Ingrese Un Numero: ");
		String v_numerox = reader1.next();

		do
		{
			System.out.println("Por favor ingrese un numero:" );
			v_numerox = reader1.next();
		}
		while ( isNumeric(v_numerox));
	
		
		
		
	}

	
	
	
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return true;  
	  }  
	  return false; 
	  
	  
	}
	
	
	
	
}
