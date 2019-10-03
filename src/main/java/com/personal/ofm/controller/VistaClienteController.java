package com.personal.ofm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vista")
public class VistaClienteController {
	
	@GetMapping(value = "mostrar")
	public String mostrar() {
		return "vistaCliente/index";
	}

}