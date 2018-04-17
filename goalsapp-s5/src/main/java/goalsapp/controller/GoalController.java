package goalsapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import goalsapp.model.Goal;
import goalsapp.service.GoalService;

@Controller
public class GoalController {

	@Autowired
	private GoalService goalService;
	
	@PostMapping("/save-goal")
	public String saveGoal(@ModelAttribute Goal goal, BindingResult bindingResult, HttpServletRequest request) {
		this.goalService.saveOrUpdate(goal);
		request.setAttribute("message", "Succesfully saved!");
		return "manage-goal";
	}
	
	@GetMapping("/edit-goal")
	public String editGoal(@RequestParam int id, HttpServletRequest request) {
		Goal goal = this.goalService.findById(id);
		request.setAttribute("goal", goal);
		return "manage-goal";
	}
	
	@GetMapping("/delete-goal")
	public String deleteGoal(@RequestParam int id, HttpServletRequest request) {
		this.goalService.delete(id);
		return "redirect:list-goals";
	}
}
