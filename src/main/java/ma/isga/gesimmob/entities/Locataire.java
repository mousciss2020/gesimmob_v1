package ma.isga.gesimmob.entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Locataire {
	/**
	 * Les informations personnelles
	 */
	@Id
	String identLocataire;

	//String Type_Locataire;
	/* String Civilite; */
	String Prenom;
	String Nom;

	@JoinColumn(name = "identGarant")
	String identGarant;

	/*
	 * Date Date_Naissance; String Lieu_Naissance; String photo;
	 */
	/**
	 * Information de contact
	 */
	String Email;
	String Telephone;
	String Adresse;
	String Ville;
	String Pays;
	/*
	 * String Documents; // Assurance
	 * 
	 * @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "locataire") Collection<Location> MesLocations;
	 */

	/**
	 * @Construteurs
	 */

	public Locataire() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Locataire(String identLocataire, String prenom, String nom, String identGarant,
			String email, String telephone, String adresse, String ville, String pays) {
		super();
		this.identLocataire = identLocataire;
		//Type_Locataire = type_Locataire;
		Prenom = prenom;
		Nom = nom;
		this.identGarant = identGarant;
		Email = email;
		Telephone = telephone;
		Adresse = adresse;
		Ville = ville;
		Pays = pays;
	}






	public String getIdentLocataire() {
		return identLocataire;
	}


	public void setIdentLocataire(String identLocataire) {
		this.identLocataire = identLocataire;
	}


	

	public String getIdentGarant() {
		return identGarant;
	}


	public void setIdentGarant(String identGarant) {
		this.identGarant = identGarant;
	}


	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}


	/*
	 * public Long getIdGarant() { return idGarant; }
	 * 
	 * 
	 * public void setIdGarant(Long idGarant) { this.idGarant = idGarant; }
	 */

	public String getPays() {
		return Pays;
	}


	public void setPays(String pays) {
		Pays = pays;
	}
	

	/*
	 * public Collection<Location> getMesLocations() { return MesLocations; }
	 * 
	 * public void setMesLocations(Collection<Location> mesLocations) { MesLocations
	 * = mesLocations; }
	 */
}
