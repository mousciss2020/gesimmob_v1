package ma.isga.gesimmob.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.isga.gesimmob.entities.Garant;
import ma.isga.gesimmob.repositories.GarantRepository;


@Service
public class GarantService {
	
	@Autowired
	GarantRepository gp;
	
	public void addGarant(Garant garant) {
		gp.save(garant);
	}
	
	public Garant findByidentGarant(String identGarant) {
		Garant g = gp.findByIdentGarant(identGarant);
		return g;
	}
	
	
	
}
