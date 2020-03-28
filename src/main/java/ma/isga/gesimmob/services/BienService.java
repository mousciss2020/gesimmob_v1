package ma.isga.gesimmob.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.isga.gesimmob.entities.Bien;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.SocieteRepos;


@Service
public class BienService {
	
	
	@Autowired
	BienRepository br;
	@Autowired
	SocieteRepos pr;
	  
	
	
	  public Bien findByIdSociete(String ident) { 
		  Bien bn = br.findByIdentSociete(ident); 
		  if(bn==null) throw new RuntimeException("Cette societe n'existe pas! Ajoutez une societe!"); 
		  return bn; 
		  }
	 
	
	/*
	 * public Boolean isSocieteExist(String identSociete){
	 * 
	 * //Societe ste = pr.findByidentSociete(identSociete); Bien bien =
	 * br.findByIdentSociete(identSociete);
	 * 
	 * if(bien!=null) return true; return false;
	 * 
	 * }
	 */
	 
	
	public List<Bien> findByEtatBien(String etatBien){
		List<Bien>  b = br.findByEtatBien(etatBien);
		return b;
	}
	
	public List<Bien> allBien(){
		
		 List<Bien> biens =br.findAll();
		 
		 return biens;
		
	}
	
	
}
