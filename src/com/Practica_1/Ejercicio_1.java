package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {

		
		Scanner reader1 = new Scanner(System.in);
	
		System.out.println(".:   ÁREA DE UN CÍRCULO   :.");
		String v_numerox;

		do
		{
			System.out.println("Ingrese el Radio del circulo: " );
			v_numerox = reader1.next();
		}
		while ( isNumeric(v_numerox));
		
							
		double v_resultado = Math.PI * Math.pow(Double.parseDouble(v_numerox) , 2);

		System.out.println("El ÁREA es igual A = " + v_resultado);
		
	


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
