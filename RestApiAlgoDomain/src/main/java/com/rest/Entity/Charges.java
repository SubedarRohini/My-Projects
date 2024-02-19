package com.rest.Entity;
import jakarta.persistence.Embeddable;
@Embeddable
public class Charges 
{
	private double gst;
	private double deliverycharges;
	private double discount;
	//PDC+PPM+PSM+PGM+toString
	public Charges() {
		super();
	}
	public Charges(double discount, double gst, double deliverycharges) {
		super();
		this.gst = gst;
		this.deliverycharges = deliverycharges;
		this.discount=discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDeliverycharges() {
		return deliverycharges;
	}
	public void setDeliverycharges(double deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	@Override
	public String toString() {
		return "ProductCategory [gst=" + gst + ", deliverycharges=" + deliverycharges + ", discount=" + discount + "]";
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getDiscount() {
		return discount;
	}
}
