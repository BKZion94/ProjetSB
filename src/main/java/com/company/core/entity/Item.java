package com.company.core.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "yyyy-MM-dd")
	private LocalDate integration;
	
	
	
	
	
}
