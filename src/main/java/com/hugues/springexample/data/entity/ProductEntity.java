package com.hugues.springexample.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRODUCT")
public class ProductEntity {
	@Id
	@Column(name="PROD_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prodId;
	
	@Column(name="NAME")
	private String prodName;
	
	@Column(name="PRICE")
	private long prodPrice;

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public long getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(long prodPrice) {
		this.prodPrice = prodPrice;
	}
	
}
