/**
 * 
 */
package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.entity.DatoReserva;
import com.curso.entity.HotelAux;
import com.curso.entity.Reserva;
import com.curso.entity.ReservaAux;
import com.curso.entity.VueloAux;

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
	
	String urlVuelo="http://localhost:8082/";
	String urlHotel="http://localhost:8081/";
	

	@Override
	public void crearReserva(ReservaAux reservaAux) {
		template.put(urlVuelo+"vuelos/"+reservaAux.getIdVuelo()+"/"+reservaAux.getCantPersonas(), Reserva.class);
		dao.crearReserva(reservaAux.getNombreCliente(), reservaAux.getDni(), reservaAux.getIdHotel(), reservaAux.getIdVuelo());
		}

	
	
	/**
	 * paramentro de entrada nombre del cliente
	 * mostrar todos las reservas cuyo nombre sea el cliente
	 * mosntrar dni, todos los datos del vuelo y nombre del hotel
	 * No tiene sentido realizar una busqueda con el nombre del hotel en el parametro de entrada, 
	 * por lo que se ha conciderado que el nombre del paramentro de entrada es el del cliente.
	 */
	@Override
	public List<DatoReserva> listareservas(String nombre) {
		List<DatoReserva>datoReservas= new ArrayList<>();
		HotelAux hotel=template.getForObject(urlHotel +"hoteles/"+nombre, HotelAux.class);
			if(hotel.getNombre().equals(nombre)) {
				List<Reserva>reservas= dao.buscarPorNombreHotel(hotel.getIdHotel());			
				for (Reserva reserva : reservas) {					
					VueloAux vuelo=template.getForObject(urlVuelo+"vuelos/"+reserva.getIdVuelo(), VueloAux.class);					
					DatoReserva dato = new DatoReserva(nombre,reserva.getDni(),vuelo.getIdVuelo(),vuelo.getCompania(),vuelo.getFechaVuelo(),vuelo.getPrecio(),vuelo.getPlazasDisponibles());
					datoReservas.add(dato);
				}
			}
		return datoReservas;
	}

}
