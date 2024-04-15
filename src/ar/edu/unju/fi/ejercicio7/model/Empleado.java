package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String apell;
	private int legajo;
	private float salario;
	
	private final float salMinimo = 210000;
	private final float aumMerit = 20000;
	
	
	public Empleado(String nombre,String apell, int legajo, float salario) {
		super();
		this.nombre = nombre;
		this.apell=apell;
		this.legajo = legajo;
		if (salario>= salMinimo) {
			this.salario = salario;
		}
		else 
			this.salario = salMinimo;
	}
	
	public void MostrarEmp() {
		System.out.println("Nombre del empleado: "+this.nombre+" "+this.apell);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario $: "+this.salario);
	}
	
	public void Aumento() {
		salario = salario+aumMerit;
		System.out.println("Aumento aprobado con exito");
	}
	
	
}
