package mani.springbootrestmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mani.springbootrestmain.entity.Product;

@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer> {

	Product save(Product p);


}
