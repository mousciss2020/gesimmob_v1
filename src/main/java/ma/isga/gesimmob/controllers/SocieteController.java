package ma.isga.gesimmob.controllers;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.isga.gesimmob.entities.Societe;
import ma.isga.gesimmob.repositories.SocieteRepos;
import ma.isga.gesimmob.services.BienService;
import ma.isga.gesimmob.services.SocieteService;





@Controller
public class SocieteController {
	
	
	  @Autowired 
	  SocieteService ps;
	  @Autowired
	  SocieteRepos sr;
	  @Autowired
	  BienService bs;
	   
	
	  @RequestMapping(value="/_bien", method = RequestMethod.POST) 
	  public void addProprietaire(Model model, Societe ste) {
	  
		  if(ps.isSocieteExist(ste.getIdentSociete())) {
			  
			  model.addAttribute("existe", true);
			 
			 
		  }
		  
		  ps.addSociete(ste);
			  
	 
	  
	  }
	 
	  
	}
