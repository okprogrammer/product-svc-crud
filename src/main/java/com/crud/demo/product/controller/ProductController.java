package com.crud.demo.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.product.dao.ProductsDao;
import com.crud.demo.product.service.ProductServiceIF;

@RestController
@RequestMapping("prodcut-svc")
public class ProductController {

	@Autowired
	private ProductServiceIF productServiceIF;
	@GetMapping("/get-product")
	ResponseEntity<ProductsDao> getProdct() {
		ProductsDao product = productServiceIF.getProduct();
		return ResponseEntity.ok(product);
	}
}
