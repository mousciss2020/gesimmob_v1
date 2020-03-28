package ma.isga.gesimmob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.isga.gesimmob.entities.Locataire;

public interface LocataireRepos extends JpaRepository<Locataire, Long> {

	Locataire findByIdentLocataire(String identLocataire);

}
