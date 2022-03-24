package com.company.core.entity;

import java.time.Duration;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
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
	private Duration duration;
	
	@NotNull
	private int nbTitle;
	
	
}
