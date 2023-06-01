package com.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hoteles")
public class Hotel {
	
	@Id
	@Column(name="idhotel")
	private String idHotel;
	@Column(name="nombre")
	private String nombre;
	@Column(name="categoria")
	private int categoria;
	@Column(name="precio")
	private double precio;
	@Column(name="disponibilidad")
	private boolean disponibilidad;
	
	public Hotel() {
	
	}
	
	public Hotel(String idHotel, String nombre, int categoria, double precio, boolean disponibilidad) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}

	public String getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(String idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	
	
	
}
