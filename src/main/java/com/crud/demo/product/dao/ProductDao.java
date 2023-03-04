package com.crud.demo.product.dao;

import java.util.List;

import com.crud.demo.product.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
"id": 1,
"title": "iPhone 9",
"description": "An apple mobile which is nothing like apple",
"price": 549,
"discountPercentage": 12.96,
"rating": 4.69,
"stock": 94,
"brand": "Apple",
"category": "smartphones",
"thumbnail": "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
"images": */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDao {
	/** The id. */
	private int id;

	/** The title. */
	private String title;

	/** The description. */
	private String description;

	/** The price. */
	private double price;

	/** The discount percentage. */
	private double discountPercentage;

	/** The rating. */
	private double rating;

	/** The stock. */
	private double stock;

	/** The brand. */
	private String brand;

	/** The category. */
	private String category;

	/** The thumnail. */
	private String thumbnail;

	/** The images. */
	private List<String> images;
}
