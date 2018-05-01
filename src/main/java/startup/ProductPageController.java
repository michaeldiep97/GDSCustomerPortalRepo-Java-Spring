package startup;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductPageController {
	@GetMapping("/milk")
	public String milk(Principal principal) {
		if (principal != null) {
			return "redirect: /home";
		}
		return "/milk";
	}
}
