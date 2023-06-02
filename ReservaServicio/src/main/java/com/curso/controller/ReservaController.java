/**
 * 
 */
package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Reserva;
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
	
	@ApiOperation(value = "Devuelve la lista de las reservas creadas")
	@ApiParam(value="http://localhost:8080/reservas")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Reserva.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@PostMapping(value="reservas", produces=MediaType.APPLICATION_JSON_VALUE)
	public void crearReserva(@RequestBody Reserva reserva) {
		service.crearReserva(reserva);
	}
}
