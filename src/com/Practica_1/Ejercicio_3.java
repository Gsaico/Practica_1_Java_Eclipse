package com.Practica_1;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner reader1 = new Scanner(System.in);
				System.out.println("Ingrese el primer Numero: ");
				int numero1 = reader1.nextInt();

				Scanner reader2 = new Scanner(System.in);
				System.out.println("Ingrese el segundo Numero: ");
				int numero2 = reader2.nextInt();

				
				
				
				
				
				if (numero1 % numero2 == 0)
					System.out.println("El multiplo de " + numero1 + " es " + numero2);
				else
					System.out.println("El numero  " + numero1 + " no es multiplo de "
							+ numero2);

				if (numero2 % numero1 == 0)
					System.out.println("El multiplo de " + numero2 + " es " + numero1);
				else
					System.out.println("El numero  " + numero2 + " no es multiplo de "
							+ numero1);

	}

}
