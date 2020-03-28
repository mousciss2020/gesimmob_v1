package ma.isga.gesimmob.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "identGarant"))
public class Garant {
	@Id
	@GeneratedValue
	Long idGarant;
	String nomGarant;
	@NotEmpty
	String identGarant;
	String activite;
	String description;
	String document;
	/**
	 * Adresse professionnelle
	 */
	String pays;
	String ville;
	String adresse;
	int codePostal;
	
	public Garant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Garant(String nomGarant, String identGarant, String activite, String description, String document,
			String pays, String ville, String adresse, int codePostal) {
		super();
		this.nomGarant = nomGarant;
		this.identGarant = identGarant;
		this.activite = activite;
		this.description = description;
		this.document = document;
		this.pays = pays;
		this.ville = ville;
		this.adresse = adresse;
		this.codePostal = codePostal;
	}

	public Long getIdGarant() {
		return idGarant;
	}

	public void setIdGarant(Long idGarant) {
		this.idGarant = idGarant;
	}

	public String getNomGarant() {
		return nomGarant;
	}

	public void setNomGarant(String nomGarant) {
		this.nomGarant = nomGarant;
	}

	public String getIdentGarant() {
		return identGarant;
	}

	public void setIdentGarant(String identGarant) {
		this.identGarant = identGarant;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	
	
	
}
