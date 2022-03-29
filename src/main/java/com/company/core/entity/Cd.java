package com.company.core.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table

public class Cd extends Item{
	
	@NotNull
	private String title;
	
	@NotNull
	@Temporal(TemporalType.DATE)

	private Date releaseDate;
	
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
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
	
	

