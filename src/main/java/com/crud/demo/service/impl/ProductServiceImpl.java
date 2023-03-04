package com.crud.demo.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crud.demo.dao.ProductDao;
import com.crud.demo.dao.ProductsDao;
import com.crud.demo.feign.facade.ProductFacade;
import com.crud.demo.service.ProductServiceIF;

@Service
public class ProductServiceImpl implements ProductServiceIF {

//	@Autowired
//	private RestTemplate restTemplate;

	@Autowired
	private ProductFacade productFacade;

	@Override
	public ProductsDao getProduct() {
		ProductsDao product = productFacade.getProduct();
		return product;
	}

}
