package com.curso.dao;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curso.entity.Reserva;

/**
 * 
 * @author Carlos Luo
 *
 */

public interface ReservaDao extends JpaRepository<Reserva, Integer> {

	@Modifying
	@Query(value = "insert into reservas (nombrecliente, dni, idhotel, idvuelo) values (:nombreCliente, :dni, :idHotel, :idVuelo)", nativeQuery=true)
	@Transactional
	void crearReserva(String nombreCliente,String dni, int idHotel, int idVuelo);
	
	@Query("select r from Reserva r where  r.nombreCliente =:nombreCliente")
	Reserva buscarPorNombreCliente(String nombreCliente);
	
}
