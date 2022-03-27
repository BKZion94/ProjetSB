package com.company.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.company.core.controller.views.ItemsViews;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@Entity
@Table

public class Book extends Item{

	@NotNull	
	private String title;
	
	@JsonView(ItemsViews.Detail.class)
	@NotNull	
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	@JsonView(ItemsViews.Detail.class)
	@NotNull
	private String author;
	
	@JsonView(ItemsViews.Detail.class)
	@NotNull
	private String nbIsbn;

	

	
	
	
	
}
