package mani.springbootrestmain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mani.springbootrestmain.entity.Product;
import mani.springbootrestmain.service.InventoryService;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {
	private final InventoryService service;
	
	
	@Autowired
	public InventoryController(InventoryService service) {
		this.service=service;
	}


//4 CRUD OPERATIONS
//a.insert operation
@PostMapping("/saveproduct")
public ResponseEntity<Product> saveProduct( Product p){
	Product obj=service.saveProduct(p);
	return ResponseEntity.ok(obj);
}
}

