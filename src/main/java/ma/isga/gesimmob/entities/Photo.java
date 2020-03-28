package ma.isga.gesimmob.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPhoto;
	private String url;
	private String identBien;
	//private Integer IdBien;
	
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Photo(String url, String identBien) {
		super();
		//this.idPhoto = idPhoto;
		this.url = url;
		this.identBien = identBien;
	}


	public String getIdentBien() {
		return identBien;
	}


	public void setIdentBien(String identBien) {
		this.identBien = identBien;
	}


	public Long getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(Long idPhoto) {
		this.idPhoto = idPhoto;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	/*
	 * public Integer getIdBien() { return IdBien; }
	 * 
	 * 
	 * public void setIdBien(Integer idBien) { IdBien = idBien; }
	 */
	
	
	
	

}
