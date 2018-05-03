package startup;

import model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class LoginController {

	Profile profile = new Profile();
	
    @GetMapping("/login")
    public String login(Principal principal) {
        if (principal != null) {
            return "redirect:/home";
        }
        return "/login";
    }
    
    @GetMapping("/loginAttempt")
    public String loginAttempt
    (
    		@RequestParam(name="user", required=true) String username,
        	@RequestParam(name="pass", required=true) String password,
        	Model model
    ) 
    {
    	if (!profile.getUsername().equals(username) || !profile.getPassword().equals(password))
    		return "login";
    	else 
    		return "profile";
    }
}
