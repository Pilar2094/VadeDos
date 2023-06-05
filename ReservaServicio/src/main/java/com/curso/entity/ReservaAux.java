package com.curso.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class ReservaAux {

	@Id
	@Column(name="idreserva")
	private int idReserva;
	@Column(name="nombrecliente")
	private String nombreCliente;
	@Column(name="dni")
	private String dni;
	@Column(name="idhotel")
	private int idHotel;
	@Column(name="idvuelo")
	private int idVuelo;
	
	private int cantPersonas;
	
	public ReservaAux() {
	
	}
	

	public ReservaAux(int idReserva, String nombreCliente, String dni, int idHotel, int idVuelo, int  cantPersonas) {
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
		this.cantPersonas = cantPersonas;
	}
	

	

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

}
