package com.cibertec.Lab1HV.services;

import com.cibertec.Lab1HV.model.Alumno;

import java.util.List;

public interface IAlumnoServices {
    List<Alumno> GetAllAlumnos();
    Alumno SaveAlumno(Alumno entity);
    Alumno FindAlumnoById(int id);
    Alumno UpdateAlumno(int id, Alumno entity);
    void DeleteAlumno(int id);
    List<Alumno> SearchAlumnos(String name);
}
