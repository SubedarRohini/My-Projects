package com.rest.Entity;
public class Transfer 
{
	private long taccno;
	  private String tname;
	  private String tpassword;
	  private double tamount;
	  private String taddress;
	  private long tmobile;
	  public Transfer() {
	    super();
	  }
	  public long getTaccno() {
	    return taccno;
	  }
	  public void setTaccno(long taccno) {
	    this.taccno = taccno;
	  }
	  public String getTname() {
	    return tname;
	  }
	  public void setTname(String tname) {
	    this.tname = tname;
	  }
	  public String getTpassword() {
	    return tpassword;
	  }
	  public void setTpassword(String tpassword) {
	    this.tpassword = tpassword;
	  }
	  public double getTamount() {
	    return tamount;
	  }
	  public void setTamount(double tamount) {
	    this.tamount = tamount;
	  }
	  public String getTaddress() {
	    return taddress;
	  }
	  public void setTaddress(String taddress) {
	    this.taddress = taddress;
	  }
	  public long getTmobile() {
	    return tmobile;
	  }
	  public void setTmobile(long tmobile) {
	    this.tmobile = tmobile;
	  }
	  @Override
	  public String toString() {
	    return "Transfer [taccno=" + taccno + ", tname=" + tname + ", tpassword=" + tpassword + ", tamount=" + tamount
	        + ", taddress=" + taddress + ", tmobile=" + tmobile + "]";
	  }  
	}