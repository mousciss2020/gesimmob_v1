package ma.isga.gesimmob.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.isga.gesimmob.entities.Location;

public interface LocationRepos extends JpaRepository<Location, Long>{

	//void deleteByBien(Bien bn);

	//Locataire findByIdentLocataire(String identLocataire);

	List<Location> findByEtatBien(String etatBien);
}
