package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0	
		System.out.println("Ingrese numero entero :");
		Scanner scanner = new Scanner(System.in);
		
		if (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if (num%2==0) {
				System.out.println("El triple es: "+num*3);
			}
			else
				System.out.println("El doble es: "+num*2);
		}
		else {
			System.out.println("El valor ingresado no es un numero entero");
		}
		scanner.close();
		
	}

}
