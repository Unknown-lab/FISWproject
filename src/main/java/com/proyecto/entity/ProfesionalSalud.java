package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="profesional_salud")
public class ProfesionalSalud {
	
	@Id
	private String rut;
	@Column(name="nombre")
	private String nombre;
	@Column(name="labor")
	private String labor;
	@OneToMany(mappedBy="profesionalSalud")
	private List<Formulario> formulario;  //aqui es donde se guardaran los formularios que
	//que tiene asociado este rut, para hacer un get más rapido en un join
	
	public ProfesionalSalud(String rut, String nombre, String labor, List<Formulario> formulario) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.labor = labor;
		this.formulario = formulario;
	}
	
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public List<Formulario> getFormulario() {
		return formulario;
	}
	public void setFormulario(List<Formulario> formulario) {
		this.formulario = formulario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLabor() {
		return labor;
	}
	public void setLabor(String labor) {
		this.labor = labor;
	}
	@Override
	public String toString() {
		return "ProfesionalSalud [rut=" + rut + ", nombre=" + nombre + ", labor=" + labor+"]";
	}
	
	
	
	
	
	
}
