package com.futbol.clubs.controller.domain;

import java.util.List;

import com.futbol.clubs.controller.bean.ClubesBean;

public class ClubesResponse {
	private List<ClubesBean> listaClubes;

	public List<ClubesBean> getListaClubes() {
		return listaClubes;
	}

	public void setListaClubes(List<ClubesBean> listaClubes) {
		this.listaClubes = listaClubes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClubesResponse [listaClubes=");
		builder.append(listaClubes);
		builder.append("]");
		return builder.toString();
	}

}
