package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero entero entre 1 y 9 incluidos ambos ");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			 int num =scanner.nextInt();
			 if (num>=1 && num<=9) {
				 int i ;
				 for (i=0;i<=10;i++) {
					 System.out.println(num+" X "+i+" = "+num*i);
				 }
			 }
			 else {
				 System.out.println("El numero ingresado debe ser mayor o igual a 1 o menor o igual a 9");
			 }
		}
		else 
			System.out.println("El valor ingresado no es un numero entero, intente otra vez");
		scanner.close();
		
	}

}
