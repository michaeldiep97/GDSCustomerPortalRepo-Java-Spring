package startup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	@GetMapping("/greetspage")
    public String method() 
    {
        return "greetspage"; //returns greetspage.html in templates populated with alias nameValue
    }
	/*
	 * The @GetMapping annotation ensures that HTTP GET requests to 
	 * /greeting are mapped to the greeting() method.
	 */
    @GetMapping("/greetspage/greeting")
    /*
     * @RequestParam binds the value of the query String parameter name 
     * into the name1 parameter of the greeting() method. This query String 
     * parameter is not required; if it is absent in the request, the 
     * defaultValue of "World" is used. The value of the name parameter is 
     * added to a Model object, ultimately making it accessible to the view 
     * template.
     */
    public String greeting
    (
    	@RequestParam(name="nameValue", required=false, defaultValue="World") 
    	String name1, 
    	Model model
    ) 
    {
        model.addAttribute("nameValue", name1);
        return "greeting"; //returns greeting.html in templates populated with alias nameValue
    }

}
