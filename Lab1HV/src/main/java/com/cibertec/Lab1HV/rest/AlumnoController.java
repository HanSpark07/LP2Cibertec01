package com.cibertec.Lab1HV.rest;

import com.cibertec.Lab1HV.model.Alumno;
import com.cibertec.Lab1HV.services.IAlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    IAlumnoServices alumnoServices;

    @Autowired
    public AlumnoController(IAlumnoServices alumnoServices) {
        this.alumnoServices=alumnoServices;
    }

    @GetMapping("/alumnos")
    public List<Alumno> getAll() {
        return alumnoServices.GetAllAlumnos();
    }

    @GetMapping("/alumno/{id}")
    public Alumno getAll(@PathVariable int id) {
        return alumnoServices.FindAlumnoById(id);
    }

    @PostMapping("/alumno")
    public Alumno saveAlumno(@RequestBody Alumno entity) { return alumnoServices.SaveAlumno(entity); }

    @PutMapping("/alumno/{id}")
    public Alumno updateAlumno(@PathVariable int id, @RequestBody Alumno entity) { return alumnoServices.UpdateAlumno(id, entity); }

    @DeleteMapping("/alumno/{id}")
    public void deleteAlumno(@PathVariable int id) { alumnoServices.DeleteAlumno(id); }
}
