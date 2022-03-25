package com.company.core.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Data
@Entity
@Table

public class Borrow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private LocalDateTime startDate;
	
	@NotNull
	private LocalDateTime endDate;
	
	
	@ManyToOne
	@JoinColumn(name="USERS_ID")
	private User borrower;
	
	
	@OneToMany (mappedBy="borrow")
	private List<Copie> copie =new ArrayList<>();
	
}
