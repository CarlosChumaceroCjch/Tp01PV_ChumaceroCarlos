package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DestinoTuristico> destinos = new ArrayList<DestinoTuristico>();
		destinos.add(new DestinoTuristico(1,"Jujuy",500,Pais.ARGENTINA,3));
		destinos.add(new DestinoTuristico(2,"Sucre",1000,Pais.BOLIVIA,8));
		destinos.add(new DestinoTuristico(3,"Rosario",200,Pais.ARGENTINA,2));
		
		int op=0;	
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\nMENÚ");
			System.out.println("Por favor seleccione una opción ");
		    System.out.println("1- Alta de destino");
		    System.out.println("2- Mostrar todos los destinos");
		    System.out.println("3- Modificar pais de un destino");
		    System.out.println("4- Limpiar vuelos pendientes");
		    System.out.println("5- Eliminar un destino");
		    System.out.println("6- Mostrar destino turisticos en orden alfabetico");
		    System.out.println("7- Mostrar todos los paises");
		    System.out.println("8- Mostrar destinos turisticos hacia un pais");
		    System.out.println("9- Salir");

			try {	
				op=sc.nextInt();
				sc.nextLine();
				
			} catch(InputMismatchException e1) {
		        System.out.println("Error: El valor ingresado no es un entero.");
		        sc.nextLine();

			}catch (Exception e2) {
				System.out.println("Error imprevisto. Motivo: " + e2.getMessage());
			}
		
		//Seleccion de Metodos
		switch (op) {
        case 1:
            altaDes(sc,destinos);
            break;
        case 2:
            mostrarDes(destinos);
            break;
       case 3:
            modPais(sc,destinos);
            break;
        case 4:
        	System.out.println("¿Esta seguro que desea borrar todos los destinos? S/N");
        	char res = sc.next().charAt(0);
        	if(res=='S')
        		destinos.clear();
            break;
        case 5:
        	EliminarDest(sc,destinos);
            break;
        case 6:
            MostrarDestAlf(destinos);
            break;
       case 7:
            mostrarPaises(destinos);
            break;
        case 8:
            DestXPais(sc,destinos);
            break;
        case 9:
        	System.out.println("Programa finalizado");
        	break;
        default:
            System.out.println("Opción no válida. Intente nuevamente.");
		}
		}while (op!=9);
		sc.close();
	}
	
	public static void altaDes(Scanner sc,List<DestinoTuristico>destinos) {
        System.out.print("Ingrese codigo de su viaje: ");
        int cod = sc.nextInt();
		
		System.out.print("Ingrese el nombre del destino a viajar: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese Precio a pagar de su viaje: ");
        double precio = sc.nextDouble();
        

        
        System.out.print("Ingrese cantidad de dias que se quedara: ");
        int dias = sc.nextInt();
        
        System.out.print("Ingrese codigo del pais al que viaja: ");
        int codP = sc.nextInt();
        //Se realiza un condicional ya que solo se cuenta con 2 paises en los enumerados, en caso de contar mas usar switch
        if (codP==Pais.ARGENTINA.getCod())
        	 destinos.add(new DestinoTuristico(cod,nombre,precio,Pais.ARGENTINA,dias));
        else
        	 destinos.add(new DestinoTuristico(cod,nombre,precio,Pais.BOLIVIA,dias));
	
	}
	
	public static void mostrarDes(List<DestinoTuristico>destinos) {
		try {
			System.out.println("Destinos Disponibles");
			for (DestinoTuristico destinoTuristico :destinos) {
				System.out.println(destinoTuristico.toString());
			}
		}catch(Exception e) {
			System.out.println("Error al mostrar al jugador. Motivo: " + e.getMessage());
		}finally {
			System.out.println("Recursos cerrados");
		}
	}
	
	public static void modPais(Scanner sc,List<DestinoTuristico>destinos) {
		try {
			System.out.println("Ingrese Codigo del destino que quiera modificar el pais");
			int cod=sc.nextInt();
			int ind=buscDestino(cod,destinos);
			if (ind!=-1) {
				System.out.println("Actualmente su pais de este destino es:"+destinos.get(ind).getPais()+"\nSeleccione a cual desea Cambiarn\n");
			    System.out.println("1- Argentina");
			    System.out.println("2- Bolivia");
				int nCod =sc.nextInt();
				Pais pais = null;
				switch(nCod){
					case 1:
						pais = Pais.ARGENTINA;
						break;
					case 2:
						pais =Pais.BOLIVIA;
						break;
					default:
						System.out.println("No hay paises con ese codigo");
				}
				destinos.get(ind).setPais(pais);
			}
			else
				System.out.println("No hay destinos con ese codigo");	
		}
		catch(InputMismatchException e1) {
			System.out.println("Error El valor a ingresar debe ser un numero entero. Motivo: " );
		}
		catch(Exception e){
			System.out.println("Error al Modificar Pais. Motivo: " + e.getMessage());
		}
		finally {
			System.out.println("Recursos cerrados");
		}
		
	}
	
	public static void EliminarDest(Scanner sc,List<DestinoTuristico>destinos) {
		System.out.println("Ingrese Codigo del destino que quiera eliminar");
		try {
			int cod=sc.nextInt();
			int ind=-1;
			Iterator<DestinoTuristico> it =destinos.iterator();
			
			while (it.hasNext()) {
				DestinoTuristico destino=it.next();
				
				if (destino.getCodigo()==cod)
					{it.remove();
					System.out.println("Destino borrado con exito");	
				}
			}
		}
		catch(InputMismatchException e1) {
			System.out.println("Error El valor a ingresar debe ser un numero entero. Motivo: " );
		}
		catch(Exception e){
			System.out.println("Error al eliminar destino. Motivo: " + e.getMessage());
		}
		finally {
			System.out.println("Recursos cerrados");
		}


	}
	
	public static void MostrarDestAlf(List<DestinoTuristico>destinos) {
		Collections.sort(destinos, (j1, j2) -> j1.getNombre().compareToIgnoreCase(j2.getNombre()));
		for (DestinoTuristico destinoTuristico :destinos) {
			System.out.println(destinoTuristico.toString());
		}
	}
	
	
	public static void  mostrarPaises(List<DestinoTuristico>destinos) {
		int con=1;
		for (DestinoTuristico destinoTuristico :destinos) {
			System.out.println("Pais de destino "+con+": "+destinoTuristico.getPais());
			con++;
		}
	}
	
	public static void DestXPais(Scanner sc,List<DestinoTuristico>destinos) {
		System.out.println("Ingrese el codigo del pais que desea ver los destinos");
		try {
			int op=sc.nextInt();
			switch(op){
			case 1:
				for (DestinoTuristico destinoTuristico :destinos) {
					if(destinoTuristico.getPais().getCod()==1)
						System.out.println(destinoTuristico.toString());
				}
				break;
			case 2:
				for (DestinoTuristico destinoTuristico :destinos) {
					if(destinoTuristico.getPais().getCod()==2)
						System.out.println(destinoTuristico.toString());
				}
				break;
			default:
				System.out.println("No hay destinos a ese Pais");
				break;
			}
		}
		catch(InputMismatchException e1) {
			System.out.println("Error El valor a ingresar debe ser un numero entero. Motivo: " );
		}
		catch(Exception e){
			System.out.println("Error al seleccionar pais. Motivo: " + e.getMessage());
		}
		finally {
			System.out.println("Recursos cerrados");
		}
		
	}
	
	public static int buscDestino(int cod, List<DestinoTuristico>destinos) {
		int ind =-1;
            for (DestinoTuristico destinoTuristico : destinos) {
            	if (destinoTuristico.getCodigo()==cod)  {
            		ind = destinos.indexOf(destinoTuristico);
            	}                
            }
            return ind;
        } 
}


