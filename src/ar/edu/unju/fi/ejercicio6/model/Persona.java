package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String prov;
	
	public Persona () {
		
	}	

	//Constructor Parametrizado
	public Persona(String dni, String nombre, LocalDate fechaNac, String prov) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.prov = prov;
	}
	
	//Constructor Parametrizados con provincia
	public Persona(String dni, String nombre, LocalDate fechaNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.prov = "Jujuy";
	}
	
	//Setters
	public void setDni(String dni) {
		this.dni = dni;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}



	public void setProv(String prov) {
		this.prov = prov;
	}

/*Metodos 
1.Sacar edad
2.Verificar si tiene mayoria de edad
3.Mostrar todos los datos*/
	
	public int edad() {
		Period Edad = Period.between(fechaNac,LocalDate.now());
		return Edad.getYears();
	}
	
	
	public boolean mayor() {
		return edad()>18;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		System.out.println("Edad: "+ edad()+" años");
		System.out.println("Fecha de nacimiento: "+this.fechaNac);
		System.out.println("Provinicia: "+this.prov);
		if (mayor()) {
			System.out.println(this.nombre +" es mayor de edad");
		}
		else
			System.out.println(this.nombre +" no es mayor de edad");
	}
}
