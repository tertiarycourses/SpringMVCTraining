package goalsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/manage-goal")
	public String manageGoals() {
		return "manage-goal";
	}
	
	@GetMapping("/list-goals")
	public String listGoals() {
		return "list-goals";
	}
}
