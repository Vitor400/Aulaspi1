package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosControllers {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
}
