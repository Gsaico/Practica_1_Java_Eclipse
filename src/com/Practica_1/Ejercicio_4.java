package com.Practica_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Instanciamos el objeto Calendar
		// en fecha obtenemos la fecha y hora del sistema
		Calendar fecha = new GregorianCalendar();
		// Obtenemos el valor del año, mes, día,
		// hora, minuto y segundo del sistema
		// usando el método get y el parámetro correspondiente
		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		System.out
				.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
		System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto,
				segundo);

		Scanner reader1 = new Scanner(System.in);
		System.out.println("Ingrese su Nombre: ");
		String v_nombre = reader1.next();

		System.out.println("Ingrese su Apellido: ");
		String v_apellido = reader1.next();

		System.out.println("Ingrese su Fecha de nacimiento  año/mes/dia: ");
		String v_fechanacimiento = reader1.next();

		System.out.println("RESULTADOS");

		String Fecha_actual = año + "/" + (mes + 1) + "/" + dia;

		System.out.println("Bienvenido: " + v_nombre + " " + v_apellido);
		System.out.println("Edad: "
				+ fechasDiferenciaEnDias(aDate(v_fechanacimiento),
						aDate(Fecha_actual)) / 365 + " Años");

		if (fechasDiferenciaEnDias(aDate(v_fechanacimiento),
				aDate(Fecha_actual)) <= 6575) {
			System.out.println("Usted es menor de Edad");
		} else {
			System.out.println("Usted es mayor de Edad");

		}

	}

	// con esto convertimos String a Date
	public static Date aDate(String strFecha) {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = null;

		try {
			fecha = formatoDelTexto.parse(strFecha);
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		return fecha;

	}

	// con esto restamos las dos fechas
	public static int fechasDiferenciaEnDias(Date fechaInicial, Date fechaFinal) {

		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String fechaInicioString = df.format(fechaInicial);
		try {
			fechaInicial = df.parse(fechaInicioString);
		} catch (ParseException ex) {
		}

		String fechaFinalString = df.format(fechaFinal);
		try {
			fechaFinal = df.parse(fechaFinalString);
		} catch (ParseException ex) {
		}

		long fechaInicialMs = fechaInicial.getTime();
		long fechaFinalMs = fechaFinal.getTime();
		long diferencia = fechaFinalMs - fechaInicialMs;
		double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
		return ((int) dias);
	}

}
