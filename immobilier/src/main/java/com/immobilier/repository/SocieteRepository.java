package com.immobilier.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.immobilier.entities.Societe;

public interface SocieteRepository extends JpaRepository<Societe, Long> {
	
	/*
	 * @Query("SELECT p FROM Societe p ORDER BY p.identSociete DESC ") public
	 * List<Societe> findProp();
	 * 
	 * public Societe findByidentSociete(String identifiant);
	 * 
	 * public Societe findByIdent(String identSociete);
	 */
	 public Societe findByIdentifiant(String identifiant);
	 public Societe findByEmail(String email);
		
	
	
	
	
}
