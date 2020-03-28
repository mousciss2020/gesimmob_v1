package com.immobilier.services;

import com.immobilier.entities.Role;
import com.immobilier.entities.Societe;
import com.immobilier.repository.SocieteRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocieteService {
	/*
	 * @Autowired SocieteRepository societeRepository;
	 * 
	 * @Autowired
	 * 
	 * 
	 * public void addSociete(Societe societe){
	 * 
	 * BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	 * societe.setPassword(encoder.encode(societe.getPassword())); Role societeRole
	 * = new Role(); societeRole.setName("ROLE"); List<Role> roles = new
	 * ArrayList<>(); roles.add(societeRole); societe.setRoles(roles);
	 * societeRepository.save(societe);
	 * 
	 * }
	 * 
	 * public void addAdmin(Societe societe){
	 * 
	 * BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	 * societe.setPassword(encoder.encode(societe.getPassword())); Role societeRole
	 * = new Role(); societeRole.setName("ADMIN"); List<Role> roles = new
	 * ArrayList<>(); roles.add(societeRole); societe.setRoles(roles);
	 * societeRepository.save(societe);
	 * 
	 * }
	 */
    
	@Autowired 
	SocieteRepository societeRepository;
	
	public void addAdmin(Societe societe) {
		
		Role societeRole = new Role(); 
		  societeRole.setName("ADMIN");
		  List<Role> roles = new ArrayList<>();
		  roles.add(societeRole);
		  societe.setRoles(roles);
		  societeRepository.save(societe);
		 
				
	}
	public void addSociete(Societe societe) {
		
		  Role societeRole = new Role(); 
		  societeRole.setName("USER");
		  List<Role> roles = new ArrayList<>();
		  roles.add(societeRole);
		  societe.setRoles(roles);
		  societeRepository.save(societe);
		  	
	}
	
	
	public Societe findByIdent(String identifiant) {
    	
    	Societe ste = societeRepository.findByIdentifiant(identifiant);
    	if(ste==null) throw new RuntimeException("Cette societe n'existe pas! Ajoutez une societe"); 
		return ste; 
    }

    public boolean isExisteSociete(String email){

           Societe ste = societeRepository.findByEmail(email);
           if(ste!=null)
               return true;
           return false;

    }

}
