package ma.isga.gesimmob.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idLocation;
	/**
	 * Bien Loué
	 */
	
	String TypeBient;
	@OneToOne
	@JoinColumn(name = "IdBien")
	Bien bien;
	/**
	 * Détails de la Location
	 */
	
	/*
	 * String Type_Bail; Date DebutBail; Date FinBail; Date DatePayement; String
	 * TypePayement;
	 */
	/**
	 * Loyer
	 */
	/*
	 * String Loyer; // loyer hors charges String Charge; int TVA;
	 */
	Double Prix_Bien; // loyer avec les charges
	
	String Adresse;
	String Ville;
	String Code_Postal;
	String Pays;
	String Montant;
	String cotion;
	String duree;
	
	String etatBien;
	
	/**
	 * Les informations sur la quittance
	 */
	/*
	 * String Type_quittance; String Quitances; // Texte pour la quittance
	 */	
	/**
	 * Les informations sur le contrat de bail
	 */
	/*
	 * String Bail;//Description de contrat de bail
	 */
	/*
	 * @DateTimeFormat(pattern="yyyy-MM-dd") Date dateD; // date de quittance
	 */	 
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 Date dateF; // date de quittance
	 
	/**
	 * locataire de bien
	 */
	@ManyToOne
	@JoinColumn(name = "identLocataire")
	Locataire locataire;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String TypeBient, Double Prix_Bien) {
		super();
		this.TypeBient = TypeBient;
		this.Prix_Bien = Prix_Bien;
		
	}
	


	public Location(String typeBient, Double prix_Bien, String adresse, String ville, String code_Postal, String pays,
			String montant, String cotion,String duree,String etatBien, Date dateF) {
		super();
		TypeBient = typeBient;
		Prix_Bien = prix_Bien;
		Adresse = adresse;
		Ville = ville;
		Code_Postal = code_Postal;
		Pays = pays;
		Montant = montant;
		this.cotion = cotion;
		this.duree= duree;
		this.etatBien=etatBien;
		
		this.dateF = dateF;
	}
	
	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree= duree;
	}


	public Long getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(Long idLocation) {
		this.idLocation = idLocation;
	}

	public String getTypeBient() {
		return TypeBient;
	}

	public void setTypeBient(String typeBient) {
		TypeBient = typeBient;
	}

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}

	public Double getPrix_Bien() {
		return Prix_Bien;
	}

	public void setPrix_Bien(Double prix_Bien) {
		Prix_Bien = prix_Bien;
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

	public String getCode_Postal() {
		return Code_Postal;
	}

	public void setCode_Postal(String code_Postal) {
		Code_Postal = code_Postal;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public String getMontant() {
		return Montant;
	}

	public void setMontant(String montant) {
		Montant = montant;
	}

	public String getCotion() {
		return cotion;
	}

	public void setCotion(String cotion) {
		this.cotion = cotion;
	}

	
	public Date getDateF() {
		return dateF;
	}

	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}

	public Locataire getLocataire() {
		return locataire;
	}

	public void setLocataire(Locataire locataire) {
		this.locataire = locataire;
	}

	public String getEtatBien() {
		return etatBien;
	}

	public void setEtatBien(String etatBien) {
		this.etatBien = etatBien;
	}

	
	
	
}
