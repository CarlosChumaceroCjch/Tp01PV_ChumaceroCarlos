package ar.edu.unju.fi.ejercicio06.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);		
		
		constructorPred(scanner);
		constructorParam(scanner);
		constructorFin(scanner);
		
		scanner.close();
	}
	//Constructor vacio
	public static void constructorPred(Scanner scanner) {
		System.out.println("Ingreso de datos predeterminado");
		Persona persona = new Persona();
		
		System.out.println("Ingrese DNI");
		String dni = scanner.next();
		persona.setDni(dni);
		
		System.out.println("Ingrese Nombre");
		String nombre = scanner.next();
		persona.setNombre(nombre);
		
		System.out.println("Ingrese fecha de nacimiento, primero el dia");
		int dia = Integer.parseInt(scanner.next());
		System.out.println("Ahora mes");
		int mes = Integer.parseInt(scanner.next());
		System.out.println("Y finalmente año");
		int anio = Integer.parseInt(scanner.next());
		LocalDate fechNac=LocalDate.of(anio, mes, dia);
		persona.setFechaNac(fechNac);
		
		System.out.println("Ingrese Provincia");
		String prov = scanner.next();
		persona.setProv(prov);
		persona.mostrarDatos();
		
	}
	//Contructor con parametros
	public static void constructorParam(Scanner scanner) {
		System.out.println("Ingreso de datos con parametros");
		System.out.println("Ingrese DNI");
		String dni = scanner.next();
		
		System.out.println("Ingrese Nombre");
		String nombre = scanner.next();
		
		System.out.println("Ingrese fecha de nacimiento, primero el dia");
		int dia = Integer.parseInt(scanner.next());
		System.out.println("Ahora mes");
		int mes = Integer.parseInt(scanner.next());
		System.out.println("Y finalmente año");
		int anio = Integer.parseInt(scanner.next());
		LocalDate fechNac=LocalDate.of(anio, mes, dia);
		
		System.out.println("Ingrese Provincia");
		String prov = scanner.next();
		
		Persona persona =new Persona(dni, nombre, fechNac, prov);
		persona.mostrarDatos();
	}
	//Constructor con parametros sin provincia
	public static void constructorFin(Scanner scanner) {
		System.out.println("Ingreso de datos predeterminado sin provincia");
		System.out.println("Ingreso de datos con parametros");
		System.out.println("Ingrese DNI");
		String dni = scanner.next();
		
		System.out.println("Ingrese Nombre");
		String nombre = scanner.next();
		
		System.out.println("Ingrese fecha de nacimiento, primero el dia");
		int dia = Integer.parseInt(scanner.next());
		System.out.println("Ahora mes");
		int mes = Integer.parseInt(scanner.next());
		System.out.println("Y finalmente año");
		int anio = Integer.parseInt(scanner.next());
		LocalDate fechNac=LocalDate.of(anio, mes, dia);

		Persona persona =new Persona(dni, nombre, fechNac);
		persona.mostrarDatos();
	}
}



