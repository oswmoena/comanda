package cl.moena.comanda.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/index")
	public String index() {
		adasdasdas
		return "Hola Mundo, desde comanda ;)";
	}
	
}
