package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Hotel;
import com.curso.service.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class HotelController {

	@Autowired
	HotelService service;
	

	@ApiOperation(value = "Devuelve la lista con todos los hoteles")
	@ApiParam(value="http://localhost:8081/hoteles")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Hotel.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping(value="hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> listaHoteles(){
		return service.listaHoteles();
	}
	
	
	@ApiOperation(value = "Devuelve los datos del hotel seleccionado ")
	@ApiParam(value="http://localhost:8081/hoteles/{nombre}")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Hotel.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping(value="hoteles/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Hotel buscarHotel(@PathVariable("nombre")String nombre) {
		return service.buscarHotel(nombre);
	}
	
	
	@ApiOperation(value = "Agrega los datos de un hotel")
	@ApiParam(value="http://localhost:8081/hoteles")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class ),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Hotel.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@PostMapping(value="hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
	public void buscarHotel(@RequestBody Hotel hotel) {
		service.agregarHotel(hotel);
	}
}
