package com.codewithkarthik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithkarthik.dao.ProductRepository;
import com.codewithkarthik.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> getAll(){
		
		List<Product> products = repo.findAll();
		return products;
		
	}
	
	public Product savaProduct(Product prod) {
		Product save = repo.save(prod);
		return save;
		
	}
	
	
	public void deleteProductbyId(Long id) {
		
		repo.deleteById(id);
	}

	public Product upateproduct(Product prod) {
		Optional<Product> productbyId = repo.findById(prod.getProductId());
		if(productbyId.isPresent()) {
			Product existingOne = productbyId.get();
			existingOne.setName(prod.getName());
			existingOne.setDescription(prod.getDescription());
			repo.save(existingOne);
		}
		return prod;
	}

	public Product getProductbyId(Long id) {
		
		return repo.findById(id).get();
	}
	
	
	
	

}
