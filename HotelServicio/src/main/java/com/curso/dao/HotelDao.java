package com.curso.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.entity.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {

	@Query("select h from Hotel h where h.nombre =:nombre")
	Hotel buscarHotel(String nombre);
	
}
