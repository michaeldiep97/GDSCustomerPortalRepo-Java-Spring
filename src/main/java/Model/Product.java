package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;
    private double price;
    private int productID;
    private int category;

    // No constructor needed for @Entity classes. 

    public void setName(String newName) {
        name = newName;
    }
    
    public void setPrice(double newPrice) {
        if (price < 0.00) {
            //throw new CustomException(“Invalid product price assignment”);
        }
        price = newPrice;
    }

    public void setCategory(int newCategory) {
        category = newCategory;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getProductID() { return productID; }
    public int getCategory() { return category; }
    
    // Constructor with category provided    
    /*public Product (String name, double price, int productID, int category) {
        this.name = name;
        this.updatePrice(price);
        this.productID = productID;
        this.category = category;
    }*/

    // Constructor with no category provided
    /*public Product (String name, double price, int productID) {
        this.name = name;
        this.updatePrice(price);
        this.productID = productID;
        this.category = 0; // Default category
    }*/

}
