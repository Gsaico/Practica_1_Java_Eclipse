package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {

		Scanner reader1 = new Scanner(System.in);
		System.out.println("Ingrese el Numero: ");
		double v_numerox = reader1.nextDouble();

					
		double v_resultado = Math.PI * Math.pow(v_numerox , 2);

		System.out.println("El resultado es: " + v_resultado);
		
	


	}

}
