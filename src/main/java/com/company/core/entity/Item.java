package com.company.core.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.company.core.controller.views.ItemsViews;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(ItemsViews.Detail.class)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@JsonView(ItemsViews.Detail.class)
	private Date integration;
	
	
	
	
	
}
