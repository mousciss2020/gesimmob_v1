package com.immobilier.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Societe {

	@Id
	@Email
	@NotEmpty
	@Column(unique = true)
	private String email;
	//@Size(min = 4)
	private String password;
	private String nom;
	private String prenom;
	/**
     * @information de la societe
	 */
	@NotEmpty
	private String nomSociete;
	@NotEmpty
	@Column(unique = true)
	private String identifiant;
	
	private String activites;
	
	private String status;

	private String patente;
	
	/*
	 * private String contrat; // contrat scané
	 * 
	 * private String registre;// registre commercial
	 */	/**
     * @adresse de la societe
	 */

	
	private String pays;

	private String ville;

	private String adresse;

	private String telephone;
	
	

	/*
	 * public Societe(String email, @Size String password, String nomSociete, String
	 * identifiant, String activites, String status, String patente, String contrat,
	 * String registre, String pays, String ville, String adresse, String telephone)
	 * { super(); this.email = email; this.password = password; this.nomSociete =
	 * nomSociete; this.identifiant = identifiant; this.activites = activites;
	 * this.status = status; this.patente = patente; this.contrat = contrat;
	 * this.registre = registre; this.pays = pays; this.ville = ville; this.adresse
	 * = adresse; this.telephone = telephone; }
	 */

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLES", joinColumns={
			@JoinColumn(name = "USER_EMAIL", referencedColumnName = "email") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name") })
	private List<Role> roles;

	/*
	 * @OneToMany(fetch = FetchType.EAGER,mappedBy = "societe", cascade =
	 * CascadeType.ALL, orphanRemoval = true) private Collection<Bien> mesbiens =
	 * new ArrayList<>();
	 */


}
