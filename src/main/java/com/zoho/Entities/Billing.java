package com.zoho.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billing {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="invoice_Number")
	private long invoiceNumber;
	
	@Column(name="first_Name")
	private String firstName;
	
	@Column(name="last_Name")
	private String lastName;
	
	@Column(name="email", unique=true, nullable=false)
	private String email;
	
	private long mobile;
	private String product;
	private long amount;
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
}
