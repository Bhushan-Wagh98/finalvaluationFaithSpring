package com.sales.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblVisit")
public class Visit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visit_id;

	private String cust_name;

	private String contact_person;

	private Long contact_no;

	private String interest_product;

	private String visit_subject;

	private String description;

	private LocalDate visit_datetime;

	private Boolean is_disabled;

	private Boolean is_deleted;

	private Integer emp_id;

	@ManyToOne
	@JoinColumn(name = "emp_id", insertable = false, updatable = false)
	@JsonIgnore
	private Employee employee;

	// overloaded constructor
	public Visit(String cust_name, String contact_person, Long contact_no, String interest_product,
			String visit_subject, String description, LocalDate visit_datetime, Boolean is_disabled, Boolean is_deleted,
			Integer emp_id) {
		this.cust_name = cust_name;
		this.contact_person = contact_person;
		this.contact_no = contact_no;
		this.interest_product = interest_product;
		this.visit_subject = visit_subject;
		this.description = description;
		this.visit_datetime = visit_datetime;
		this.is_disabled = is_disabled;
		this.is_deleted = is_deleted;
		this.emp_id = emp_id;
	}

	public Integer getVisit_id() {
		return visit_id;
	}

	public void setVisit_id(Integer visit_id) {
		this.visit_id = visit_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public Long getContact_no() {
		return contact_no;
	}

	public void setContact_no(Long contact_no) {
		this.contact_no = contact_no;
	}

	public String getInterest_product() {
		return interest_product;
	}

	public void setInterest_product(String interest_product) {
		this.interest_product = interest_product;
	}

	public String getVisit_subject() {
		return visit_subject;
	}

	public void setVisit_subject(String visit_subject) {
		this.visit_subject = visit_subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getVisit_datetime() {
		return visit_datetime;
	}

	public void setVisit_datetime(LocalDate visit_datetime) {
		this.visit_datetime = visit_datetime;
	}

	public Boolean getIs_disabled() {
		return is_disabled;
	}

	public void setIs_disabled(Boolean is_disabled) {
		this.is_disabled = is_disabled;
	}

	public Boolean getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Visit() {
		super();
		// TODO Auto-generated constructor stub
	}
}
