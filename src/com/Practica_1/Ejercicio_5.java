package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner reader1 = new Scanner(System.in);
		System.out.println("------- FACTORIAL ------------ ");

		String v_numero1;

		do {
			System.out.println("Ingrese el número: ");
			v_numero1 = reader1.next();
			if (isNumeric(v_numero1) == true) {

				if (isInteger(Double.parseDouble(v_numero1)) == true)

				{

					do {
						System.out
								.println("Ingrese el primer número, este debe ser un entero: ");
						v_numero1 = reader1.next();

					}

					while (isInteger(Double.parseDouble(v_numero1)));

				} else {
					break;
				}

			}

		} while (!isNumeric(v_numero1));

		if (Double.parseDouble(v_numero1) >= 1) {

			int numero1 = (int) Double.parseDouble(v_numero1);

			int var = 1;

			for (int i = 1; i <= numero1; i++) {
				var = var * i;

			}

			System.out.println("El factorial de " + numero1 + " es:  " + var);

		} else
			System.out
					.println("El numero debe ser mayor  o igual a uno parac calcular el factorial.");

	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;

	}

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
