package com.codewithkarthik.dbrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codewithkarthik.dao.ProductRepository;
import com.codewithkarthik.entity.Product;
@Component
public class ProductRunner implements CommandLineRunner{
	@Autowired
	ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Product("Iphone", "From apple.com"));
		repo.save(new Product("prodB", "from third party web"));
		repo.save(new Product("prodc", "from third party web2"));
		repo.save(new Product("prodD", "from third party web3"));
	}

}
