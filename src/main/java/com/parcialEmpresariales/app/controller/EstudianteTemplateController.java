package com.parcialEmpresariales.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.parcialEmpresariales.app.entity.Estudiante;
import com.parcialEmpresariales.app.exception.NotFoundException;
import com.parcialEmpresariales.app.repository.estudianteRepository;
import com.parcialEmpresariales.app.repository.coordinadorRepository;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteTemplateController {
    @Autowired
    private estudianteRepository estudianteRepository;
    @Autowired
    private coordinadorRepository coordinadorRepository;

    @GetMapping("/")
    public String estudiantesListTemplate(Model modelEstudiante, Model modelCoordinador) {    	modelCoordinador.addAttribute("coordinadores", coordinadorRepository.findAll());
        modelEstudiante.addAttribute("estudiantes", estudianteRepository.findAll());
        return "homeCoordinador";
    }
    
    @GetMapping("/visualizar/{id}")
    public String getEstudianteById(@PathVariable("id") String id, Model model) {
    	model.addAttribute("estudiantes", estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
        return "visualizarEstudiante";
    }
    
    @GetMapping("/ver/{id}")
    public String obtenerEstudianteById(@PathVariable("id") String id, Model model) {
    	model.addAttribute("estudiantes", estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
        return "homeEstudiante";
    }

    @GetMapping("/new")
    public String estudiantesNewTemplate(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "estudiantes-form";
    }

    @GetMapping("/edit/{id}")
    public String estudianteEditTemplate(@PathVariable("id") String id, Model model) {
        model.addAttribute("estudiante", estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
        return "actualizarEstudiante";
    }

    @PostMapping("/save")
    public String estudiantesSaveProcess(@ModelAttribute("estudiante") Estudiante estudiante) {
        if (estudiante.getId().isEmpty()) {
            estudiante.setId(null);
        }
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes/";
    }

    @GetMapping("/delete/{id}")
    public String estudianteDeleteProcess(@PathVariable("id") String id) {
        estudianteRepository.deleteById(id);
        return "redirect:/estudiantes/";
    }
}
