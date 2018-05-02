package startup;

import java.security.Principal;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
	@GetMapping("/shop")
	public String shop(Principal principal) {
		if (principal != null) {
			return "redirect:/home";
		}
		return "shop";
	}
	
	@GetMapping("?cereal1")
	public void cereal1(Principal principal) {
		if (principal != null) {
			// return "redirect:/cereal1";
		}
		System.out.println("Cereal");
	}
	
}
