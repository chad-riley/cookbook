package com.libertymutual.goforcode.angrycb.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "instructionId")
@Entity

public class Instructions {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructions_id_seq")
	@SequenceGenerator(name = "instructions_id_seq", sequenceName="instructions_id_seq")
	private Long instructionId;

	@Column(nullable = false, length = 255)
	private String step;
	
	
	@ManyToOne
	private Recipe recipe;
	
	public Instructions() {}

	public Instructions(String step) {
		this.step = step;
	}
	
	// getters and setters

//	public Long getId() {
//		return instructionId;
//	}
//
//	public void setId(Long id) {
//		this.instructionId = instructionId;
//	}

	public Long getInstructionId() {
		return instructionId;
	}

	public void setInstructionId(Long instructionId) {
		this.instructionId = instructionId;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

//	public List<Instructions> getInstructions() {
//		return instructions;
//	}
//
//	public void setIngredients(List<Instructions> instructions) {
//		this.instructions = instructions;
//
//}
}
