package ar.edu.unju.fi.ejercicio10.model;

import java.util.Scanner;

public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingSp;
	private final int ingSp20 =500;
	private final int ingSp30 =750;
	private final int ingSp40 =100;
	
	//setters y getters
	
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public boolean isIngSp() {
		return ingSp;
	}
	public void setIngSp(boolean ingSp) {
		this.ingSp = ingSp;
	}
	public int getIngSp20() {
		return ingSp20;
	}
	public int getIngSp30() {
		return ingSp30;
	}
	public int getIngSp40() {
		return ingSp40;
	}
	
	//Constructor predeterminado
	public Pizza() {
		System.out.println("ingrese, porfavor el diametro de la pizza (20/30/40):");
		Scanner scanner = new Scanner(System.in);
		//Diametro de la pizza
		do{
			diametro=scanner.nextInt();
			if (diametro!=20 && diametro !=30 && diametro!=40) {
				System.out.println("El diametro de la pizza solo puede ser 20, 30 o 40 ");
				diametro=0;
			}
			

		}while(diametro!=20 && diametro!=30 && diametro!=40);
		
		//Ingredientes Especiales
		char op='n';
		do{
			System.out.println("¿Desesa ingredientes especiales en su pizza? (s/n)");
			op=scanner.next().charAt(0);
			if (op!='n'&&op!='s') {
				System.out.println("Opcion invalida, porfavor inente de nuevo");
			}
		}while( op!='s'&&op!='n');
		ingSp=op=='s';
		//Precio
		calcularPrecio();
		calcularArea();
		System.out.println("Pizza ingresada, estara lista en un momento");
	}
	
	public void calcularPrecio() {
		switch(diametro){
		case 20:
			if (ingSp)
				precio=4500+ingSp20;
			else
				precio=4500;
			break;
		case 30:
			if (ingSp)
				precio=4800+ingSp30;
			else
				precio=4800;
			break;
		case 40:
			if (ingSp)
				precio=5500+ingSp40;
			else
				precio=5500;
			break;
		default:
			System.out.println("Tamaño inexistente, ingrese su orden de nuevo");
			break;
		}
	}
	
	
	public void calcularArea() {
		area = (Math.PI *Math.pow(diametro / 2, 2));
	}
	
	@Override
	public String toString() {
		return "**Pizza**\n*Diametro: "+diametro+"\n*Ingredientes Especiales: "+ingSp+"\n*Precio: "+precio+"$\n*Area de la Pizza: "+area;
	}
}
