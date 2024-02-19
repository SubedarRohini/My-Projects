package com.rest.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class BankEntity 
{
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long accno;
	  private String name;
	  private String password;
	  private double amount;
	  private String address;
	  private long mobile;
	  public BankEntity() {
	    super();
	  }
	  public long getAccno() {
	    return accno;
	  }
	  public void setAccno(long accno) {
	    this.accno = accno;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getPassword() {
	    return password;
	  }
	  public void setPassword(String password) {
	    this.password = password;
	  }
	  public double getAmount() {
	    return amount;
	  }
	  public void setAmount(double amount) {
	    this.amount = amount;
	  }
	  public String getAddress() {
	    return address;
	  }
	  public void setAddress(String address) {
	    this.address = address;
	  }
	  public long getMobile() {
	    return mobile;
	  }
	  public void setMobile(long mobile) {
	    this.mobile = mobile;
	  }
	  @Override
	  public String toString() {
	    return "BankEntity [accno=" + accno + ", name=" + name + ", password=" + password + ", amount=" + amount
	        + ", address=" + address + ", mobile=" + mobile + "]";
	  }  
	}