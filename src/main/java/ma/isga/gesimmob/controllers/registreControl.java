package ma.isga.gesimmob.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.isga.gesimmob.entities.User;
import ma.isga.gesimmob.services.UserService;


@Controller
public class registreControl {

	@Autowired
	private UserService userService;

	@RequestMapping(value="/registre")
	public String registre() {
		//model.addAttribute("user", new User());
		return "registre";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String addUser(User user) {
		
		userService.createUser(user);
		return"redirect:/login";
	}
	
}
