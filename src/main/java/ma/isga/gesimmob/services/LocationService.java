package ma.isga.gesimmob.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.isga.gesimmob.entities.Bien;
import ma.isga.gesimmob.entities.Locataire;
import ma.isga.gesimmob.entities.Location;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.LocataireRepos;
import ma.isga.gesimmob.repositories.LocationRepos;


@Service
public class LocationService {
	
	@Autowired 
	LocationRepos lt;
	
	@Autowired
	BienRepository br;
	
	@Autowired
	LocataireRepos lr;
	
	public Boolean isExistBien(Integer IdBien) {
		
		Bien bn = br.findById(IdBien).get();
		
		if(bn!=null)
			
			return true;
		
		return false;
		
	}
	
	public void addLocation( Location locat, Integer IdBien,String identLocataire) {
		
		Locataire lcat = lr.findByIdentLocataire(identLocataire);
		Bien b = br.findById(IdBien).get();
		  b.setEtatBien("Reservation");
		 locat.setBien(b);
		 locat.setLocataire(lcat);
		 lt.save(locat) ;
		 br.save(b);
	}
	
	public void addLocation1( Location locat, Integer IdBien,String identLocataire) {
	 
			
		
		Locataire lcat = lr.findByIdentLocataire(identLocataire);
		Bien b = br.findById(IdBien).get();
		  b.setEtatBien("Loué");
		 locat.setBien(b);
		 locat.setLocataire(lcat);
		 lt.save(locat) ;
		 br.save(b);
	}
	/*
	 * public void deleteLocation(Integer IdBien,String identLocataire) {
	 * 
	 * Bien b = br.findById(IdBien).get(); List<Location> locations = lt.findAll();
	 * Locataire lcat = lr.findByIdentLocataire(identLocataire);
	 * 
	 * for (Location location : locations) {
	 * 
	 * if(location.getBien().equals(b) || location.getLocataire().equals(lcat)) {
	 * location.setBien(b); location.setLocataire(lcat); lt.delete(location); }
	 * 
	 * 
	 * }
	 * 
	 * b.setEtatBien("Neutre");
	 * 
	 * br.save(b); }
	 */
 
	
}
