package com.company.core.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.company.core.controller.views.ItemsViews;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;




@Entity
@Table

public class Book extends Item{

	@NotNull	
	private String title;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "yyyy-MM-dd")
	@NotNull	
	private LocalDate releaseDate;
	
	@JsonView(ItemsViews.Detail.class)
	@NotNull
	private String author;
	
	@JsonView(ItemsViews.Detail.class)
	@NotNull
	private String nbIsbn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	
	
	
	
}
