package ma.isga.gesimmob.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.isga.gesimmob.entities.Societe;
import ma.isga.gesimmob.repositories.SocieteRepos;

@Service
public class SocieteService {
	
	@Autowired
	 SocieteRepos pr;
	
	
	
	  public Societe findByIdent(String ind) { 
		  Societe ste = pr.findByidentSociete(ind); 
		  if(ste== null) throw new RuntimeException("Cette societe n'existe pas! Ajoutez une societe"); 
		  return ste; 
		  }
	 
	
	
	
	  public Boolean isSocieteExist(String identifiant){
	  
	  Societe ste = pr.findByidentSociete(identifiant);
	  
	  if(ste!=null)
	  
	  return true;
	  
	  return false;
	  
	  }
	 
	
	public void addSociete(Societe ste) {
		pr.save(ste);
	}
	
	
}
