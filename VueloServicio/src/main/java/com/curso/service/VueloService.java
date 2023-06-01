/**
 * 
 */
package com.curso.service;

import java.util.List;

import com.curso.entity.Vuelo;

/**
 * @author Carlos Luo
 *
 */
public interface VueloService {

	List<Vuelo> listaVuelosDisponibles(int plazas);
}
