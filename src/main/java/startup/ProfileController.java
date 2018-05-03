package startup;
import java.security.Principal;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProfileController {
	
	@GetMapping("/profile")
    public String profile(Principal principal, Model model) {
        if (principal != null) {
            return "redirect:/home";
        }
        return "profile";
    }
}
