package com.karpeg.apicarros.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Cars")
public class CarsEntity {

	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "FACTORY_ID")
	private FactoriesEntity factory;
	
	@Column(name = "MODEL")
	private String model;
	
	@Column(name = "YEAR")
	private Integer year;
	
	@Column(name = "FUEL")
	private String fuel;
	
	@Column(name = "DOORS")
	private Integer doors;
	
	@Column(name = "COST")
	private Double cost;
	
	@Column(name = "COLOR")
	private String color;
	
}
