package com.valtx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursal")
public class Sucursal {
		@Id
		private Long cod_sucursal;
		private String nombre;
		
		public Sucursal() {}
		
		public Sucursal(Long cod_sucursal, String nombre) {
			super();
			this.cod_sucursal = cod_sucursal;
			this.nombre = nombre;
		}

		public Long getCod_sucursal() {
			return cod_sucursal;
		}

		public void setCod_sucursal(Long cod_sucursal) {
			this.cod_sucursal = cod_sucursal;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
		

}
