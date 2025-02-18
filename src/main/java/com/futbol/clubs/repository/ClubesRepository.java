package com.futbol.clubs.repository;

import java.util.List;

import com.futbol.clubs.controller.bean.ClubesBean;
import com.futbol.clubs.repository.model.ClubesModel;

public interface ClubesRepository {

	List<ClubesBean> obtenerListaClubes() throws Exception;

	int agregarClub(final ClubesModel adaptToClubesModel) throws Exception;

}
