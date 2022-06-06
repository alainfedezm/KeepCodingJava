package com.tacos.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Taco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=5, message = "El nombre debe tener al menos 5 caracteres")
	private String name;
	@ManyToMany(targetEntity = Ingredient.class)
	private List<Ingredient> ingredients;
	
	private Date createdAt;
	
	@PrePersist
	void createdAt() {createdAt = new Date();}

}
