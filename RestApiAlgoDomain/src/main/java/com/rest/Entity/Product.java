package com.rest.Entity;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodid;
	private String prodname;
	private String prodtype;
	private String prodcategory;
	private double prodprice;
	private double finalprice;
	//PDC+PPC+PSM+PGM+toString
	@Embedded
	private Charges charges;
	public Product() {
		super();
	}
	public Product(int prodid, String prodname, String prodtype, String prodcategory, double prodprice, double finalprice, Charges charges) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodtype = prodtype;
		this.prodcategory = prodcategory;
		this.prodprice = prodprice;
		this.finalprice=finalprice;
		this.charges=charges;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProdtype() {
		return prodtype;
	}
	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}
	public String getProdcategory() {
		return prodcategory;
	}
	public void setProdcategory(String prodcategory) {
		this.prodcategory = prodcategory;
	}
	public double getProdprice() {
		return prodprice;
	}
	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
	public double getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	} 
	public Charges getCharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodtype=" + prodtype + ", prodcategory="
				+ prodcategory + ", prodprice=" + prodprice + ", finalprice=" + finalprice + ", charges=" + charges + "]";
	} 
}
