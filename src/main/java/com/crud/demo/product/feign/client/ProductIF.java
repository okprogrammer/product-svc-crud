package com.crud.demo.product.feign.client;

import java.util.List;

import com.crud.demo.product.dao.ProductDao;
import com.crud.demo.product.dao.ProductsDao;

import feign.Headers;
import feign.RequestLine;

public interface ProductIF {

	@RequestLine("GET /products")
	@Headers("Content-Type: application/json")
	ProductsDao getProduct();

}
