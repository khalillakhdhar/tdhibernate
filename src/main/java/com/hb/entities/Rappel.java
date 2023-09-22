package com.hb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
@Entity
public class Rappel extends Audit {
	@Column(nullable = false)
	private String titre,date,type;
	@Column(nullable = true)
	private String description;
	

}
