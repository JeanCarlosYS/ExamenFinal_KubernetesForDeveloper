package com.futbol.clubs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futbol.clubs.controller.bean.ClubesBean;
import com.futbol.clubs.controller.domain.ClubesRequest;
import com.futbol.clubs.repository.ClubesRepository;
import com.futbol.clubs.service.ClubesService;
import com.futbol.clubs.service.adapter.ClubesAdapter;

@Service
public class ClubesServiceImpl implements ClubesService {

	@Autowired
	private ClubesRepository clubesRepository;
	
	@Autowired
	private ClubesAdapter clubesAdapter;

	@Override
	public List<ClubesBean> obtenerLista() throws Exception {
		return clubesRepository.obtenerListaClubes();
	}

	@Override
	public int agregarCampeon(ClubesRequest request) throws Exception {
		return clubesRepository.agregarClub(clubesAdapter.adaptToClubesModel(request));
		
	}

}
