package com.mobigesture.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")

public class ProductEntity {
	 @Id
	 @Column(name="product_id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long productId;
	 @Column(name="product_name")
	 private String productName;
	 @Column(name="product_price")
	 private double productPrice;
	 @Column(name="product_offer_price")
	 private double productOfferPrice;
	 @Column(name="product_img_path_one")
	 private String  productImgPathOne;
	 @Column(name="product_img_path_two")
	 private String productImgPathTwo;
	 @Column(name="product_img_path_three")
	 private String productImgPathThree;
	 @Column(name="product_desc")
	 private String productDesc;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductOfferPrice() {
		return productOfferPrice;
	}
	public void setProductOfferPrice(double productOfferPrice) {
		this.productOfferPrice = productOfferPrice;
	}
	public String getProductImgPathOne() {
		return productImgPathOne;
	}
	public void setProductImgPathOne(String productImgPathOne) {
		this.productImgPathOne = productImgPathOne;
	}
	public String getProductImgPathTwo() {
		return productImgPathTwo;
	}
	public void setProductImgPathTwo(String productImgPathTwo) {
		this.productImgPathTwo = productImgPathTwo;
	}
	public String getProductImgPathThree() {
		return productImgPathThree;
	}
	public void setProductImgPathThree(String productImgPathThree) {
		this.productImgPathThree = productImgPathThree;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productOfferPrice=" + productOfferPrice + ", productImgPathOne=" + productImgPathOne
				+ ", productImgPathTwo=" + productImgPathTwo + ", productImgPathThree=" + productImgPathThree
				+ ", productDesc=" + productDesc + ", getProductId()=" + getProductId() + ", getProductName()="
				+ getProductName() + ", getProductPrice()=" + getProductPrice() + ", getProductOfferPrice()="
				+ getProductOfferPrice() + ", getProductImgPathOne()=" + getProductImgPathOne()
				+ ", getProductImgPathTwo()=" + getProductImgPathTwo() + ", getProductImgPathThree()="
				+ getProductImgPathThree() + ", getProductDesc()=" + getProductDesc() + "]";
	}
	 
	 
	 

		 
	 
}
