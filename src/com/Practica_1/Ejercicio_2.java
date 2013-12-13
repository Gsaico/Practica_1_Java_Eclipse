package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {

		Scanner reader1 = new Scanner(System.in);

		System.out.println(".:   MAYOR MENOR O IGUAL   :.");
		String v_numero1;
		String v_numero2;

		do {
			System.out.println("Ingrese el primer numero: ");
			v_numero1 = reader1.next();
		} while (isNumeric(v_numero1));

		do {
			System.out.println("Ingrese el segundo numero: ");
			v_numero2 = reader1.next();
		} while (isNumeric(v_numero2));

		if (Double.parseDouble(v_numero1) > Double.parseDouble(v_numero2))
			System.out.println("El numero: " + v_numero1 + " es   Mayor  que "
					+ v_numero2);
		else if (Double.parseDouble(v_numero2) > Double.parseDouble(v_numero1))
			System.out.println("El numero: " + v_numero2 + " es   Mayor  que "
					+ v_numero1);
		else if (Double.parseDouble(v_numero2) == Double.parseDouble(v_numero1))
			System.out.println("El numero: " + v_numero1 + " es  igual que "
					+ v_numero2);
		else
			System.out.println("error");

	}

	// averigue si el caracter ingresado es un numero
	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return true;
		}
		return false;

	}

}
