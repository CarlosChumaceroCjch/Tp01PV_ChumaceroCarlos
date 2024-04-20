package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Jugador> jugadores = new ArrayList<Jugador>();
		int op=0;	
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\nMENÚ");
			System.out.print("Por favor seleccione una opción: ");
		    System.out.println("\n1- Alta de jugador");
		    System.out.println("2- Mostrar datos de un jugador");
		    System.out.println("3- Mostrar jugadores ordenados por apellido");
		    System.out.println("4- Modificar datos de un jugador");
		    System.out.println("5- Eliminar un jugador");
		    System.out.println("6- Mostrar total de jugadores");
		    System.out.println("7- Mostrar jugadores por nacionalidad");
		    System.out.println("8- Salir");

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
            altaJug(sc,jugadores);
            break;
        case 2:
            mostrarJug(sc,jugadores);
            break;
       case 3:
            mostrarJugApellido(jugadores);
            break;
        case 4:
            modificarJug(sc,jugadores);
            break;
        case 5:
            eliminarJugador(sc,jugadores);
            break;
        case 6:
            System.out.println("Total de jugadores registrados: "+jugadores.size());
            break;
       case 7:
            mostrarJugNac(sc,jugadores);
            break;
        case 8:
            System.out.println("Saliendo de menu");
            break;
        default:
            System.out.println("Opción no válida. Intente nuevamente.");
		}
		}while (op!=8);
		sc.close();
	}
	
	//Metodos para la ejecucion
	public static void altaJug(Scanner sc,List<Jugador> jugadores){
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = sc.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

            System.out.print("Ingrese la nacionalidad del jugador:");
            String nacionalidad = sc.nextLine();

            System.out.print("Ingrese la estatura del jugador (en cm): ");
            double estatura = sc.nextDouble();

            System.out.print("Ingrese el peso del jugador: ");
            double peso = sc.nextDouble();
            int opPos =0;
            String posicion ="";
            do {
            	
                System.out.print("Seleccione la posicion que tomara el Jugador");
                System.out.println("\n1- Delantero");
                System.out.println("2- Medio");
                System.out.println("3- Defensa");
                System.out.println("4- Delantero");  
                opPos  = sc.nextInt();
	            switch(opPos) {
	            	case 1:
	            		posicion ="Delantero";
	            		break;
	            	case 2:
	            		posicion="Medio";
	            		break;
	            	case 3:
	            		posicion="Defensa";
	            		break;
	            	case 4:
	            		posicion="Delantero";
	            		break;
	            	default:
	            		System.out.println("Opcion invalida, intente nuevamente");
	            }     		
	         }while (opPos<1 ||opPos>4);

            //Creamos el objeto jugador y agregamos a la lista
            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            System.out.println("Jugador dado de alta correctamente.");
            
            
        } catch(InputMismatchException e1) {
	        System.out.println("Error: El valor ingresado no es valido.");
	        sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error al dar de alta al jugador. Motivo: " + e.getMessage());
        }
	}
	
	public static void mostrarJug(Scanner sc,List<Jugador> jugadores){
		try {
			System.out.println("Ingrese nombre del jugador a buscar: ");
			String nombre=sc.nextLine();
			
			System.out.println("Ingres apellido:");
			String apell=sc.nextLine();
			
			//Metodo de busqueda de jugadores
			Jugador jugador = buscarJugador(nombre, apell, jugadores); 
			if (jugador!=null) {
                System.out.println(jugador.toString());
            } else {
                System.out.println("Jugador no encontrado.");
            }
			
		
		}catch(Exception e) {
			System.out.println("Error al mostrar al jugador. Motivo: " + e.getMessage());
		}
	}
	
	public static void mostrarJugApellido(List<Jugador>jugadores) {
		try{//Ordena La lista por apellido
			Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
			
			System.out.println("Jugadores ordenados por apellido");
			for (Jugador jugador :jugadores) {
				System.out.println(jugador.toString());
			}
		}catch(Exception e){
			System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
		}	
	}
	public static void  modificarJug(Scanner sc,List<Jugador>jugadores) {
		try {
			System.out.println("Ingrese nombre del jugador a buscar: ");
			String nombre=sc.nextLine();
			
			System.out.println("Ingres apellido:");
			String apell=sc.nextLine();
			
			//Metodo de busqueda de jugadores
			int jugador = buscIndJugador(nombre, apell, jugadores); 
	
			if (jugador!=-1) {
				System.out.print("Ingrese el nombre del jugador: ");
				jugadores.get(jugador).setNombre(sc.nextLine());
		
				System.out.print("Ingrese el apellido del jugador: ");
				jugadores.get(jugador).setApellido(sc.nextLine());
				            
				System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
				jugadores.get(jugador).setFecNac(LocalDate.parse(sc.nextLine()));
			
				System.out.print("Ingrese la nacionalidad del jugador: ");
				jugadores.get(jugador).setNac(sc.next());
			
				System.out.print("Ingrese la estatura del jugador: ");
				jugadores.get(jugador).setEstatura(sc.nextDouble());
		
				System.out.print("Ingrese el peso del jugador: ");
				jugadores.get(jugador).setPeso(sc.nextDouble());
				int opPos =0;
				String posicion ="";
				do {
				System.out.print("Seleccione la posicion que tomara el Jugador");
				System.out.println("\n1- Delantero");
				System.out.println("2- Medio");
				System.out.println("3- Defensa");
				System.out.println("4- Delantero");  
				opPos  = sc.nextInt();
				switch(opPos) {
				            	case 1:
				            		posicion ="Delantero";
				            		break;
				            	case 2:
				            		posicion="Medio";
				            		break;
				            	case 3:
				            		posicion="Defensa";
				            		break;
				            	case 4:
				            		posicion="Delantero";
				            		break;
				            	default:
				            		System.out.println("Opcion invalida, intente nuevamente");
				}     		
				}while (opPos<1 ||opPos>4);
				jugadores.get(jugador).setPosicion(posicion);
				System.out.println("Datos modificados con exito");
				}
				else 
					System.out.println("Jugador no encontrado.");
	        } catch(InputMismatchException e1) {
		        System.out.println("Error: El valor ingresado no es valido.");
		        sc.nextLine();
	        } catch (Exception e) {
	            System.out.println("Error al cargar nuevos datos del jugador. Motivo: " + e.getMessage());
	        }
	}
	
	
	public static void eliminarJugador(Scanner sc,List<Jugador>jugadores) {

		try {
			System.out.println("Ingrese nombre del jugador a buscar: ");
			String nombre=sc.nextLine();
			
			System.out.println("Ingres apellido:");
			String apell=sc.nextLine();
			int jug = buscIndJugador(nombre, apell, jugadores); 
			if (jug!=-1) {
				jugadores.remove(jug);
				System.out.println("Jugador eliminado");
			}
            else 
            	System.out.println("Jugador no encontrado.");
		}
	    catch (Exception e) {
	        System.out.println("Error al eliminar datos del jugador. Motivo: " + e.getMessage());
	    }
	}
	public static void mostrarJugNac(Scanner sc,List<Jugador>jugadores){
		System.out.println("Ingreses Nacionalidad a filtrar");
		String nac= sc.next();
		int i,cont=0;
		for (i=0; i<jugadores.size();i++) {
			if(jugadores.get(i).getNac().equals(nac))
				cont++;
		}
		System.out.println("Existen "+cont+" "+"Jugadores de nacionalidad "+nac);
	}
	
	
	
	public static Jugador buscarJugador(String nombre, String apellido, List<Jugador>jugadores) {
		Jugador jugadorEncontrado = new Jugador();
		try {        	
            for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jugadorEncontrado = jugador;
            	}                
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
        }
        return jugadorEncontrado;
		
	}
	
	public static int buscIndJugador(String nombre, String apellido, List<Jugador>jugadores) {
		int jug =-1;
            for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jug = jugadores.indexOf(jugador);
            	}                
            }
            return jug;
        } 
        

	}
		


	
	
		
