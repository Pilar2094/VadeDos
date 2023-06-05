/**
 * 
 */
package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.DatoReserva;
import com.curso.entity.Reserva;
import com.curso.entity.ReservaAux;
import com.curso.service.ReservaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author sinensia
 *
 */

@RestController
public class ReservaController {

	@Autowired
	ReservaService service;
	
	/**
	 * @param reservaAux
	 */
	@ApiOperation(value = "Crea la reserva del usuario, no devuelve ningun dato")
	@ApiParam(value="http://localhost:8080/reservas")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Reserva.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@PostMapping(value="reservas", produces=MediaType.APPLICATION_JSON_VALUE)
	public void crearReserva(@RequestBody ReservaAux reservaAux) {
		service.crearReserva(reservaAux);
	}
	
	@ApiOperation(value = "Devuelve una lista con las reservas creadas")
	@ApiParam(value="http://localhost:8080/reservas/{nombre}")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Reserva.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping(value="reservas/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<DatoReserva> listareservas(@PathVariable("nombre") String nombre) {
		return service.listareservas(nombre);
	}
	
	
}
