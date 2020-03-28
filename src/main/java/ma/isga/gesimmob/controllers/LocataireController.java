package ma.isga.gesimmob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.isga.gesimmob.entities.Locataire;
import ma.isga.gesimmob.repositories.LocataireRepos;
import ma.isga.gesimmob.services.LocataireService;


@Controller
public class LocataireController {
	
	@Autowired
	LocataireService ls;
	@Autowired
	LocataireRepos lr;
	
	
	@PostMapping(value = "/addLocataire")
	public String addLocataire(Model model, Locataire locat) {
		
		ls.addLocataire(locat);
		return "redirect:/_locataire";
		
	}
	
	@RequestMapping(value = "/locataires", method = RequestMethod.GET)
	  public String allBien(Model model) {
	  
		  List<Locataire> loc = lr.findAll();
	      model.addAttribute("all_locataire", loc);
	  
	   return "locataires"; 
	 }
	

}
