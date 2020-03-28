package com.immobilier.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.immobilier.entities.Societe;
import com.immobilier.services.SocieteService;




@Controller
public class registreControl {

	
	  @Autowired 
	  private SocieteService ss;
	 
	@RequestMapping(value="/registre")
	public String registre() {
		//model.addAttribute("user", new User());
		return "registre";
	}
	
	
	  @RequestMapping(value = "/saveUser", method = RequestMethod.POST) public
	  String addUser(Societe ste) {
		  
		  ss.addSociete(ste);
		  
	  return"redirect:/login"; 
	  
	  }
	 
	
}
