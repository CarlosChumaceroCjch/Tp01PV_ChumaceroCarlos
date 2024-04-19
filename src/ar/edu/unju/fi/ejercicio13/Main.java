package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numEn = new int[8];
		int i;
		Scanner sc =new Scanner(System.in);
		
		for (i=0;i<8;i++) {
			System.out.println("Ingrese valor Nº "+(i+1));
			numEn[i]= sc.nextInt();
		}
		
		for (i=0;i<numEn.length;i++) {
			System.out.println("Numero en posicion "+i+": "+numEn[i]);
		}
	}

}
