package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping("/s1")
	public void f1() {
		System.out.println(">>>>> ProductController f1 metghod..");
	}
	
	@RequestMapping("/s2")
	public String f2(Model model) {
		model.addAttribute("products",ps.listAll());
		//model.addAttribute("userName", "Praveen");
		System.out.println(">>>>> ProductController f2 metghod..");
		return "products";
	}

}
