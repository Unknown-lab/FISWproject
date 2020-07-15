package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @IdClass(PreguntasId.class)
@Table(name="preguntas")
public class Preguntas {
	
	@Id
	private int id_formulario;
	@Id
	private int num_pregunta;
	@Column
	private String descripcion;
	
	@ManyToOne
	private Formulario formulario;
	
	
	public Formulario getFormulario() {
		return formulario;
	}
	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
