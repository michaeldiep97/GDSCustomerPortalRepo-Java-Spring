package model;

import org.springframework.data.repository.CrudRepository;

import model.Order;

// This will be AUTO IMPLEMENTED by Spring into a Bean called orderRepository
// CRUD refers Create, Read, Update, Delete

public interface OrderRepository extends CrudRepository<Order, Long> {

}