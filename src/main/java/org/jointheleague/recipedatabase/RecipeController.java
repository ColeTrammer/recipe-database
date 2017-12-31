package org.jointheleague.recipedatabase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

	@GetMapping("/")
	public String index(Model m) {
		return "index";
	}
	
}
