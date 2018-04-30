package startup;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderConfirmationController {
	@GetMapping("/orderConfirmation")
	public String orderConfimation(Principal principal) {
		if (principal != null) {
			return "redirect: /home";
		}
		return "orderConfirmation";
	}
}
