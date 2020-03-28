package ma.isga.gesimmob.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import ma.isga.gesimmob.entities.Societe;

public interface SocieteRepos extends JpaRepository<Societe, Long> {
	
	@Query("SELECT p FROM Societe p ORDER BY p.identSociete DESC ")
	public List<Societe> findProp();

	public Societe findByidentSociete(String identifiant);

	//public Societe findByIdent(String identSociete);
	
	
	
	
}
