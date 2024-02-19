package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.Entity.Product;

public interface productRepo extends JpaRepository<Product, Integer> {

}
