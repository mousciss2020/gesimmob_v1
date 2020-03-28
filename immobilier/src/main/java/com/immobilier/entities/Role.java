package com.immobilier.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Role {

	@Id
	private String name;
	@ManyToMany(mappedBy = "roles")
	private List<Societe> societes;


}
