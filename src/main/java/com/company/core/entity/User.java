package com.company.core.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Email
	private String login;
	
	@NotNull
	private String password;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String firstName;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= {CascadeType.REMOVE}, orphanRemoval=true, mappedBy = "borrower")
	@JsonIgnore
	private List<Borrow> borrowedItems = new ArrayList<>();
	
}

