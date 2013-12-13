package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Ingrese el Numero: ");
		int numero1 = reader1.nextInt();

			int var = 1;
		
		for(int i=1; i<=numero1; i++)
		{
			var= var * i;
			
		}
			
		System.out.println("El factorial de " + numero1 + " es:  " + var);	

	}

}
