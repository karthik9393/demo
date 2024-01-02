package com.codewithkarthik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithkarthik.entity.Product;
import com.codewithkarthik.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping("/getall")
	public List<Product> getProduct() {

		return service.getAll();

	}

	@PostMapping("/add")
	public Product saveProduct(@RequestBody Product prod) {
		return service.savaProduct(prod);
	}

	@DeleteMapping("/delete/{id}")
	public void deletebyId(@PathVariable Long id) {
		service.deleteProductbyId(id);
	}
	
	@PutMapping("/update")
	public Product updateprod(@RequestBody Product prod) {
		return service.upateproduct(prod);
	}
	
	@GetMapping("/get/{id}")
	public Product getProductbyId(Long id) {
		return service.getProductbyId(id);
	}

}
