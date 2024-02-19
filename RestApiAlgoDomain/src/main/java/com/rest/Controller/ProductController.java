package com.rest.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.Entity.Charges;
import com.rest.Entity.Product;
import com.rest.Service.ProductServiceImp;
@RestController
public class ProductController 
{
	@Autowired 
	 private ProductServiceImp  productServiceImp; 
	 @PostMapping("/save") 
	 public String saveData(@RequestBody Product product, Charges charges) 
	 { 
		 Product e1=productServiceImp.save(product, charges); 
	  String message=null; 
	  if(e1!=null)  
	  { 
	   message="Data Saved Successfully"; 
	  } 
	  else 
	  { 
	   message="Data Insertion Failed"; 
	  } 
	  return message; 
	 } 
	 @GetMapping("/get/{prodid}") 
	 public Product getOne(@PathVariable int prodid) 
	 { 
		 Product get=productServiceImp.getOne(prodid); 
	  return  get; 
	 } 
	 @GetMapping("/getAll") 
	 public List<Product> getAll() 
	 { 
	  List<Product> getAll=productServiceImp.getAll(); 
	  return getAll; 
	 }   
	 @DeleteMapping("/delete/{prodid}") 
	 public void delete(@PathVariable int prodid) 
	 { 
		 productServiceImp.delete(prodid); 
	 } 
	 @PutMapping("/update/{prodid}")
	 public Product update(@RequestBody Product product, @PathVariable int prodid, Charges charges)
	 {
		 Product update=productServiceImp.update(product,charges, prodid);
		return update;	 
	 }
}
