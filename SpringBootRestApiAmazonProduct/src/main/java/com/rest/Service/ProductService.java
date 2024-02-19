package com.rest.Service;
import java.util.List;
import com.rest.Entity.ProductEntity;
public interface ProductService
{
	public ProductEntity saveRecord(ProductEntity productEntity);
	public ProductEntity updateRecord(ProductEntity productEntity, int cid);
	public void deleteRecord(int cid);
	public ProductEntity getOneRecord(int cid);
	public List<ProductEntity> getAllRecord();
}
