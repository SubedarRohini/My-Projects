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
import com.rest.Entity.ProductEntity;
import com.rest.Service.ProductServiceImp;
@RestController
public class ProductController 
{
	@Autowired 
	 private ProductServiceImp productServiceImp; 
	 @PostMapping("/save") 
	 public String saveData(@RequestBody ProductEntity productEntity) 
	 { 
		 ProductEntity p1=productServiceImp.saveRecord(productEntity); 
	  String message=null; 
	  if(p1!=null)  
	  { 
	   message="Data Saved Successfully"; 
	  } 
	  else 
	  { 
	   message="Data Failed"; 
	  } 
	  return message; 
	 }
	 @GetMapping("/get/{cid}")
	 public ProductEntity get(@PathVariable int cid)
	 {
		 ProductEntity get=productServiceImp.getOneRecord(cid); 
		  return  get; 
	 }
	 @GetMapping("/getAll")
	 public List<ProductEntity> getAll()
	 {
		 List<ProductEntity> getAll=productServiceImp.getAllRecord(); 
		  return getAll; 
	 }
	 @DeleteMapping("/delete/{cid}")
	 public void delete(@PathVariable int cid)
	 {
	  ProductServiceImp productServiceImp = new ProductServiceImp();
	  productServiceImp.deleteRecord(cid);
	 }
	 @PutMapping("/update/{cid}")
	 public ProductEntity update(@PathVariable int cid, @RequestBody ProductEntity productEntity)
	 {
		 ProductEntity update = productServiceImp.updateRecord(productEntity, cid);
	  return update;
	 }
}
	 
	 