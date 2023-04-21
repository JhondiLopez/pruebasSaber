package com.parcialEmpresariales.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.parcialEmpresariales.app.repository.coordinadorRepository;
import com.parcialEmpresariales.app.entity.Coordinador;
import com.parcialEmpresariales.app.repository.estudianteRepository;
import com.parcialEmpresariales.app.entity.Estudiante;
import com.parcialEmpresariales.app.exception.NotFoundException;



@Controller
public class HomeController {
	@Autowired
	private coordinadorRepository ICoordinador;
	@Autowired
	private estudianteRepository IEstudiante;
	@GetMapping("/index")
	public String index(Model model) {
		return "index";
	}
	
	//LoginCoordinadores
	@GetMapping("/loginCoordinador")
	public String loginCoordinador(Model model, @ModelAttribute Coordinador coordinador) {
		model.addAttribute("user", coordinador);
		return "loginCoordinador";
	}
	
	@PostMapping("/loginCoordinador")
	public String loginCoordinador(@ModelAttribute Coordinador coordinador) {
		
		for(Coordinador item :ICoordinador.findAll()) {
			if(item.getUsuario().equals(coordinador.getUsuario())) {
				if(item.getContrasena().equals(coordinador.getContrasena())) {
					return "redirect:/estudiantes/";
				}
			}
		}
		return "redirect:/index";
	}
	
	@GetMapping("/formUser")
	public String createuser(Model model, @ModelAttribute Coordinador coordinador) {
		model.addAttribute("user", coordinador);
		return "formUser";
	}
	
	@PostMapping("/formUser")
	public String createuser(@ModelAttribute Coordinador coordinador) {
		
		ICoordinador.save(coordinador);
		
		return "redirect:/login";
	}

	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/loginEstudiante")
	public String loginEstudiante(Model model, @ModelAttribute Estudiante estudiante) {
		model.addAttribute("user", estudiante);
		return "loginEstudiante";
	}
	
	//LoginEstudiante	
	@PostMapping("/loginEstudiante")
	public String loginEstudiante(@ModelAttribute Estudiante estudiante) {
		
		for(Estudiante item :IEstudiante.findAll()) {
			if(item.getCedula().equals(estudiante.getCedula())) {
				if(item.getContrasena().equals(estudiante.getContrasena())) {
					return "redirect:/estudiantes/ver/" + item.getId();
				}
			}
		}
		return "redirect:/index";
	}
}

