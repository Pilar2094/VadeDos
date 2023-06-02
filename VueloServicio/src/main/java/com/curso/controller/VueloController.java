/**
 * 
 */
package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Vuelo;
import com.curso.service.VueloService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author sinensia
 *
 */
@RestController
public class VueloController {

	@Autowired
	VueloService service;
	
	@ApiOperation(value = "Devuelve la lista de vuelos con plazas disponibles")
	@ApiParam(value="http://localhost:8081/vuelos/{plazas}")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Vuelo.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Vuelo.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping(value="vuelos/{plazas}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> listaVuelosDisponibles(@PathVariable("plazas")int plazas){
		return service.listaVuelosDisponibles(plazas);
	}
	
	@ApiOperation(value = "Actualiza las plazas del vuelo")
	@ApiParam(value="http://localhost:8081/vuelos/{idvuelo}/{plazas}")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Vuelo.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Vuelo.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@PutMapping(value="vuelos/{idvuelo}/{plazas}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarPlazaVuelo(@PathVariable("idvuelo")int idVuelo, @PathVariable("plazas")int plazas){
		service.actualizarPlazaVuelo(idVuelo, plazas);
	}
	
	@ApiOperation(value = "Devuelve los datos del vuelo por id.")
	@ApiParam(value="http://localhost:8081/vuelos/{idvuelo}")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Vuelo.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Vuelo.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping(value="vuelos/{plazas}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> BuscarVuelosPorId(@PathVariable("idvuelo")int idVuelo){
		return service.listaVuelosDisponibles(idVuelo);
	}
}
