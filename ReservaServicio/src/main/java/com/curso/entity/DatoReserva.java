package com.curso.entity;

import java.util.Date;


public class DatoReserva {

	private String nombre;
	private String nombreCliente;
	private int idVuelo;
	private String compania;
	private Date fechaVuelo;
	private int precio;
	private int plazasDisponibles;
	
	public DatoReserva(String nombre, String nombreCliente, int idVuelo, String compania, Date fechaVuelo, int precio,
			int plazasDisponibles) {
		super();
		this.nombre = nombre;
		this.nombreCliente = nombreCliente;
		this.idVuelo = idVuelo;
		this.compania = compania;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

	public DatoReserva() {
		super();
	}
	
	
	
	
	
	
}
