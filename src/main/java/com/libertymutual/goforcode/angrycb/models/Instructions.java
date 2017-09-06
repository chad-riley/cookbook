package com.libertymutual.goforcode.angrycb.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ing_id")
@Entity

public class Instructions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ins_id;

	@Column(nullable = false, length = 1000)
	private String instructions;

	public Instructions() {
	}

	public Instructions(String instructions) {
		this.instructions = instructions;
	}

	// getters and setters

	public Long getId() {
		return ins_id;
	}

	public void setId(Long id) {
		this.ins_id = ins_id;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;

	}
}