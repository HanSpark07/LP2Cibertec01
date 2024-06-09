package com.cibertec.Lab1HV.repository;

import com.cibertec.Lab1HV.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Integer> {
}
