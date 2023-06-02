package com.curso.service;

import java.util.List;

import com.curso.entity.Reserva;

public interface ReservaService {

	void crearReserva(Reserva reserva);
	List<Reserva> listareservas(String nombre);
}
