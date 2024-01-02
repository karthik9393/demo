package com.codewithkarthik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithkarthik.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
