package sales.savvy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sales.savvy.entity.Product;
import sales.savvy.service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductController {

	@Autowired
	ProductService ser;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product p) {
		ser.addProduct(p);
		return "success";
	}
	
	@GetMapping("/searchProduct")
	public Product searchProduct(Long id) {
		return ser.searchProduct(id);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return ser.getAllProducts();
	}
	
	@PostMapping("/updateProduct")
	public String updateProduct(@RequestBody Product p) {
		ser.updateProduct(p);
		return "success";
	}
	
	@GetMapping("/deleteProduct")
	public void deleteProduct(Long id) {
		ser.deleteProduct(id);
	}
}
