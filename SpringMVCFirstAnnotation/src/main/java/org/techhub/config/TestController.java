package org.techhub.config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	@RequestMapping("/Welcome")
	public String WelcomePage() {
		return "Welcome";
	}
}
