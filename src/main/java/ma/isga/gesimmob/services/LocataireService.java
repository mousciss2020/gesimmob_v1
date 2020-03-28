package ma.isga.gesimmob.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.isga.gesimmob.entities.Locataire;
import ma.isga.gesimmob.repositories.LocataireRepos;

@Service
public class LocataireService {
	
	@Autowired
	LocataireRepos lr;
	
	public void addLocataire(Locataire lc) {
		lr.save(lc);
	}
	
	
}
