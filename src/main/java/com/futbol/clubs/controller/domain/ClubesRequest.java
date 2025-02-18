package com.futbol.clubs.controller.domain;

public class ClubesRequest {
	private String nombreClub;
	private String nroCampeonatos;

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
		builder.append("ClubesRequest [nombreClub=");
		builder.append(nombreClub);
		builder.append(", nroCampeonatos=");
		builder.append(nroCampeonatos);
		builder.append("]");
		return builder.toString();
	}

}
