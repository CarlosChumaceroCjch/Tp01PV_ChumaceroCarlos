package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese numero entero entre 0 y 10 al que quiera calcular factorial");
		Scanner scanner = new Scanner(System.in);
	
		if (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			int fac=num, cont =num;
			if (num>=0 && num <=10) {
				if (num==0) {
					fac =1;					
				}
				else {
					while(cont-1>0) {
						fac= fac*(cont-1); 
						cont--;
					}
				}
				System.out.println("El factorial de "+num+" es: "+fac);

			}
			else {
				System.out.println("El numero entero debe estar entre 0 y 10, intente otra vez ");
			}
		}
		else {
			System.out.println("El valor ingresado no es un numero entero, intente otra vez");
		}
		scanner.close();
	}

}
