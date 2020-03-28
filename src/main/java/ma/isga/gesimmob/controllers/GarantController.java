package ma.isga.gesimmob.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import ma.isga.gesimmob.entities.Garant;
import ma.isga.gesimmob.repositories.GarantRepository;
import ma.isga.gesimmob.services.GarantService;


@Controller
public class GarantController {

 @Autowired
 GarantService gs;
 @Autowired
 GarantRepository gp;
 
 @PostMapping(value = "/addGarant")
 public String addGarant(Model model, Garant garant) {
	 //gs.addGarant(garant);
	 model.addAttribute("allGarant", gp.findAllGarant());
	 gp.save(garant);
  return "redirect:/_locataire";
 }

}
