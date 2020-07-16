package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="preguntas")
public class Preguntas {
	
	@EmbeddedId PreguntasId preguntas_id;
	@Column	private String descripcion;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
