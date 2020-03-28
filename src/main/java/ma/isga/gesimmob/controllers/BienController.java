package ma.isga.gesimmob.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.isga.gesimmob.entities.Bien;
import ma.isga.gesimmob.entities.Societe;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.DocRepository;
import ma.isga.gesimmob.repositories.SocieteRepos;
import ma.isga.gesimmob.services.BienService;
import ma.isga.gesimmob.services.SocieteService;


@Controller
public class BienController {
	
	@Autowired
	BienService bs;
	@Autowired
	SocieteRepos pr;
	@Autowired
	BienRepository br;
	@Autowired
	SocieteService ps;
	
	@GetMapping(value = "/_bien1")
	public String ShowBien(Model model) {
	model.addAttribute("societes", pr.findAll());
		return "_bien";
	}
	@GetMapping(value = "/_bien")
	public String consulter(Model model, String identSociete) {
		
		try {
			
			  Societe st = ps.findByIdent(identSociete);
			  model.addAttribute("ste", st);
			  
			
			/*
			 * Bien bn = bs.findByIdSociete(st.getIdentSociete());
			 * model.addAttribute("bien", bn);
			 */
			 
			 
			 
		} catch (Exception e) {
			
			model.addAttribute("exception", e);
		}
		/*try { 
			Bien bn = bs.findByIdSociete(identSociete); 
			  model.addAttribute("bien", bn);
		} catch (Exception e) {
			model.addAttribute("except", e);
		}
		*/
	
		return "_bien";
	}
	
	 @RequestMapping(value="/addBien", method = RequestMethod.POST)
	public String addBien(Bien bien,Model model,String identSociete) {
		 
		  br.save(bien);
		  
		  return "redirect:/_bien?identSociete="+identSociete;
	}
	 @Autowired
		DocRepository dr;
		
	/*
	 * @RequestMapping(value="/addDocument", method = RequestMethod.GET) public
	 * String addBien(Document doc,Model model,Integer IdBien) {
	 * 
	 * dr.save(doc); return "redirect:/_bien?id="+IdBien; }
	 */
		@RequestMapping(value = "/supprimer", method = RequestMethod.GET)
		public String supprime(Integer IdBien) {
		     Bien b = br.findById(IdBien).get();
		     br.delete(b);
			return "redirect:/_location";
		}
		
	
	  @RequestMapping(value = "/edite", method = RequestMethod.GET) 
	  public String editeBien(Integer IdBien,Model model) {
	  
	  
	  Bien b = br.findById(IdBien).get();
	  
	  model.addAttribute("bien",b);
	  
	  
	  return "editeBien"; 
	  }
	  
		
	
	  @RequestMapping(value = "/saveBien", method = RequestMethod.POST) 
	  public String updateBien(Bien bien) { 
	       
		
		 br.save(bien) ;
		  
	   return "redirect:/_location";
	  
	  
	  }
	 

	  @RequestMapping(value = "/suppLoc", method = RequestMethod.GET) 
	  public String editeLoc(Integer IdBien,Model model) {
	  
	  
	  Bien b = br.findById(IdBien).get();
	  
	  model.addAttribute("bien",b);
	  
	  
	  return "editeLoc"; 
	  }
	  
	  @RequestMapping(value = "/saveLoc", method = RequestMethod.POST) 
	  public String updateLoc(Bien bien) { 
	       
		
		 br.save(bien) ;
		  
	   return "redirect:/_location";
	  
	  
	  }

}
