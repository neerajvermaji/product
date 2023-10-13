package com.sica.Product.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sica.Product.Entity.EntityProduct;
import com.sica.Product.Service.ServiceProduct;
//import com.sica.customer.Entity.EntityCustomer;

@RestController
public class ControllerProduct {
	@Autowired
	ServiceProduct service;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody EntityProduct entity) {
		return service.addProduct(entity);
		
	}
	@GetMapping("/getProductDetail")
	public List<EntityProduct>getProductDetail(){
		return service.getProductDetail();
	}
	@GetMapping("/getProductById")
	public Optional<EntityProduct>getProductById(@RequestParam int id){
		return service.getProductById(id);
	}
	@GetMapping("/getProductByName")
	public List<EntityProduct>getProductByName(@RequestParam String name){
		return service.getProductByName(name);
	}
	@GetMapping("/getProductByPriceAndQuantity")
	public List<EntityProduct>getProductByPriceAndQuantity(@RequestParam int price,@RequestParam int quantity){
		return service.getProductByPriceAndQuantity(price,quantity);
	}
	@DeleteMapping("/deleteProductById")
	public String deleteProductById(@RequestParam int id) {
		return service.deleteProductById(id);
	}
	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody EntityProduct entity) {
		return service.updateProduct(entity);
	}
	
}
