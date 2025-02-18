package com.futbol.clubs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.futbol.clubs.controller.bean.ClubesBean;
import com.futbol.clubs.controller.domain.ClubesRequest;
import com.futbol.clubs.service.ClubesService;

@RestController
public class ClubesController {

	@Autowired
	private ClubesService clubesService;

	@PostMapping(value = "/clubes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClubesBean>> obtenerListaClubes() {
		List<ClubesBean> listaClubes = null;
		try {
			listaClubes = clubesService.obtenerLista();

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(listaClubes, HttpStatus.OK);
	}

	@PostMapping(value = "/clubes/agregar")
	public void agregarClubCampeon(@RequestBody ClubesRequest request) throws Exception {
		int nroRegistros = clubesService.agregarCampeon(request);
		System.out.println("Nro de Registros actualizados: ".concat(String.valueOf(nroRegistros)));
	}

}
