package ma.isga.gesimmob.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import ma.isga.gesimmob.entities.Bien;
import ma.isga.gesimmob.entities.Societe;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.GarantRepository;
import ma.isga.gesimmob.repositories.LocationRepos;
import ma.isga.gesimmob.repositories.SocieteRepos;
import ma.isga.gesimmob.services.BienService;


@Controller
public class MyController {
	
	@RequestMapping(value ="/login")
	public String login() {
		
		return "login";
	}
	
	@Autowired
	BienRepository br;
	@Autowired
	BienService bs;
	
	@Autowired
	BienRepository bienRepository;
	
	@Autowired
	LocationRepos lr;
	
	@RequestMapping(value = "/_location")
	public String location(Model model) {
		
		 List<Bien> bienNeute = bs.findByEtatBien("Neutre"); 
		/* List<Location> bienNeute = lr.findByEtatBien("Neutre"); */
		model.addAttribute("allBien", bienNeute);
		
		 List<Bien> bienLoue = bs.findByEtatBien("Loue"); 
		/* List<Location> bienLoue = lr.findByEtatBien("Loue"); */
		 model.addAttribute("allBienLoue", bienLoue);
		 
		 List<Bien> bienReservation = bs.findByEtatBien("Reservation"); 
		/* List<Location> bienReservation = lr.findByEtatBien("Reservation"); */
		 model.addAttribute("allBienResrvation", bienReservation);
		 
		 List<Bien> bn = bienRepository.findAll();
		 model.addAttribute("biens",bn);
		 
		return "_location";
	}
	
	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}
	/**
	 *  *********** url de la partie quittances ************
	 * 
	 *  la method pour consulter la quittance
	 * @return
	 */
	@RequestMapping(value="/consult_quittance")
	public String consult_quit() {
		return "consult_quit";
	}

	/**
	 *  la method pour telechargement
	 * @return
	 */
	@RequestMapping(value="/telechargement")
	public String telechargement() {
		return "telechargement";
	}
	
	/**
	 *  *********** url de la partie de paiement ************
	 * 
	 *  la method pour loyers
	 * @return
	 */
	@RequestMapping(value="/loyers")
	public String loyers() {
		return "loyers";
	}

	/**
	 * 
	 * ********** url de la partie de Enregistrement ************
	 * 
	 *  la method pour ajouter un bien
	 * @return
	 */
	
	/*
	 * @RequestMapping(value="/_bien") public String ajouter_bien(Model model) {
	 * List<Societe> listprop = rep.findProp(); model.addAttribute("proplist",
	 * listprop); return "_bien"; }
	 */
	@Autowired
	 GarantRepository gp;
	@RequestMapping(value="/_locataire")
	public String ajouter_locataire(Model model) {
		model.addAttribute("allGarant", gp.findAllGarant());
		return "_locataire";
	}
	
	@Autowired
	SocieteRepos rep;
	@RequestMapping(value="/consult_bien")
	public String consult_bien(Model model) {
		List<Societe> listprop = rep.findProp();
		model.addAttribute("proplist", listprop);
		return "consult_bien";
	}

	/**
	 *  la method pour ajouter une location
	 * @return
	 */
	@RequestMapping(value="/ajout_location")
	public String ajouter_location() {
		return "ajouter_location";
	}
	/**
	 *  la method pour archiver tous doc
	 * @return
	 */
	@RequestMapping(value="/archivage")
	public String archiver() {
		return "archive";
	}
	
	/**
	 *  la method qui permet de spécifier les droits users
	 * @return
	 */
	@RequestMapping(value="/403")
	public String confirm() {
		return "403";
	}
	
	@RequestMapping(value="/pdf")
	public String generer() {
		return "pdf";
	}
	
	/**
	 * Add @proprietaire
	 */
	
	
	
	 /* ProprietaireRepos pr;
	  
	  @RequestMapping(value="/_bien", method = RequestMethod.POST) 
	  public void addProprietaire(Model model, Societe prop) {
		  pr.save(prop);
	  
	  }
	 @Autowired
	BienRepository bpr;
	@RequestMapping(value="/modal", method = RequestMethod.POST)
	public String addProprietaire(Model model, Bien b) {
		bpr.save(b);
	   return"modal";
	}
	*/
	
}
