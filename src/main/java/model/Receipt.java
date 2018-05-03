package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Receipt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
    private int orderNumber;
    private double total;
    
	public Integer getCustomer() {
		return userId;
	}
	public void setCustomer(int uId) {
		this.userId = uId;
	}
	public int getOrder() {
		return orderNumber;
	}
	public void setOrder(int orderN) {
		this.orderNumber = orderN;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
