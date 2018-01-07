package org.jointheleague.recipedatabase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {

	@Autowired
	DataLoader dl;
	
	@GetMapping("/")
	public String index(Model m) {
		return "index";
	}
	
	@GetMapping("/search")
	public @ResponseBody List<Recipe> search(@RequestParam(value="search", required=true) String search) {
		return dl.search(search);
	}
	
}
