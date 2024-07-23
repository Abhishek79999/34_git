package com.restapi.enities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

@Data
@Setter
@Getter
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	private Integer quantity;
	private String description;
	private Boolean isstock;
	private String barcode;
	
	@ManyToOne
	@JoinColumn(name="cat_id",nullable=false)
	private Category category;
	
	@OneToMany(mappedBy="Product")
	private Review review;
	
	

}
