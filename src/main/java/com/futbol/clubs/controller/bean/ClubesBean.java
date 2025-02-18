package com.futbol.clubs.controller.bean;

public class ClubesBean {
	private long id;
	private String nombreClub;
	private String nroCampeonatos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public String getNroCampeonatos() {
		return nroCampeonatos;
	}

	public void setNroCampeonatos(String nroCampeonatos) {
		this.nroCampeonatos = nroCampeonatos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClubesBean [id=");
		builder.append(id);
		builder.append(", nombreClub=");
		builder.append(nombreClub);
		builder.append(", nroCampeonatos=");
		builder.append(nroCampeonatos);
		builder.append("]");
		return builder.toString();
	}

}
