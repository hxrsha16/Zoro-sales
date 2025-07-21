package sales.savvy.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sales.savvy.entity.Product;
import sales.savvy.repository.ProductRepository;

@Service
public class ProductSerImp implements ProductService {
	
	@Autowired
	ProductRepository rep;

	@Override
	public void addProduct(Product p) {
		rep.save(p);
	}
	
	@Override
	public Product searchProduct(Long id) {
		return rep.findById(id).get();
	}

	@Override
	public List<Product> getAllProducts() {
		return rep.findAll();
	}

	@Override
	public void updateProduct(Product p) {
		rep.save(p);	
	}

	@Override
	public void deleteProduct(Long id) {
		rep.deleteById(id);
		
	}
	
	

}
