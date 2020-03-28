package ma.isga.gesimmob.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.isga.gesimmob.entities.Garant;

public interface GarantRepository extends JpaRepository<Garant, Long> {

	Garant findByIdentGarant(String identGarant);
	
	@Query("SELECT g FROM Garant g ORDER BY g.identGarant DESC ")
	List<Garant> findAllGarant();

}
