package com.dager.telefonia;

public class Smarphone extends Telefono{

	private String sim;
	
	public Smarphone(int id, double precio, String marca, String modelo, String sim) {
		super(id, precio, marca, modelo);
		this.sim = sim;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}
	

}
