package ar.edu.unju.fi.ejercicio8.model;

import java.util.Scanner;

public class CalculadorEspecial {
	private int n;

	//Getters y Setters
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	//Constructor por defecto
	
	public CalculadorEspecial() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Por favor ingrese numero a calcular suma y productoria");
		n=scanner.nextInt();
	}
	
	
	//Sumatoria	
	public void calcularSumatoria() {		
		int k;
		double sum=0;
		for (k=1;k<=n;k++) {
			sum=sum+ Math.pow(((k*(k+1))/2),2);
		}	
		System.out.println("La sumatoria de su numero es: "+sum);
	
	}
	//Productoria
	public void calcularProductoria() {
		int k,prod=1;
		for (k=1;k<=n;k++) {
			prod=prod*(k*(k+4));
		}
		System.out.println("La productoria de su numero es: "+prod);
		
	}
}



