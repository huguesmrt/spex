package com.hugues.springexample.ui;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ShowProducts { 
	 @Autowired
	 JdbcTemplate jdbcTemplate;

	@GetMapping
	public String getProducts(@RequestParam(value="name", required = false)String name, Model model) {
		try {		
			String query = "SELECT PRICE FROM PRODUCT WHERE NAME = '" + name + "';";
			Map<String, Object> queryResult = jdbcTemplate.queryForMap(query);
			Object price = queryResult.get("PRICE");
			model.addAttribute("price", price);
			return "results";
		} catch (Exception Ex) {return null;}
	}
	
}
