package com.sales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tblLogin")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer l_id;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private Integer ut_id;

	@ManyToOne
	@JoinColumn(name = "ut_id", insertable = false, updatable = false)
	@JsonIgnore
	private UserType userType;

	@OneToOne(mappedBy = "login")
	@JsonIgnore
	private Employee employee;

	// overloaded constructor
	public Login(String username, String password, Integer ut_id) {
		this.username = username;
		this.password = password;
		this.ut_id = ut_id;
	}

	public Login(Integer l_id, String username, String password, Integer ut_id, UserType userType, Employee employee) {
		super();
		this.l_id = l_id;
		this.username = username;
		this.password = password;
		this.ut_id = ut_id;
		this.userType = userType;
		this.employee = employee;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getL_id() {
		return l_id;
	}

	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUt_id() {
		return ut_id;
	}

	public void setUt_id(Integer ut_id) {
		this.ut_id = ut_id;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
