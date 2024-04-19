package ar.edu.unju.fi.ejercicio12.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc =new Scanner(System.in);
		Persona persona =new Persona();
		
		
		DateFormat format = new SimpleDateFormat("dd/M/yyyy");
		System.out.println("Ingrese Fecha de nacimiento.(dd/M/yyyy)");
		Date fecha =format.parse(sc.next());
		
		Calendar calendario = new GregorianCalendar();
		calendario.setTime(fecha);
		
		System.out.println("Ingrese su nombre");
		persona.setNombre(sc.next());
		persona.setFecNac(calendario);
		
		System.out.print(persona.toString());
	}

}
