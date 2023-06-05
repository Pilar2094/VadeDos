package com.curso.service;

import java.util.List;

import com.curso.entity.Hotel;

public interface HotelService{
	
	List<Hotel> listaHoteles();
	Hotel buscarHotel(String nombre);
	void agregarHotel(Hotel hotel);
}
