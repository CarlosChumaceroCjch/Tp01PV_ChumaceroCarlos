package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fecNac;
	private String nacion;
	private double estatura;
	private double peso;
	private String posicion;
	
	public Jugador() {
		
	}	
	
	public Jugador(String nombre, String apellido, LocalDate fecNac, String nacion, double estatura, double peso,
				String posicion) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fecNac = fecNac;
			this.nacion = nacion;
			this.estatura = estatura;
			this.peso = peso;
			this.posicion = posicion;
		}



//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecNac() {
		return fecNac;
	}

	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}

	public String getNac() {
		return nacion;
	}

	public void setNac(String nac) {
		this.nacion = nac;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public int edad() {
		LocalDate Hoy = LocalDate.now();
        int anios = Hoy.getYear() - fecNac.getYear();
        int meses = Hoy.getMonthValue() - fecNac.getMonthValue();
        int dias = Hoy.getDayOfMonth() - fecNac.getDayOfMonth();

        if (meses < 0 || (meses == 0 && dias < 0)) {
            anios--;
        }

        return anios;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nfecha Nacimiento: " + fecNac + "\nEdad: "+edad()+" años\nNacionalidadd: "+nacion+"\nEstatura: "+estatura+" cm\nPeso: "+peso+" kg\nPosicion: "+posicion;
	}
}
