package com.parcialEmpresariales.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.parcialEmpresariales.app.entity.Estudiante;
import com.parcialEmpresariales.app.exception.NotFoundException;
import com.parcialEmpresariales.app.repository.estudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/estudiante")
public class EstudianteController {
    @Autowired
    private estudianteRepository estudianteRepository;

    @GetMapping("/")
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante getEstudianteById(@PathVariable String id) {
        return estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
    }

    @PostMapping("/")
    public Estudiante saveEstudiante(@RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Estudiante estudiante = mapper.convertValue(body, Estudiante.class);
        return estudianteRepository.save(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante updateEstudiante(@PathVariable String id, @RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Estudiante estudiante = mapper.convertValue(body, Estudiante.class);
        estudiante.setId(id);
        return estudianteRepository.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public Estudiante deleteEstudiante(@PathVariable String id) {
        Estudiante estudiante = estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
        estudianteRepository.deleteById(id);
        return estudiante;
    }
}