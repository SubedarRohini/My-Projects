package com.rest.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.Entity.ProductEntity;
import com.rest.Repo.ProductRepo;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepo productRepo;
	@Override
	public ProductEntity saveRecord(ProductEntity productEntity) 
	{
		double total = 0;
		  double discount = 0;
		  double gst = 0;
		  double invoice_bill = 0;
		 total = productEntity.getPrice() * productEntity.getQuantity();
		 if(total < 2000)
		  {
		   discount = total * 0.10;
		  }
		  else if(total >= 2000 && total < 5000)
		  {
		   discount = total * 0.15;
		  }
		  else if(total >= 5000 && total <= 10000)
		  {
		   discount = total * 0.20;
		  }
		  else if(total > 10000)
		  {
		   discount = total * 0.30;
		  }
		 invoice_bill = total - discount;
		  if(invoice_bill <= 500)
		  {
		   gst = invoice_bill * 0.02;
		  }
		  else if(invoice_bill >= 500 && invoice_bill < 1500)
		  {
		   gst = invoice_bill * 0.03;
		  }
		  else if(invoice_bill >= 1500 && invoice_bill < 5000)
		  {
		   gst = invoice_bill* 0.05;
		  }
		  else if(invoice_bill >= 5000 && invoice_bill < 10000)
		  {
		   gst = invoice_bill * 0.09;
		  }
		  else if(invoice_bill >= 10000)
		  {
		   gst = invoice_bill * 0.5;
		  }	  
		  productEntity.setTotal(total);
		  productEntity.setDiscount(discount);
		  productEntity.setGst(gst);
		  productEntity.setInvoice_bill(invoice_bill+gst);
		  ProductEntity save = productRepo.save(productEntity);
		  return save;
	}
	 @Override
	 public ProductEntity getOneRecord(int cid) {
		 ProductEntity getOne = productRepo.findById(cid).get();
	  return getOne;
	 }
	 @Override
	 public List<ProductEntity> getAllRecord() {
	  List<ProductEntity> getAll = productRepo.findAll();
	  return getAll;
	 }
	 @Override
	 public void deleteRecord(int cid) {
		 productRepo.deleteById(cid);
	 }
	 @Override
	 public ProductEntity updateRecord(ProductEntity productEntity, int cid) {
		 ProductEntity update = productRepo.findById(cid).get();
	  double total = 0;
	  double discount = 0;
	  double gst = 0;
	  double invoice = 0;
	  total = productEntity.getPrice() * productEntity.getQuantity();
	  if(total < 2000)
	  {
	   discount = total * 0.10;
	  }
	  else if(total >= 2000 && total < 5000)
	  {
	   discount = total * 0.15;
	  }
	  else if(total >= 5000 && total <= 10000)
	  {
	   discount = total * 0.20;
	  }
	  else if(total > 10000)
	  {
	   discount = total * 0.30;
	  }
	  invoice = total - discount;
	  if(invoice <= 500)
	  {
	   gst = invoice * 0.02;
	  }
	  else if(invoice >= 500 && invoice < 1500)
	  {
	   gst = invoice * 0.03;
	  }
	  else if(invoice >= 1500 && invoice < 5000)
	  {
	   gst = invoice * 0.05;
	  }
	  else if(invoice >= 5000 && invoice < 10000)
	  {
	   gst = invoice * 0.09;
	  }
	  else if(invoice >= 10000)
	  {
	   gst = invoice * 0.5;
	  }	  
	  productEntity.setTotal(total);
	  productEntity.setDiscount(discount);
	  productEntity.setGst(gst);
	  productEntity.setInvoice_bill(invoice+gst);
	  update.setPrice(productEntity.getPrice());
	  update.setQuantity(productEntity.getQuantity());
	  update.setTotal(total);
	  update.setDiscount(discount);
	  update.setGst(gst);
	  update.setInvoice_bill(invoice);
	  ProductEntity save = productRepo.save(update);
	  return save;
	 } 
}
