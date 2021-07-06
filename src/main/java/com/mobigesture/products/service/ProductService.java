package com.mobigesture.products.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobigesture.products.exception.RecordNotFoundException;
import com.mobigesture.products.model.ProductEntity;
import com.mobigesture.products.repository.ProductRepository;
 
@Service
public class ProductService {
     
    @Autowired
    ProductRepository repository;
     
    public List<ProductEntity> getAllProducts()
    {
        List<ProductEntity> productsList = repository.findAll();
  
         
        if(productsList.size() > 0) {
            return productsList;
        } else {
            return new ArrayList<ProductEntity>();
        }
    }
     
    public ProductEntity getProdutById(Long id) throws RecordNotFoundException
    {
        Optional<ProductEntity> product = repository.findById(id);
         
        if(product.isPresent()) {
            return product.get();
        } else {
            throw new RecordNotFoundException("No product record exist for given id");
        }
    }
     
    public ProductEntity createOrUpdateProduct(ProductEntity entity) throws RecordNotFoundException
    {
    	
         Optional<ProductEntity> product = repository.findById(entity.getProductId());
		  
		  if(product.isPresent()) { ProductEntity newEntity = product.get();
		  newEntity.setProductName(entity.getProductName());
		  newEntity.setProductPrice(entity.getProductPrice());
		  newEntity.setProductOfferPrice(entity.getProductOfferPrice());
		  newEntity.setProductImgPathOne(entity.getProductImgPathOne());
		  newEntity.setProductImgPathTwo(entity.getProductImgPathTwo());
		  newEntity.setProductImgPathThree(entity.getProductImgPathThree());
		  newEntity.setProductDesc(entity.getProductDesc());
		  newEntity = repository.save(newEntity);
		  
		  return newEntity; } else {
			  entity = repository.save(entity);
		         
		         return entity;
		  }  }
     
    public void deleteProdutById(Long id) throws RecordNotFoundException
    {
        Optional<ProductEntity> produt = repository.findById(id);
         
        if(produt.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No Produt record exist for given id");
        }
    }
}