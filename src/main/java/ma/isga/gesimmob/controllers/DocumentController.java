package ma.isga.gesimmob.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.isga.gesimmob.entities.Document;

import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.DocRepository;
import ma.isga.gesimmob.services.BienService;


@Controller
public class DocumentController {
	
	
	  @Autowired BienService bs;
	  
	  
	  @Autowired BienRepository br;
	 
	
	  @Autowired DocRepository dr;
	  
	  @RequestMapping(value="/addDocument", method = RequestMethod.GET) public
	  String addBien(Document doc,Model model,Long idBien) {
	  
		  model.addAttribute("document",doc);
		  
	      dr.save(doc); 
	  return "redirect:/_bien?identifant="+idBien; 
	  }
	 
}
