package com.mobigesture.products.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobigesture.products.exception.RecordNotFoundException;
import com.mobigesture.products.model.ProductEntity;
import com.mobigesture.products.service.ProductService;


  
@RestController
@RequestMapping("/products")
public class ProductController
{
    @Autowired
    ProductService service;
 
    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllCategries() {
        List<ProductEntity> list = service.getAllProducts();
 
        return new ResponseEntity<List<ProductEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{product_id}")
    public ResponseEntity<ProductEntity> getEmployeeById(@PathVariable("product_id") Long product_id)
                                                    throws RecordNotFoundException {
        ProductEntity entity = service.getProdutById(product_id);
 
        return new ResponseEntity<ProductEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @PostMapping
    public ResponseEntity<ProductEntity> createOrUpdateCategory(@RequestBody ProductEntity product)
                                                    throws RecordNotFoundException {
    	
    	ProductEntity updated = service.createOrUpdateProduct(product);
        return new ResponseEntity<ProductEntity>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{product_id}")
    public HttpStatus deleteCategoryById(@PathVariable("product_id") Long product_id)
                                                    throws RecordNotFoundException {
        service.deleteProdutById(product_id);
        return HttpStatus.FORBIDDEN;
    }
 
}