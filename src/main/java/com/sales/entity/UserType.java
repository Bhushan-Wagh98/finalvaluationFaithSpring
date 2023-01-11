package com.sales.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblUserType")
public class UserType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ut_id;

	// Admin, Sales Coordinator
	private String ut_name;

	// overloaded constructor
	public UserType(String ut_name) {
		this.ut_name = ut_name;
	}

	public UserType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUt_id() {
		return ut_id;
	}

	public void setUt_id(Integer ut_id) {
		this.ut_id = ut_id;
	}

	public String getUt_name() {
		return ut_name;
	}

	public void setUt_name(String ut_name) {
		this.ut_name = ut_name;
	}

}
