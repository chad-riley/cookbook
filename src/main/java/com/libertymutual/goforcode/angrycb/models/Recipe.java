package com.libertymutual.goforcode.angrycb.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.aspectj.apache.bcel.generic.Instruction;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

@Entity

public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_id_seq")
	@SequenceGenerator(name = "recipe_id_seq", sequenceName="recipe_id_seq")
	private Long id;

	@Column(nullable = false, length = 75)
	private String title;

	@Column(nullable = true, length = 255)
	private String description;

	@Column(nullable = true)
	private double numberOfMinutes;
	
	@OneToMany(mappedBy= "recipe")
	@Column(nullable = true)
	private List<Ingredients> ingredients;
	
	@OneToMany(mappedBy= "recipe")
	@Column(nullable = true, length = 255)
	private List<Instructions> instructions;

//	@OneToMany(mappedBy= "recipe")
//	private List<Ingredients> ingredients;
//	private List<Instructions> instructions;

	public Recipe() {
	}

	public Recipe(String title, String description, double numberOfMinutes, List<Ingredients> ingredients, List<Instructions> instructions) {
		this.title = title;
		this.description = description;
		this.numberOfMinutes = numberOfMinutes;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getdescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public double numberOfMinutes() {
		return numberOfMinutes;
	}

	public void setNumberOfMinutes(double numberOfMinutes) {
		this.numberOfMinutes = numberOfMinutes;
	}
	
	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}
	
	public List<Instructions> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instructions> instructions) {
		this.instructions = instructions;
	}

	public void addIngredients(Ingredients ingredient) {
		// TODO Auto-generated method stub
		
	}

	public void addInstructions(Instructions instruction) {
		// TODO Auto-generated method stub
		
	}
}
























