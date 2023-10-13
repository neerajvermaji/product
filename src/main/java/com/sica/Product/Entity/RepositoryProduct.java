package com.sica.Product.Entity;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.web.bind.annotation.RequestParam;

//import com.sica.customer.Entity.EntityCustomer;

public interface RepositoryProduct extends JpaRepository<EntityProduct, Integer> {

	public List<EntityProduct> findByName(String name);
	public List<EntityProduct> findByPriceAndQuantity(int price,int quantity);
	

}
