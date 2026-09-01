package ifrn.pi.eventos.controllers;

import ifrn.pi.eventos.models.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping("/eventos/salvar")
	public String salvar(Evento evento) {
		
		System.out.println("Nome: " + evento.getNome());
		System.out.println("Local: " + evento.getLocal());
		System.out.println("Data: " + evento.getData());
		System.out.println("Horário: " + evento.getHorario());
		
		return "sucesso";
	}
}
