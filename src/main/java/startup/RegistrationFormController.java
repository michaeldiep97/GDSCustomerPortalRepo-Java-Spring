package startup;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationFormController {
	@GetMapping("/registrationForm")
	public String registrationForm(Principal principal) {
		if (principal != null) {
			return "redirect: /home";
		}
		return "/registrationForm";
	}
}
