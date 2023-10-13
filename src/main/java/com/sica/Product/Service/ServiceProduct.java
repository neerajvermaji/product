package com.sica.Product.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sica.Product.Entity.EntityProduct;
import com.sica.Product.Entity.RepositoryProduct;

@Service
public class ServiceProduct {
	
	private static final Logger logger =  LoggerFactory.getLogger(ServiceProduct.class);
	
	@Autowired
	RepositoryProduct repository;

	public String addProduct(EntityProduct entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		return "Record has been added successfully" ;
	}

	public List<EntityProduct> getProductDetail() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<EntityProduct> getProductById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public List<EntityProduct> getProductByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	public List<EntityProduct> getProductByPriceAndQuantity(int price, int quantity) {
		// TODO Auto-generated method stub
		return repository.findByPriceAndQuantity(price, quantity);
	}

	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
		message="Record has been deleted successfully";
		repository.deleteById(id);
		logger.info(message);
	}catch(Exception e) {
		message="Invalid id";
		logger.error(message);
	}return message;
}
	

	public String updateProduct(EntityProduct entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		return "Record has been updated successfully";
	}

	

}
