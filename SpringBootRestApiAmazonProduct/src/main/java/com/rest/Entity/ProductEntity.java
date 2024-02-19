package com.rest.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ProductEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private long mobileno;
	private String pname;
	private double price;
	private int quantity;
	private double invoice_bill;
	private double total;
	private double gst;
	private double discount;
	//PDC+PPC+PSM+PGM+toString
	public ProductEntity() {
		super();
	}
	public ProductEntity(int cid, String cname, long mobileno, String pname, double price, int quantity,
			double invoice_bill, double total, double gst, double discount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobileno = mobileno;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.invoice_bill = invoice_bill;
		this.total = total;
		this.gst = gst;
		this.discount = discount;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "ProductEntity [cid=" + cid + ", cname=" + cname + ", mobileno=" + mobileno + ", pname=" + pname
				+ ", price=" + price + ", quantity=" + quantity + ", invoice_bill=" + invoice_bill + ", total=" + total
				+ ", gst=" + gst + ", discount=" + discount + "]";
	}
}
