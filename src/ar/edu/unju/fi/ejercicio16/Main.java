package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]nombres=new String[5];
		Scanner sc =new Scanner(System.in);
		int i,j=0,k;
		byte op;
	
		for (i=0;i<5;i++) {
			System.out.println("Ingrese nombre Nº "+(i+1));
			nombres[i]=sc.next();
			if (i==4)
				System.out.println("Vector lleno, carga finalizada");
		}
		
		while (j<=nombres.length-1) {
			System.out.println("Nombre en la posicion "+j+": "+nombres[j]);
			j++;
		}
		System.out.println("La longitud el array es : "+nombres.length);
		
		
		
		do {
			System.out.println("Ingrese posicion que desea eliminar su valor(entre 0 a 4)");
			op = sc.nextByte();
			if (op>4 || op<0) {
				System.out.println("La longitud del array debe ser mayor o igual a 3 o menor o igual a 10, intente de nuevo");
			}
		}while(op>4 || op<0);
		
		k=op;

		do {
			if (k<(nombres.length-1)) {
				nombres[k]=nombres[k+1];
				k++;
				System.out.println(k);
			}
			else
				nombres[k]="";
		}while (nombres[nombres.length-1]!="");
		j=0;
		while (j<=nombres.length-1) {
			System.out.println("Nombre en la posicion "+j+": "+nombres[j]);
			j++;
		}

	}
}
