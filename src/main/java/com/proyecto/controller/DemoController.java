/*
package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.entity.ProfesionalSalud;
import com.proyecto.repo.IProSaludRepo;


@Controller
public class DemoController {

	@Autowired
	private IProSaludRepo repo;
	
	@GetMapping("/home") 
	public String home() {
		//insercion de datos cuando valla a esta direccion en la pagina web
		ProfesionalSalud ps=new ProfesionalSalud("19884119","Sebastian","Cirujano");
		repo.save(ps);
		return "home";
	}
}
*/

package com.proyecto.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.entity.ProfesionalSalud;
import com.proyecto.repo.IProSaludRepo;


@RestController
@RequestMapping("/profesional_salud")
public class DemoController {

	@Autowired
	private IProSaludRepo repo;
	
	@RequestMapping("")
	public List<ProfesionalSalud> listaProSalud(){
		return repo.findAll();
	}
	@RequestMapping(value="", method = RequestMethod.POST)
	public ProfesionalSalud crearProSalud(@RequestBody ProfesionalSalud prosalud) {
		return repo.save(prosalud);
	}
	@RequestMapping(method= RequestMethod.PUT, value = "/{rut}")
	public ProfesionalSalud updateProSalud(@PathVariable("rut") String rut, @RequestBody ProfesionalSalud prosalud) {
		if(prosalud != null && repo.existeRut(rut)){
			ProfesionalSalud oldprosalud  = repo.findByRut(rut);
			oldprosalud.setNombre(prosalud.getNombre());
			oldprosalud.setLabor(prosalud.getLabor());
			
			return repo.save(oldprosalud);
		}
		return null;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/{rut}")
	public ProfesionalSalud readProSalud(@PathVariable("rut") String rut) {
		return repo.findByRut(rut);
	}
}
