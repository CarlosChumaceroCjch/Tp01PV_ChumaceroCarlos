package ar.edu.unju.fi.ejercicio18.model;

public enum Pais {
	ARGENTINA("Argentina",1),BOLIVIA("Bolivia",2);
	private int cod;
	private String pais;
	
	public int getCod() {
		return cod;
	}

	public String getPais() {
		return pais;
	}
	
	private Pais(String pais,int cod) {
		this.pais =pais;
		this.cod=cod;
	}
	

}

