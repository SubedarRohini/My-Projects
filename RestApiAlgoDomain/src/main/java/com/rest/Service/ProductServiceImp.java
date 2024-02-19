package com.rest.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.Entity.Charges;
import com.rest.Entity.Product;
import com.rest.repo.productRepo;
@Service
public class ProductServiceImp implements ProductService 
{
	@Autowired
	 private productRepo repo; 
	@Override
	public Product save(Product product,Charges charges) {
		double price = product.getProdprice();
		double dis = 0.0;
		double gst = 0.0;
		double deliverycharges = 0.0;
		double finalP = 0.0; 
		
		if(product.getProdcategory().equalsIgnoreCase("Electronics"))
		{
			dis = (price * 15)/100;
			gst = (price * 18)/100;
			deliverycharges = 350;
		}
		if(product.getProdcategory().equalsIgnoreCase("Home Appliances"))
		{
			dis = (price * 22)/100;
			gst = (price * 24)/100;
			deliverycharges = 800;
		}
		if(product.getProdcategory().equalsIgnoreCase("Clothing"))
		{
			dis = (price * 40)/100;
			gst = (price * 12)/100;
			deliverycharges = 0;
		}
		if(product.getProdcategory().equalsIgnoreCase("Furniture"))
		{
			dis = (price * 10)/100;
			gst = (price * 18)/100;
			deliverycharges = 300;
		}
		finalP = price - dis + gst + deliverycharges;
		charges.setGst(gst);
		charges.setDeliverycharges(deliverycharges);
		product.setProdprice(price);
		charges.setDiscount(dis);
		product.setFinalprice(finalP);
		product.setCharges(charges);	
		Product save = repo.save(product);
		return save;
	}
	@Override 
	 public Product getOne(int prodid) { 
		Product get=repo.findById(prodid).get(); 
	  return get; 
	 } 
	 @Override 
	 public List<Product> getAll() { 
	  List<Product> getAll=repo.findAll(); 
	  return getAll; 
	 }   
	 @Override 
	 public void delete(int prodid) { 
		 repo.deleteById(prodid); 
	 }
	 @Override
	public Product update(Product product,Charges charges, int prodid) 
	 {			
		 Product update = repo.findById(prodid).get();
		  double price=product.getProdprice();
		  double discount = 0.0;
		  double gst = 0.0;
		  double deliverycharges = 0.0;
		  double finalprice = 0.0; 	  
		  if(product.getProdcategory().equalsIgnoreCase("Electronics"))
		  {
			  discount = (price * 15)/100;
		   gst = (price * 18)/100;
		   deliverycharges = 350;
		  }
		  if(product.getProdcategory().equalsIgnoreCase("Home Appliances"))
		  {
			  discount = (price * 22)/100;
		   gst = (price * 24)/100;
		   deliverycharges = 800;
		  }
		  if(product.getProdcategory().equalsIgnoreCase("Clothing"))
		  {
			  discount = (price * 40)/100;
		   gst = (price * 12)/100;
		   deliverycharges = 800;
		  }
		  if(product.getProdcategory().equalsIgnoreCase("Furniture"))
		  {
			  discount = (price * 10)/100;
		   gst = (price * 18)/100;
		   deliverycharges = 300;
		  }	   
		  finalprice = price - discount + gst + deliverycharges;		  
		  charges.setGst(gst);
		  charges.setDeliverycharges(deliverycharges);
		  product.setProdprice(price);
		  charges.setDiscount(discount);
		  product.setFinalprice(finalprice);
		  product.setCharges(charges);
		  update.setProdprice(product.getProdprice());
		  update.setProdtype(product.getProdtype());
		  update.setCharges(charges);
		  update.setFinalprice(finalprice);
		  Product save = repo.save(update);		  
		  return save;
		 }
} 
