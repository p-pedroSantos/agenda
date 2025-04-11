package br.com.via1.Agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AgendaController {
	
	@GetMapping("/home")
	public String index() {
		return "home";
	}
	
	@GetMapping("/")
	public String teste() {
		return "teste";
	}
}
