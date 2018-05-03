package model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	@SuppressWarnings("rawtypes")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private ArrayList items;
	private double total;
	private Receipt receipt;
	private int orderNumber;
	private String date;
	@SuppressWarnings("rawtypes")
	public ArrayList getItems() {
		return items;
	}
	public void setItems(@SuppressWarnings("rawtypes") ArrayList items) {
		this.items = items;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
    
    
}
