package ma.isga.gesimmob.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotEmpty;




@Entity
//@Table(name = "Bien", uniqueConstraints = @UniqueConstraint(columnNames = "identBien"))
public class Bien{
	
	/**
	 * les info generales du Bien
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer IdBien;
	
	String TypeBient;
	
	@JoinColumn(referencedColumnName = "identSociete")
	
	 String identSociete;
	
	
	  
	  //@Size(min = 4,max = 8)
	  @NotEmpty
	  String identBien;
	 
	

	/**
	 *  Adresse du Bien
	 */
	
	String Adresse;
	String Ville;
	String Code_Postal;
	String Pays;
	@NotEmpty
	String etatBien;
	
	String Nom_societe;
	/**
	 *  Description du Bien
	 */
	/*
	 * String Superficie; String Nombre_Pièces; String Nombre_Chambres; String
	 * Salle_Bain; String Annee_Construction;
	 */
	// choix multiples
	/*
	 * String Etat_Bien ; // Bien meublé String fumeurs; // Fumeurs acceptés ou non
	 * String animaux; // accptés ou pas String acces; // escalié ou ascenseur
	 */	// info finacieres
	Double Prix_Bien;
    Double Charges;
	int Taux_Interet;
	Double Frais_Acquisition;
	// les documents;
	/*
	 * @OneToMany(fetch = FetchType.LAZY,mappedBy ="bien" ,cascade =
	 * CascadeType.ALL, orphanRemoval = true) Collection<Document> MesDocument;
	 */
	
	/**
	 * Les constructeurs;
	 */
	public Bien() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	

	


	public Bien(String typeBient, String identSociete,  String identBien, String adresse, String ville,
			String code_Postal, String pays,  String etatBien, String nom_societe, Double prix_Bien,
			Double charges, int taux_Interet, Double frais_Acquisition) {
		super();
		TypeBient = typeBient;
		this.identSociete = identSociete;
		this.identBien = identBien;
		Adresse = adresse;
		Ville = ville;
		Code_Postal = code_Postal;
		Pays = pays;
		this.etatBien = etatBien;
		Nom_societe = nom_societe;
		Prix_Bien = prix_Bien;
		Charges = charges;
		Taux_Interet = taux_Interet;
		Frais_Acquisition = frais_Acquisition;
	}








	public Integer getIdBien() {
		return IdBien;
	}


	public void setIdBien(Integer idBien) {
		IdBien = idBien;
	}


	public String getTypeBient() {
		return TypeBient;
	}

	public void setTypeBient(String typeBient) {
		this.TypeBient = typeBient;
	}



	public String getIdentSociete() {
		return identSociete;
	}


   

	public String getNom_societe() {
		return Nom_societe;
	}


	public void setNom_societe(String nom_societe) {
		Nom_societe = nom_societe;
	}


	public void setIdentSociete(String identSociete) {
		this.identSociete = identSociete;
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
	
	

	/*
	 * public String getSuperficie() { return Superficie; }
	 * 
	 * public void setSuperficie(String superficie) { Superficie = superficie; }
	 * 
	 * public String getNombre_Pièces() { return Nombre_Pièces; }
	 * 
	 * public void setNombre_Pièces(String nombre_Pièces) { Nombre_Pièces =
	 * nombre_Pièces; }
	 * 
	 * public String getNombre_Chambres() { return Nombre_Chambres; }
	 * 
	 * public void setNombre_Chambres(String nombre_Chambres) { Nombre_Chambres =
	 * nombre_Chambres; }
	 * 
	 * public String getSalle_Bain() { return Salle_Bain; }
	 * 
	 * public void setSalle_Bain(String salle_Bain) { Salle_Bain = salle_Bain; }
	 * 
	 * public String getAnnee_Construction() { return Annee_Construction; }
	 * 
	 * public void setAnnee_Construction(String annee_Construction) {
	 * Annee_Construction = annee_Construction; }
	 * 
	 * public String getEtat_Bien() { return Etat_Bien; }
	 * 
	 * public void setEtat_Bien(String etat_Bien) { Etat_Bien = etat_Bien; }
	 * 
	 * public String getFumeurs() { return fumeurs; }
	 * 
	 * public void setFumeurs(String fumeurs) { this.fumeurs = fumeurs; }
	 * 
	 * public String getAnimaux() { return animaux; }
	 * 
	 * public void setAnimaux(String animaux) { this.animaux = animaux; }
	 * 
	 * public String getAcces() { return acces; }
	 * 
	 * public void setAcces(String acces) { this.acces = acces; }
	 */

	public String getEtatBien() {
		return etatBien;
	}


	public void setEtatBien(String etatBien) {
		this.etatBien = etatBien;
	}


	public Double getPrix_Bien() {
		return Prix_Bien;
	}

	public void setPrix_Bien(Double prix_Bien) {
		Prix_Bien = prix_Bien;
	}

	public Double getCharges() {
		return Charges;
	}

	public void setCharges(Double charges) {
		Charges = charges;
	}

	public int getTaux_Interet() {
		return Taux_Interet;
	}

	public void setTaux_Interet(int taux_Interet) {
		Taux_Interet = taux_Interet;
	}

	public Double getFrais_Acquisition() {
		return Frais_Acquisition;
	}

	public void setFrais_Acquisition(Double frais_Acquisition) {
		Frais_Acquisition = frais_Acquisition;
	}


	  public String getIdentBien() { 
	  return identBien;
		}
	  

	  public void setIdentBien(String identBien) {
	   this.identBien = identBien; 
	   }


	@Override
	public String toString() {
		return "Bien [IdBien=" + IdBien + ", TypeBient=" + TypeBient + ", identSociete=" + identSociete + ", identBien="
				+ identBien + ", Adresse=" + Adresse + ", Ville=" + Ville + ", Code_Postal=" + Code_Postal + ", Pays="
				+ Pays + ", etatBien=" + etatBien + ", Prix_Bien=" + Prix_Bien + ", Charges=" + Charges
				+ ", Taux_Interet=" + Taux_Interet + ", Frais_Acquisition=" + Frais_Acquisition + "]";
	}
	 

	/*
	 * public Collection<Document> getMesDocument() { return MesDocument; }
	 * 
	 * public void setMesDocument(Collection<Document> mesDocument) { MesDocument =
	 * mesDocument; }
	 */
	
	
}
