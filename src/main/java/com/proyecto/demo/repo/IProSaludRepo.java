package com.proyecto.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.demo.entity.ProfesionalSalud;

@Repository
public interface IProSaludRepo extends JpaRepository<ProfesionalSalud,String>{

}
