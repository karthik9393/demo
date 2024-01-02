package com.codewithkarthik.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue
	private Long productId;
	private String name;
	private String description;
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	

}
