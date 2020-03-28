package ma.isga.gesimmob.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.isga.gesimmob.entities.Bien;




public interface BienRepository extends JpaRepository<Bien, Integer> {

	  
	//Bien findByidSociete();
	//@Query(value = "SELECT * FROM bien b, societe s WHERE b.id_societe=s.id_societe", nativeQuery = true)
	Bien findByIdentSociete(String identifiant);

	List<Bien> findByEtatBien(String etatBien);

	//Bien findByIdSociete(String identSociete);

	@Query(value = "SELECT * FROM Societe ss, Bien b WHERE ss.ident_Societe = ?1 and b.ident_Societe = ?1", nativeQuery = true)
	List<Bien> allBien(String identSociete);
	
	/*
	 * @Query(value = "SELECT b FROM  Bien b " ) List<Bien> b1();
	 */
	/*
	 * @Modifying(clearAutomatically = true)
	 * 
	 * @Query("Update Bien b set b.TypeBient =:TypeBien,b.identBien =:identBien,b.Adresse =:Adresse,b.Ville =:Ville,b.Code_Postal =:Code_Postal,b.Pays =:Pays,b.etatBien =:etatBien,b.Prix_Bien =:Prix_Bien,b.Charges =:Charges,b.Taux_Interet =:Taux_Interet,b.Frais_Acquisition =:Frais_Acquisition WHERE b.idBien=:idBien"
	 * ) Bien updateBien(@Param("identBien")String identBien,@Param("Adresse")String
	 * Adresse,@Param("Ville")String Ville,@Param("Code_Postal")String
	 * Code_Postal,@Param("Pays")String Pays,@Param("etatBien")String
	 * etatBien,@Param("Prix_Bien")Double Prix_Bien,@Param("Charges")Double
	 * Charges,@Param("Taux_Interet")int
	 * Taux_Interet,@Param("Frais_Acquisition")Double
	 * double1,@Param("idBien")Integer idBien);
	 */
}
