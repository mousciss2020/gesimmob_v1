package ma.isga.gesimmob.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Societe{
	
	  @Id
	  @NotNull
	  String identSociete;
	 
	String Nom_societe;
	// Document
	String Patente;
	String Nom_Responsable;
	String CIN;
	String Activite;
	String Statut;
	/**
	 * @adresse de la société
	 */
	String Adresse ;
	String Telephone;
	// contrat signé
	String contrat;
	// registre de commerce
	String Registre;
	
	/*
	 * @OneToMany(fetch = FetchType.LAZY,mappedBy = "societe", cascade =
	 * CascadeType.ALL, orphanRemoval = true) Collection<Bien> MesBien;
	 */
	
	/**
	 * Les constructeurs
	 */
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	

 

	public Societe(String identSociete, String nom_societe, String patente, String nom_Responsable, String cIN,
			String activite, String statut, String adresse, String telephone, String contrat, String registre) {
		super();
		this.identSociete = identSociete;
		Nom_societe = nom_societe;
		Patente = patente;
		Nom_Responsable = nom_Responsable;
		CIN = cIN;
		Activite = activite;
		Statut = statut;
		Adresse = adresse;
		Telephone = telephone;
		this.contrat = contrat;
		Registre = registre;
	}


	

	public String getIdentSociete() {
		return identSociete;
	}




	public void setIdentSociete(String identSociete) {
		this.identSociete = identSociete;
	}




	public String getNom_societe() {
		return Nom_societe;
	}

	public void setNom_societe(String nom_societe) {
		Nom_societe = nom_societe;
	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public String getNom_Responsable() {
		return Nom_Responsable;
	}

	public void setNom_Responsable(String nom_Responsable) {
		Nom_Responsable = nom_Responsable;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getActivite() {
		return Activite;
	}

	public void setActivite(String activite) {
		Activite = activite;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		Statut = statut;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getContrat() {
		return contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	public String getRegistre() {
		return Registre;
	}

	public void setRegistre(String registre) {
		Registre = registre;
	}

	
	/*
	 * public Collection<Bien> getMesBien() { return MesBien;
	 * 
	 * }
	 * 
	 * public void setMesBien(Collection<Bien> mesBien) { MesBien = mesBien;
	 * 
	 * }
	 */
	

}
