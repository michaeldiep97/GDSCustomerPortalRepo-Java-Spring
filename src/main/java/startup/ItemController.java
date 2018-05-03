package startup;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {
	
	
	
    @GetMapping("/productPage")
    public String productPage
    (
    	@RequestParam(name="image", required=true) String productImage,
    	@RequestParam(name="name", required=true) String productName,
    	Model model
    ) 
    {
        model.addAttribute("image", productImage);
        model.addAttribute("name", productName);
        return "productPage"; //returns productPage.html 
    }
    
//    @GetMapping("/addToCart")
//    public String addToCart(
//    	@RequestParam(name="item", required=true) String productName,
//    	Model model
//    )
//    {
//    	model.addAttribute
//    }
}
