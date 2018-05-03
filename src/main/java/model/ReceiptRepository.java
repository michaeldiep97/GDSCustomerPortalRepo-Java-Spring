package model;

import org.springframework.data.repository.CrudRepository;

import model.Receipt;

// This will be AUTO IMPLEMENTED by Spring into a Bean called receiptRepository
// CRUD refers Create, Read, Update, Delete

public interface ReceiptRepository extends CrudRepository<Receipt, Long> {

}