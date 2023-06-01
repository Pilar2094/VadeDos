package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.Dao.VueloDao;
import com.curso.entity.Vuelo;

@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	VueloDao dao;
	
	@Override
	public List<Vuelo> listaVuelosDisponibles(int plazas) {
		return dao.listaVuelosDisponibles(plazas);
	}

}
