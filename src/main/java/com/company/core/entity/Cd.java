package com.company.core.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table

public class Cd extends Item{

	@NotNull
	private String title;

	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;

	@NotNull
	private String artist;

	@NotNull
	private int duration;

	@NotNull
	private int nbTitle;

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

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getNbTitle() {
		return nbTitle;
	}

	public void setNbTitle(int nbTitle) {
		this.nbTitle = nbTitle;
	}

}



