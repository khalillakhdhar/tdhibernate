package com.hb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Activite extends Audit {
	@Column(nullable = false,columnDefinition = ("varchar(20) default 'loisir'"))
	private String type;
	@Column(nullable = false)
	private String description;

}
