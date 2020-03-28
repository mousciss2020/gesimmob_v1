package ma.isga.gesimmob.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.isga.gesimmob.entities.Photo;




public interface PhotoRepository extends JpaRepository<Photo, Long> {

	//@Query(value = "SELECT * FROM photo p WHERE p.ident_bien=:idB", nativeQuery = true)
	@Query("from Photo p WHERE p.identBien=:idB")
	public List<Photo> findByIdentbien(@Param("idB") String identBien);
	
}
