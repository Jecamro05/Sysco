package com.sv.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name="product", catalog="productos", schema="")

public class productos {
	
	@Id
	@Column
	private Integer idproduct;
	@Column
	private Integer price; 
	@Column
	private String name; 
	@Column
	private String image;
	public Integer getId() {
		return idproduct;
	}
	public void setId(Integer idproduct) {
		this.idproduct = idproduct;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
