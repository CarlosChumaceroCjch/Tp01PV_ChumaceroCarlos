package ar.edu.unju.fi.ejercicio9.model;

import java.util.Scanner;

public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private int descuento;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	////Constructor por defecto
	
	public Producto() {
		int desc = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del producto");
		nombre=scanner.next();
		System.out.println("Ingrese codigo numerico del producto");
		codigo=scanner.nextInt();
		System.out.println("Ingrese precio que tendra el producto");
		precio=scanner.nextFloat();
		System.out.println("Ingrese el descuento del producto");
		do {
		desc = scanner.nextInt();
		if (desc>=0&&desc<=50) 
			descuento=desc;
		else {
			System.out.println("El descuento debe ser mayor a 0 y menor a 50,porfavor ingrese el descuento de nuevo");
			}
		}while(desc<0||desc>50);
	}
	
	public float calcularDescuento() {
		float precioDesc;
		precioDesc=precio-(precio*descuento/100f);
		return precioDesc;
	}
}
