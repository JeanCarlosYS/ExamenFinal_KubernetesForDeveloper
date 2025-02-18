package com.futbol.clubs.service.adapter;

import org.springframework.stereotype.Component;

import com.futbol.clubs.controller.domain.ClubesRequest;
import com.futbol.clubs.repository.model.ClubesModel;

@Component
public class ClubesAdapter {

	public ClubesModel adaptToClubesModel(ClubesRequest request) {
		ClubesModel model = new ClubesModel();
		model.setNombreClub(request.getNombreClub());
		model.setNroCampeonatos(request.getNroCampeonatos());
		return model;
	}

}
