package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		int n=1;
		char op='s';
		Scanner sc =new Scanner(System.in);
		do {
			if (n<=3&&op=='s') {
				Pizza pizza = new Pizza();
				String fin = pizza.toString();
				System.out.println(fin);
				System.out.println("¿Desea Ingresar otra pizza?s/n");
				op =sc.next().charAt(0);
			}
			else {
				System.out.println("Orden Completada");
				n=3;
			}

		}while(op=='s'&& n<=3);
		
	}

}
