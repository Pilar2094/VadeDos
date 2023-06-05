package com.curso.service;

import java.util.List;

import com.curso.entity.DatoReserva;
import com.curso.entity.ReservaAux;

public interface ReservaService {

	void crearReserva(ReservaAux reservaAux);
	List<DatoReserva> listareservas(String nombre);
}
