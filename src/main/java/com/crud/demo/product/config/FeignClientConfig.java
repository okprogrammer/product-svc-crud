package com.crud.demo.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.crud.demo.product.feign.client.ProductIF;

import feign.Feign;
import feign.Logger.Level;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;;

@Configuration
public class FeignClientConfig {

	@Bean(name = "productIF")
	public ProductIF productIF() {
		return Feign.builder().encoder(new JacksonEncoder()).decoder(new JacksonDecoder()).errorDecoder(null)
				.logger(new Slf4jLogger()).logLevel(Level.FULL).target(ProductIF.class, "https://dummyjson.com");
	}

	@Bean(name = "restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
