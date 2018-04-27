package startup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	/*
	 * Extra demo controller
	 */
    @GetMapping("/hello")
   
    public String hello
    (
    		@RequestParam(value="greet", required=true) 
    		String id1, 
    		Model model
    ) 
    {
        model.addAttribute("greet", id1);
        return "hello"; //this is the hello.html template
    }

}
