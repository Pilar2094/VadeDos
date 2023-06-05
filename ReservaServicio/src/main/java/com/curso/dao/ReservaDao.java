package com.curso.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curso.entity.DatoReserva;
import com.curso.entity.Reserva;

/**
 * 
 * @author Carlos Luo
 *
 */

public interface ReservaDao extends JpaRepository<Reserva, Integer> {

	/**
	 * Consulta JPA para insertar los datos exceptuando la cantidad de pesosnas.
	 * @param nombreCliente String
	 * @param dni String
	 * @param idHotel int
	 * @param idVuelo int
	 */
	@Modifying
	@Query(value = "insert into reservas (nombrecliente, dni, idhotel, idvuelo) values (:nombreCliente, :dni, :idHotel, :idVuelo)", nativeQuery=true)
	@Transactional
	void crearReserva(String nombreCliente,String dni, int idHotel, int idVuelo);
	
	/**
	 * Consulta JPA para obtener los datos de un Hotel segun el nombre del hotel
	 * @param idHotel
	 * @return
	 */
	@Query("select r from Reserva r where r.idHotel =:idHotel")
	List<Reserva> buscarPorNombreHotel(int idHotel);
	
}
