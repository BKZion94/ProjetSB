package com.company.core.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date endDate;
	
	
	@ManyToOne
	@JoinColumn(name="USERS_ID")
	private User borrower;
	
	
	@OneToMany 
	private List<Copie> copie =new ArrayList<>();
	
}
