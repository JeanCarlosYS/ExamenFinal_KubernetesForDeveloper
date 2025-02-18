package com.futbol.clubs.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.futbol.clubs.controller.bean.ClubesBean;
import com.futbol.clubs.repository.ClubesRepository;
import com.futbol.clubs.repository.model.ClubesModel;

@Repository
public class ClubesRepositoryImpl implements ClubesRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ClubesBean> obtenerListaClubes() throws Exception {
	    return jdbcTemplate.query("SELECT * from CLUBES", BeanPropertyRowMapper.newInstance(ClubesBean.class));
	}

	@Override
	public int agregarClub(ClubesModel model) throws Exception {
		return jdbcTemplate.update("INSERT INTO CLUBES (NOMBRECLUB, NROCAMPEONATOS) VALUES(?,?)",
		        new Object[] { model.getNombreClub(), model.getNroCampeonatos()});
		
	}

}
