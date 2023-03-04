package com.crud.demo.feign.client;

import java.util.List;

import com.crud.demo.dao.ProductDao;
import com.crud.demo.dao.ProductsDao;

import feign.Headers;
import feign.RequestLine;

public interface ProductIF {

	@RequestLine("GET /products")
	@Headers("Content-Type: application/json")
	ProductsDao getProduct();

}
