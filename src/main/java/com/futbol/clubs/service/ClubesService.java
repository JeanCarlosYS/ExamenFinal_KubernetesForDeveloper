package com.futbol.clubs.service;

import java.util.List;

import com.futbol.clubs.controller.bean.ClubesBean;
import com.futbol.clubs.controller.domain.ClubesRequest;

public interface ClubesService {

	List<ClubesBean> obtenerLista() throws Exception;

	int agregarCampeon(ClubesRequest request) throws Exception;

}
