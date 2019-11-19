package com.spk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spk.model.Team;
import com.spk.service.TeamService;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

	@Autowired
	private TeamService service;

	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

	/*
	 * @GetMapping("/showForm") public String showFormForAdd(Model theModel) { Team
	 * team = new Team(); theModel.addAttribute("team", team); return
	 * "add-team-form"; }
	 */
	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public
	 * ModelAndView addTeamPage() { ModelAndView modelAndView = new
	 * ModelAndView("add-team-form"); modelAndView.addObject("team", new Team());
	 * return modelAndView; }
	 * 
	 * @RequestMapping(value = "/add", method = RequestMethod.POST) public
	 * ModelAndView addingTeam(@ModelAttribute Team team) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("home"); service.addTeam(team);
	 * 
	 * String message = "Team was successfully added.";
	 * modelAndView.addObject("message", message);
	 * 
	 * return modelAndView; }
	 */

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Team team = new Team();
		theModel.addAttribute("team", team);
		return "add-team-form";
	}

	@PostMapping("/saveTeam")
	public String saveTeam(@ModelAttribute("team") Team team) {
		service.addTeam(team);
		return "redirect:/team/list";
	}

	/*
	 * @PostMapping("/add") public String saveTeam(@ModelAttribute("team") Team
	 * team) { service.addTeam(team); return "redirect:/team/list"; }
	 */
	@GetMapping("/list")
	public String listOfTeams(Model theModel) {
		List<Team> teams = service.getTeams();
		theModel.addAttribute("teams", teams);
		return "list-of-teams";
	}

	@GetMapping("/edit/{id}")
	public String editTeamPage(@PathVariable Integer id, Model theModel) {
		Team team = service.getTeam(id);
		theModel.addAttribute("team", team);
		return "edit-team-form";
	}

	@GetMapping("/delete/{id}")
	public String deleteTeam(@PathVariable Integer id) {
		service.deleteTeam(id);
		return "home";
	}
}
