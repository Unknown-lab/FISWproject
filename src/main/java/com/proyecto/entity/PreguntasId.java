package com.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class PreguntasId implements Serializable{

	private int id_formulario;
	private int num_pregunta;
	
	public PreguntasId(int id_formulario, int num_pregunta) {
		super();
		this.id_formulario = id_formulario;
		this.num_pregunta = num_pregunta;
	}
	
	public int getId_formulario() {
		return id_formulario;
	}
	public void setId_formulario(int id_formulario) {
		this.id_formulario = id_formulario;
	}
	public int getNum_pregunta() {
		return num_pregunta;
	}
	public void setNum_pregunta(int num_pregunta) {
		this.num_pregunta = num_pregunta;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_formulario;
		result = prime * result + num_pregunta;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreguntasId other = (PreguntasId) obj;
		if (id_formulario != other.id_formulario)
			return false;
		if (num_pregunta != other.num_pregunta)
			return false;
		return true;
	}
	
}
