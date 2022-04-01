package com.company.core.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table

public class Dvd extends Item{
	
	@NotNull
	private String title;
	
	@NotNull

	@JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;
	
	@NotNull
	private String director;
	
	@NotNull
	private int duration;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Type type;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
