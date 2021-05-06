package com.germanleal.store.shopping.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
	private Long id;
	private String name;
	private String description;
	private Double stock;
	private Double price;
	private String status;
	private Date createAt;
	private Category category;
}
