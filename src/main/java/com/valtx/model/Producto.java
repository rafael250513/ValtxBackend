package com.valtx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	private Long cod_producto;
	private String nombre;
	private double precio;
	
	
	public Producto() {}


	public Producto(Long cod_producto, String nombre, double precio) {
		super();
		this.cod_producto = cod_producto;
		this.nombre = nombre;
		this.precio = precio;
	}


	public Long getCod_producto() {
		return cod_producto;
	}


	public void setCod_producto(Long cod_producto) {
		this.cod_producto = cod_producto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
