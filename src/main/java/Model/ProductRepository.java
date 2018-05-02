package Model;

import Model.Product;

import org.springframework.data.repository.CrudRepository;
 
import Model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends CrudRepository<User, Long> {

}