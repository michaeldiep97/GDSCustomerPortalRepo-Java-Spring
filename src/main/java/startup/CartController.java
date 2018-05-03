package startup;
import model.Cart;
import java.security.Principal;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CartController {
	
	Cart cart = new Cart();
	
	@GetMapping("/cart")
    public String cart(Principal principal, Model model) {
        if (principal != null) {
            return "redirect:/home";
        }
        model.addAttribute("itemCount", cart.getItemCount());
        return "cart";
    }
	
//	@GetMapping("/refresh")
//    public String productPage
//    (
//    	@RequestParam(name="itemCount", required=true) String itemCount,
//    	Model model
//    ) 
//    {
//		cart.addItem();
//        model.addAttribute("itemCount", cart.getItemCount());
//        return "cart"; //returns productPage.html 
//    }
	
	@GetMapping("/refresh")
    public String productPage
    (
    	Model model
    ) 
    {
		cart.emptyCart();
        model.addAttribute("itemCount", cart.getItemCount());
        return "cart"; //returns productPage.html 
    }
	
	@GetMapping("/addToCart")
    public String addToCart
    (
    	@RequestParam(name="image", required=true) String imageName,
    	@RequestParam(name="price1", required=true) String itemPrice,
    	Model model
    ) 
    {
		cart.addItem();
        model.addAttribute("itemCount", cart.getItemCount());
        model.addAttribute("price1", itemPrice);
        model.addAttribute("item1", imageName);
        model.addAttribute("totalPrice", String.format("%.2f", cart.getCartTotal()));
        return "cart"; //returns productPage.html 
    }
	
	
//	@GetMapping("/")
//	public void testPrint() {
//		System.out.println("Home clicked from cart");
//	}

//    if (request.getParameter("Continue Shopping") != null) {
//        System.out.println("Cart :: 'Continue Shopping' button clicked");
//    } else if (request.getParameter("Edit Cart") != null) {
//        System.out.println("Cart :: 'Edit Cart' button clicked");
//    } else if (request.getParameter("Checkout") != null) {
//        System.out.println("Cart :: 'Checkout' button clicked");
//    }
}
