package com.crud.demo.product.feign.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crud.demo.product.dao.ProductDao;
import com.crud.demo.product.dao.ProductsDao;
import com.crud.demo.product.feign.client.ProductIF;

@Component
public class ProductFacade {

	@Autowired
	private ProductIF productIF;

	public ProductsDao getProduct() {
		return productIF.getProduct();
	}
}
