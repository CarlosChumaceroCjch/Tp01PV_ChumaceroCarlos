package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op,i,suma =0;
		do {
			System.out.println("Ingrese la longitud que desea que tenga el arreglo (Entre 3 y 10)");
			op = sc.nextInt();
			if (op>10 || op<3) {
				System.out.println("La lognitud del array debe ser mayor o igual a 3 o menor o igual a 10, intente de nuevo");
				op=0;
			}
		}while(op>10 || op<3);

		int []numEn=new int[op];
		
		for (i=0;i<op;i++) {
			System.out.println("Ingrese entero Nº "+(i+1));
			numEn[i]=sc.nextInt();
			suma=suma+numEn[i];
		}
		for (i=0;i<op;i++) {
			System.out.println("Numero o en la posicion "+i+": "+numEn[i]);
		}
		System.out.println("Suma de todos los valores: "+suma);
	}

}
