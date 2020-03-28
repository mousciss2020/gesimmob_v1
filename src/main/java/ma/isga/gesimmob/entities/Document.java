package ma.isga.gesimmob.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idDoc;
	
	String Type;
	
	@JoinColumn(referencedColumnName = "IdBien")
	Long IdBien;
	
	
	
	String Description;
	String url; // url de document

	
    /**
     * Les constructeurs;
     */
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Document(String type, String description, String url, Long idBien) {
		super();
		Type = type;
		Description = description;
		this.url = url;
		IdBien = idBien;
	}




	/**
	 * Les methodes getter and setter
	 */

	public Long getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Long idDoc) {
		this.idDoc = idDoc;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public Long getIdBien() {
		return IdBien;
	}


	public void setIdBien(Long idBien) {
		IdBien = idBien;
	}

	

}
