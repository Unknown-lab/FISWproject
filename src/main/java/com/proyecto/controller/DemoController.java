package com.proyecto.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import com.proyecto.repo.IProSaludRepo;

@Controller
public class DemoController {

//	@Autowired
	//private IProSaludRepo repo;
	
	@GetMapping("/home") 
	public String home() {
		//insercion de datos cuando valla a esta direccion en la pagina web
		return "";
	}
	
	
}
