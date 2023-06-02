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

	@Override
	public void actualizarPlazaVuelo(int idVuelo, int plazas ) {
		Vuelo vuelo = dao.findById(idVuelo).orElse(null);
			if(vuelo!=null) {
				vuelo.setPlazasDisponibles(vuelo.getPlazasDisponibles()-plazas);
				dao.save(vuelo);
		}
	}

	@Override
	public Vuelo BuscarVueloPorID(int idVuelo) {
		return dao.findById(idVuelo).orElse(null);
	}
	
	
	

}
