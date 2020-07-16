package com.proyecto.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="formulario")
public class Formulario {
	@Id
	@GeneratedValue
	private int id_formulario;

	@ManyToOne
	@JoinColumn(name="id_cancer")
	private Cancer cancer;
	
	@ManyToOne
	@JoinColumn(name="rut")
	private ProfesionalSalud profesionalSalud; //me toma al profesional de salud que creo el formulario de id= x
	
	@OneToMany(mappedBy="preguntas_id.id_formulario")
	private List<Preguntas> preguntas; 

	
	public Formulario(int id_formulario, Cancer cancer, ProfesionalSalud profesionalSalud, List<Preguntas> preguntas) {
		super();
		this.id_formulario = id_formulario;
		this.cancer = cancer;
		this.profesionalSalud = profesionalSalud;
		this.preguntas = preguntas;
	}
	
	public Cancer getCancer() {
		return cancer;
	}
	public void setCancer(Cancer cancer) {
		this.cancer = cancer;
	}
	public ProfesionalSalud getProfesionalSalud() {
		return profesionalSalud;
	}
	public void setProfesionalSalud(ProfesionalSalud profesionalSalud) {
		this.profesionalSalud = profesionalSalud;
	}
	public List<Preguntas> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<Preguntas> preguntas) {
		this.preguntas = preguntas;
	}
	public int getId_formulario() {
		return id_formulario;
	}
	public void setId_formulario(int id_formulario) {
		this.id_formulario = id_formulario;
	}
}
