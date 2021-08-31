package com.valtx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	private Long cod_usuario;
	private String nombre;
	private String users;
	private String password;
	
	@ManyToOne
	@JoinColumn(name="cod_sucursal")
	private Sucursal sucursal;

	public Usuario() {}
	
	public Usuario(Long cod_usuario, String nombre, String users, String password, Sucursal sucursal) {
		super();
		this.cod_usuario = cod_usuario;
		this.nombre = nombre;
		this.users = users;
		this.password = password;
		this.sucursal = sucursal;
	}

	public Long getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(Long cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	
	
	
}
