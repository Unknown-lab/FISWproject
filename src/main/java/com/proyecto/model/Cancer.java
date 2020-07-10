package com.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cancer {
	
	@Id
	private int id_cancer;
	@Column
	private String nombre_cancer;
	@Column
	private String nivel_urgencia;

	public int getId_cancer() {
		return id_cancer;
	}

	public void setId_cancer(int id_cancer) {
		this.id_cancer = id_cancer;
	}

	public String getNombre_cancer() {
		return nombre_cancer;
	}

	public void setNombre_cancer(String nombre_cancer) {
		this.nombre_cancer = nombre_cancer;
	}

	public String getNivel_urgencia() {
		return nivel_urgencia;
	}

	public void setNivel_urgencia(String nivel_urgencia) {
		this.nivel_urgencia = nivel_urgencia;
	}
	

}
