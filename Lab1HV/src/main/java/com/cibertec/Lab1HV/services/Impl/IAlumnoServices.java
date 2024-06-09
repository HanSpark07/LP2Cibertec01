package com.cibertec.Lab1HV.services.Impl;

import com.cibertec.Lab1HV.model.Alumno;
import com.cibertec.Lab1HV.repository.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IAlumnoServices implements com.cibertec.Lab1HV.services.IAlumnoServices {

    IAlumnoRepository _alumnoRepository;

    @Autowired
    public IAlumnoServices(IAlumnoRepository alumnoRepository) {
        _alumnoRepository = alumnoRepository;
    }

    @Override
    public List<Alumno> GetAllAlumnos() {
        return _alumnoRepository.findAll();
    }

    @Override
    public Alumno SaveAlumno(Alumno entity) {
        Alumno alumnoSaved = _alumnoRepository.save(entity);
        return alumnoSaved;
    }

    @Override
    public Alumno FindAlumnoById(int id) {
        Optional<Alumno> rowInDB = _alumnoRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new Alumno();
    }

    @Override
    public Alumno UpdateAlumno(int id, Alumno entity) {
        Optional<Alumno> rowInDB = _alumnoRepository.findById(id);
        if (rowInDB.isPresent()) {
            Alumno var = rowInDB.get();
            var.setName(entity.getName());
            var.setLastName(entity.getLastName());
            var.setAge(entity.getAge());
            var.setGender(entity.getGender());
            var.setMail(entity.getMail());
            return _alumnoRepository.save(var);
        } else {
            return null;
        }
    }

    @Override
    public void DeleteAlumno(int id) {
        _alumnoRepository.deleteById(id);
    }

    @Override
    public List<Alumno> SearchAlumnos(String name) {
        return null;
    }
}
