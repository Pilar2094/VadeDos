/**
 * 
 */
package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.entity.Reserva;

/**
 * @author sinensia
 *
 */
@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaDao dao;
	@Autowired
	RestTemplate template;
	
	String url="http://localhost:8082/";
	
	
	@Override
	public void crearReserva(Reserva reserva) {
		template.put(url+"vuelos/"+reserva.getIdVuelo()+"/"+reserva.getCantPersonas(), Reserva.class);
		dao.crearReserva(reserva.getNombreCliente(), reserva.getDni(), reserva.getIdHotel(), reserva.getIdVuelo());
		}

	
	
	/**
	 * paramentro de entrada nombre del cliente
	 * mostrar todos las reservas cuyo nombre sea el cliente
	 * mosntrar dni, todos los datos del vuelo y nombre del hotel
	 * No tiene sentido realizar una busqueda con el nombre del hotel en el parametro de entrada, 
	 * por lo que se ha conciderado que el nombre del paramentro de entrada es el del cliente.
	 */
	@Override
	public List<Reserva> listareservas(String nombre) {
		Reserva datoReserva = dao.buscarPorNombreCliente(nombre);
		
		return dao.findAll();
	}

}
