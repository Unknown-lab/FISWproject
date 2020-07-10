package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.ProfesionalSalud;

public interface IProSaludRepo extends JpaRepository<ProfesionalSalud,String>{

}
