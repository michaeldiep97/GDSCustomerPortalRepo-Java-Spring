package startup;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	@GetMapping("/cart")
    public String cart(Principal principal) {
        if (principal != null) {
            return "redirect:/home";
        }
        return "cart";
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
