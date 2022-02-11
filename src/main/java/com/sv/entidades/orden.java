package com.sv.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name="order", catalog="productos", schema="")

public class orden {
	
	@Id
	@Column
	private Integer idorder;
	@Column
	private String user; 
	@Column
	private String state; 
	
	@Column
	private Integer idproduct;
	@Column
	private Integer qty;
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getIdorder() {
		return idorder;
	}
	public void setIdorder(Integer idorder) {
		this.idorder = idorder;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(Integer idproduct) {
		this.idproduct = idproduct;
	}
	

}
