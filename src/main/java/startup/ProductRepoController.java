package startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Product;
import model.ProductRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/productRepo") // This means URL's start with /productRepo (after Application path)
public class ProductRepoController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private ProductRepository productRepository;
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewProduct (
			  @RequestParam String name
			, @RequestParam double price
			, @RequestParam int productID
			, @RequestParam int category) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		p.setProductID(productID);
		p.setCategory(category);
		productRepository.save(p);
		return "Saved Product";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Product> getAll() {
		// This returns a JSON or XML with the products
		return productRepository.findAll();
	}
}