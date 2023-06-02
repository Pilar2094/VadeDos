/**
 * 
 */
package com.curso.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curso.entity.Vuelo;

/**
 * @author Carlos Luo
 *
 */
public interface VueloDao extends JpaRepository<Vuelo, Integer> {

	@Query("select v from  Vuelo v where v.plazasDisponibles>=:plazas")
	List<Vuelo>listaVuelosDisponibles(int plazas);
	
	
}
