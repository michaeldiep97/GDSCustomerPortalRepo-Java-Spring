package startup;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	@GetMapping("/productPage")
	public String item(Principal principal) {
		if (principal != null) {
			return "redirect: /home";
		}
		System.out.println("Product Page Accessed");
		return "item";
	}
}
