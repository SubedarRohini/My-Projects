package com.rest.Service;
import java.util.List;
import com.rest.Entity.Charges;
import com.rest.Entity.Product;
public interface ProductService 
{
	public Product save(Product product, Charges charges);
	public void delete(int proId);
	public Product getOne(int proId);
	public List<Product> getAll();
	public Product update(Product product, Charges charges, int proId);
}
