package com.company.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table

public class Book extends Item{

	@NotNull	
	private String title;
	
	@NotNull	
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	@NotNull
	private String author;
	
	@NotNull
	private String nbIsbn;

	

	
	
	
	
}
