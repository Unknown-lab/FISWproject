package com.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Preguntas {
	
	@Id
	private int id_formulario;
	@Id
	private int num_pregunta;
	@Column
	private String descripcion;
	
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
