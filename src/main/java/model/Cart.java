package model;

public class Cart {
	
	private int itemCount;
	private double cartTotal;
	
	public Cart() {
		itemCount = 0;
		cartTotal = 0.00;
	}
	
	public void addItem() {
		itemCount++;
		cartTotal += 3;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public double getCartTotal() {
		if (cartTotal == 0)
			return 0;
		return cartTotal;
	}
	
	public void emptyCart() {
		itemCount = 0;
		cartTotal = 0.0;
	}
}
