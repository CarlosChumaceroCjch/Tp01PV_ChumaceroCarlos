package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos del nuevo empleado");
		System.out.println("Nombre: ");
		String nombre = scanner.next();
		System.out.println("Aepllido");
		String apell = scanner.next();
		System.out.println("Ingrese Legajo del empleado");
		int legajo =Integer.parseInt(scanner.next());
		System.out.println("Ingrese Salario del empleado");
		float salario = Float.parseFloat(scanner.next());
		
		Empleado empleado = new Empleado(nombre,apell, legajo, salario);
		
		empleado.MostrarEmp();
		empleado.Aumento();
		empleado.MostrarEmp();
		scanner.close();
	}

}
