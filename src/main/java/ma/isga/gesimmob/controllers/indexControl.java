package ma.isga.gesimmob.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.isga.gesimmob.entities.Bien;
import ma.isga.gesimmob.entities.Societe;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.services.SocieteService;


@Controller
public class indexControl {

	@Autowired
	BienRepository bienRepository;
	
	@Autowired
	SocieteService ps;
	
   @Secured(value = {"ROLE_ADMIN"})
   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexShow(String identSociete, Model model){
	   
	   List<Bien> biens = bienRepository.allBien(identSociete);
	   model.addAttribute("BienById", biens);
	   
	   try {
 			
			  Societe st = ps.findByIdent(identSociete);
			  model.addAttribute("ste", st);
			  	 
			 
		} catch (Exception e) {
			
			model.addAttribute("exception", e);
		}
	   	  
        return "index"; 
    }
   
   
   
      @RequestMapping(value = "/allBien", method = RequestMethod.GET)
	  public String allBien(Model model) {
	  
		  List<Bien> biens = bienRepository.findAll();
	      model.addAttribute("allBien", biens);
	  
	   return "allBien"; 
	 }
      
	/*
	 * @GetMapping(value = "/_bien") public String consulter(Model model, String
	 * identSociete) {
	 * 
	 * try {
	 * 
	 * Societe st = ps.findByIdent(identSociete); model.addAttribute("ste", st);
	 * 
	 * 
	 * 
	 * 
	 * } catch (Exception e) {
	 * 
	 * model.addAttribute("exception", e); }
	 * 
	 * return "redirect:/index"; }
	 */
	 
    
}
