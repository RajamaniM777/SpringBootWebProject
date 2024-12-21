  package mani.springbootrestmain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mani.springbootrestmain.entity.Product;
import mani.springbootrestmain.repository.InventoryRepository;

@Service
public class InventoryService {
	private final InventoryRepository repository;
	
	
	@Autowired
	public InventoryService(InventoryRepository repository) {
		this.repository=repository;
	}



//4 CRUD OPERATIONS
//a.insert a product
public Product saveProduct(Product p) {
	Product obj=repository.save(p);
	return obj;
}
}

