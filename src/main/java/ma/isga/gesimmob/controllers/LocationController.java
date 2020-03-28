package ma.isga.gesimmob.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ma.isga.gesimmob.entities.Bien;
import ma.isga.gesimmob.entities.Location;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.LocataireRepos;
import ma.isga.gesimmob.repositories.LocationRepos;
import ma.isga.gesimmob.repositories.PhotoRepository;
import ma.isga.gesimmob.services.LocationService;



@Controller
public class LocationController {
	
	@Autowired
	BienRepository br;
	
	@Autowired
	LocationRepos lr;
	
	@Autowired
	LocataireRepos locatR;
	
	@Autowired
	LocationService ls;
	
	@Autowired
	PhotoRepository photoRepository;
	
	 @RequestMapping(value = "/reserve", method = RequestMethod.GET) public
	  String reserveBien(Integer IdBien,Model model) {
	  
	  Bien bn = br.findById(IdBien).get();
	  model.addAttribute("bien",bn);
	  
	  //Locataire ln= locatR.findByIdentLocataire(identLocataire);
	  model.addAttribute("locataire",locatR.findAll());
	  
	  return "reserveBien"; 
	  }
	 
	 @RequestMapping(value = "/loue", method = RequestMethod.GET) public
	  String loueBien(Integer IdBien,Model model) {
	  
	  Bien bn = br.findById(IdBien).get();
	  model.addAttribute("bien",bn);
	  
	  //Locataire ln= locatR.findByIdentLocataire(identLocataire);
	  model.addAttribute("locataire",locatR.findAll());
	  
	  return "loueBien"; 
	  }
	 
	 @RequestMapping(value = "/saveLocation", method = RequestMethod.POST) 
	  public String updateBien(Location locat,Integer IdBien, String identLocataire,Model model) { 
		 
		 
		 ls.addLocation(locat, IdBien, identLocataire);
		
	   return "redirect:/_location";
	  
	  }
	 @RequestMapping(value = "/saveLocation1", method = RequestMethod.POST) 
	  public String updateBien1(Location locat,Integer IdBien, String identLocataire,Model model) { 
		 
		 
		 ls.addLocation1(locat, IdBien, identLocataire);
		
	   return "redirect:/_location";
	  
	  }
	 
	 
	 

}
