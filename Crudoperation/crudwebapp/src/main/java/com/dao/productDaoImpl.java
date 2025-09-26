package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Transactional
@Repository
public class productDaoImpl implements productDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;

	@Override
	public void save(Product product) {
		hibernatetemplate.save(product);
	}

	@Override
	public List<Product> getAll() {
		return hibernatetemplate.loadAll(Product.class);
	}

	@Override
	public Product getproduct(int id) {
		return hibernatetemplate.get(Product.class, id);
	}

	@Override
	public void deleteproduct(int id) {
		Product p = hibernatetemplate.load(Product.class, id);
		hibernatetemplate.delete(p);
	}

	@Override
	public void update(Product product) {
		hibernatetemplate.update(product);

	}

}
