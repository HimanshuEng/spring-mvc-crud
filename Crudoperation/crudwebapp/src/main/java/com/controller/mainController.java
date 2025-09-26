package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dao.productDao;
import com.model.Product;

@Controller
public class mainController {
	
	@Autowired
	private productDao productdao;

	@RequestMapping("/")
	public String home(Model m) {
		List<Product> product = productdao.getAll();
		m.addAttribute("products", product);
		/*
		 * m.addAttribute("title", "Add Product"); System.out.println("Product list: " +
		 * product);
		 */

		return "index";
	}
	
//add product form call
	@RequestMapping("/addproduct")
	public String addproductform(Model m) {
		m.addAttribute("title", "Add Product");
		return"addproduct";
	}

//	save product form 
	@RequestMapping(value ="/ProductOperation", method = RequestMethod.POST)
	public RedirectView addproduct(@ModelAttribute Product product,HttpServletRequest request) {
		RedirectView redirectview = new RedirectView();
		System.out.println(product);
		productdao.save(product);
		redirectview.setUrl(request.getContextPath() + "/");
		
		
		return redirectview ;
	}
//	delete product
	@RequestMapping("/deleteproduct/{productId}")
	public RedirectView deleteproduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		this.productdao.deleteproduct(productId);
		RedirectView redirectview = new RedirectView();
		redirectview.setUrl(request.getContextPath()+ "/");
		return redirectview;
	}
//	upadate show edit form call
	@RequestMapping("/edit/{productId}")
	public String edit(@PathVariable("productId") int id,Model model) {
		Product product = productdao.getproduct(id);
		model.addAttribute("product",product );
		
		return "update";
	}
//	update data
	@RequestMapping(value="/updatedetail", method = RequestMethod.POST )
	public RedirectView  updatedetail(@ModelAttribute Product product,HttpServletRequest request){
		RedirectView redirectview = new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/");
		productdao.update(product);
		return redirectview;
	}
}
