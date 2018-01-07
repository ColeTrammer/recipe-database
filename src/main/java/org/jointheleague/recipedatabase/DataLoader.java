package org.jointheleague.recipedatabase;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {
    
    private RecipeRepository recipeRepo;
    
    @Autowired
    public DataLoader(RecipeRepository recipeRepo) {
   	 this.recipeRepo = recipeRepo;
    }
    
    @PostConstruct
    private void loadData() {
    		recipeRepo.save(new Recipe("Test", "Code Sample ..."));
    		recipeRepo.save(new Recipe("Tes", "Code Sample ..."));
    		recipeRepo.save(new Recipe("Test1", "Code Sample ..."));
    		recipeRepo.save(new Recipe("Sample", "Code Sample ..."));
    		recipeRepo.save(new Recipe("Tst", "Code Sample ..."));
    }
    
    /**
     * defines arbitrary search criteria for matching two strings
     * @param s1
     * @param s2
     * @return
     */
    private boolean matches(String s1, String s2) {
    		s1 = s1.toLowerCase();
    		s2 = s2.toLowerCase();
    		int diff = Math.abs(s1.length() - s2.length());
    		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
    			if (s1.charAt(i) != s2.charAt(i)) {
    				diff++;
    			}
    		}
    		return diff <= 1;
    }
    
    public List<Recipe> search(String name) {
    		List<Recipe> list = new ArrayList<>();
    		for (Recipe r : recipeRepo.findAll()) {
    			if (matches(r.getName(), name)) {
    				list.add(r);
    			}
    		}
    		return list;
    }
    
    public Recipe findByName(String name) {
    		for (Recipe r : recipeRepo.findAll()) {
    			if (r.getName().equalsIgnoreCase(name)) {
    				return r;
    			}
    		}
    		return null;
    }
}
