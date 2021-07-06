package com.mobigesture.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobigesture.products.model.ProductEntity;


public interface ProductRepository  extends JpaRepository<ProductEntity, Long>{

}
