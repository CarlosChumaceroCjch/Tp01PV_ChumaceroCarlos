package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op,i;
		do {
			System.out.println("Ingrese la longitud que desea que tenga el arreglo (Entre 5 y 10)");
			op = sc.nextInt();
			if (op>10 || op<3) {
				System.out.println("La lognitud del array debe ser mayor o igual a 5 o menor o igual a 10, intente de nuevo");
				op=0;
			}
		}while(op>10 || op<5);	
		String[]nombres=new String[op];
		for (i=0;i<op;i++) {
			System.out.println("Ingrese Nombre Nº "+(i+1));
			nombres[i]=sc.next();
		}
		
		for (i=op-1;i>=0;i--) {
			System.out.println("Nombre o en la posicion "+i+": "+nombres[i]);
		}
	}
}
