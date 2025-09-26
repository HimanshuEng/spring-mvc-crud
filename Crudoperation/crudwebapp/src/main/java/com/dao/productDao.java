package com.dao;

import java.util.List;

import com.model.Product;

public interface productDao {
	void save(Product product);

	List<Product> getAll();

	Product getproduct(int id);
	
	void update(Product product);

	void deleteproduct(int id);
 
}
