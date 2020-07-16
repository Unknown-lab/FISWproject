package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.ProfesionalSalud;

@Repository
public interface IProSaludRepo extends JpaRepository<ProfesionalSalud,String>{
	public ProfesionalSalud findByRut(String rut);
	public boolean existeRut(String rut);
}
