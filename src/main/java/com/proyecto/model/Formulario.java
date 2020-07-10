package com.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Formulario {
	@Id
	private int id_formulario;
	@Column
	private String rut;
	@Column
	private int id_cancer;

	public int getId_formulario() {
		return id_formulario;
	}
	public void setId_formulario(int id_formulario) {
		this.id_formulario = id_formulario;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getId_cancer() {
		return id_cancer;
	}
	public void setId_cancer(int id_cancer) {
		this.id_cancer = id_cancer;
	}
}
