package br.ne.pi.the.palm.internationalization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller da página home
 * @author Pedro Alex
 */
@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Home";
	}
}
