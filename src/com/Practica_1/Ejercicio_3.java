package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {

		Scanner reader1 = new Scanner(System.in);
		System.out
				.println("Pedir dos números y decir si uno es múltiplo del otro: ");

		String v_numero1;
		String v_numero2;
		// con el do while evaluo el ingreso de caracteres numero 1
		do {
			System.out.println("Ingrese el primer numero: ");
			v_numero1 = reader1.next();
			if (isNumeric(v_numero1) == true) {

				if (isInteger(Double.parseDouble(v_numero1)) == true)

				{

					do {
						System.out
								.println("Ingrese el primer numero, este debe ser un entero: ");
						v_numero1 = reader1.next();
					}

					while (isInteger(Double.parseDouble(v_numero1)));
				} else {
					break;
				}

			}

		} while (!isNumeric(v_numero1));

		// con el do while evaluo el ingreso de caracteres numero 2
		do {
			System.out.println("Ingrese el segundo numero: ");
			v_numero2 = reader1.next();
			if (isNumeric(v_numero2) == true) {

				if (isInteger(Double.parseDouble(v_numero2)) == true)

				{

					do {
						System.out
								.println("Ingrese el primer numero, este debe ser un entero: ");
						v_numero2 = reader1.next();
					}

					while (isInteger(Double.parseDouble(v_numero2)));
				} else {
					break;
				}

			}

		} while (!isNumeric(v_numero2));

		// realizo el caluclo de los numeros multiplos

		if (Double.parseDouble(v_numero1) % Double.parseDouble(v_numero2) == 0)
			System.out.println("El multiplo de " + v_numero2 + " es "
					+ v_numero1);
		else if (Double.parseDouble(v_numero2) % Double.parseDouble(v_numero1) == 0)
			System.out.println("El multiplo de " + v_numero1 + " es "
					+ v_numero2);

	}

	// averigue si el caracter ingresado es un numero
	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;

	}

	// averigue si es un entero o un decimal
	public static boolean isInteger(double v_numerox) {

		int v_entero = (int) v_numerox;

		double v_decimal = v_numerox - v_entero;

		if (v_decimal > 0) {
			System.out.println("El numero ingresado es decimal");
			return true;
		} else {
			System.out.println("ok");

			return false;
		}

	}

}
