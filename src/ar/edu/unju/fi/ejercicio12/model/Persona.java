package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;


public class Persona {
	private String nombre;
	private Calendar fecNac;
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecNac() {
		return fecNac;
	}

	public void setFecNac(Calendar fecNac) {
		this.fecNac = fecNac;
	}

	
	//Años de la persona
	public int Edad() {
		Calendar c = Calendar.getInstance();
	    int anio = c.get(Calendar.YEAR) - fecNac.get(Calendar.YEAR);
	    int mes = c.get(Calendar.MONTH) - fecNac.get(Calendar.MONTH);
	    int dia = c.get(Calendar.DAY_OF_MONTH) - fecNac.get(Calendar.DAY_OF_MONTH);
	    if (mes < 0 || (mes == 0 && dia < 0)) {
	        anio = anio - 1;
	    }
	    return anio;
	}
	
	//Signo zodiacal
	public String Signo () {
		String signo ="";
		switch (fecNac.get(Calendar.MONTH)) {
		case 0:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=19)
				signo = "Capricornio";
			else 
				signo ="Acuario";
			break;
		case 1:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=18)
				signo = "Acuario";
			else 
				signo ="Piscis";
			break;
		case 2:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=20)
				signo = "Piscis";
			else 
				signo ="Aries";
			break;
		case 3:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=19)
				signo = "Aries";
			else 
				signo ="Tauro";
			break;
		case 4:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=20)
				signo = "Tauro";
			else 
				signo ="Geminis";
			break;
		case 5:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=20)
				signo = "Geminis";
			else 
				signo ="Cancer";
			break;
		case 6:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=22)
				signo = "Cancer";
			else 
				signo ="Leo";
			break;
		case 7:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=22)
				signo = "Leo";
			else 
				signo ="Virgo";
			break;
		case 8:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=22)
				signo = "Virgo";
			else 
				signo ="Libra";
			break;
		case 9:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=22)
				signo = "Libra";
			else 
				signo ="Escorpio";
			break;
		case 10:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=21)
				signo = "Escorpio";
			else 
				signo ="Sagitario";
			break;
		case 11:
			if (fecNac.get(Calendar.DAY_OF_MONTH)<=21)
				signo = "Sagitario";
			else 
				signo ="Capricornio";
			break;
		}
		return signo;
	}
	
	//Estacion del año cuando nacio
	public String estacion() {
		String est="";
		int mes = fecNac.get(Calendar.MONTH);
		int dia =fecNac.get(Calendar.DAY_OF_MONTH);
		
		if ((mes>=0 && (mes<=2 && dia<20))||(mes==11&&dia>=21)) 
			est="Verano";
		if ((mes>=2 && dia >=21) || (mes<=5 && dia<21))
			est="Otoño";
		if ((mes>=5 && dia >=21) || (mes<=8 && dia<20)) 
			est="Invierno";
		if((mes>=8 && dia >=21) || (mes<11 && dia<21)) 
			est="Primavera";
		return est;
	}
	public String fecha() {
		String fec=fecNac.get(Calendar.DAY_OF_MONTH)+"/"+(fecNac.get(Calendar.MONTH)+1)+"/"+fecNac.get(Calendar.YEAR);
		return fec;
	}
	@Override
	public String toString() {
	
		return "Nombre: "+nombre+"\nFecha nacimiento: "+fecha()+"\nEdad: "+Edad()+"\nSigno del zodiaco: "+Signo()+"\nEstacion: "+estacion();
	}
}
