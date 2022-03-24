package com.company.core.entity;

import java.time.Duration;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table
@Data

public class Dvd extends Item{
	
	@NotNull
	private String title;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	@NotNull
	private String director;
	
	@NotNull
	private Duration duration;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Type type;
	
	
}
