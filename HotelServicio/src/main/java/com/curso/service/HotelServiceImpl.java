package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.entity.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelDao dao;
	
	@Override
	public List<Hotel> listaHoteles() {
		return dao.findAll();
	}

	@Override
	public Hotel buscarHotel(String nombre) {
		return dao.buscarHotel(nombre);
	}
	
	

}
