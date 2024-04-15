package ar.edu.unju.fi.ejercicio9.main;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		int n=1;		
		do {
			if (n<=3) {
				System.out.println("Por favor, ingrese los datos del producto "+n);
				Producto producto = new Producto();
				System.out.println("Producto: "+ producto.getNombre()); 
				System.out.println("Codigo: "+ producto.getCodigo());
				System.out.println("Precio:"+ producto.getPrecio());
				System.out.println("Descuento:"+ producto.getDescuento()+"%");
				producto.setPrecio(producto.calcularDescuento());
				System.out.println("Precio con descuento:"+ producto.getPrecio());
				n++;
			}
		}while(n<=3);
		
		

	}

}
