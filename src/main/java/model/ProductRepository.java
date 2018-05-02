package model;

import org.springframework.data.repository.CrudRepository;

import model.Product;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends CrudRepository<Product, Long> {

}