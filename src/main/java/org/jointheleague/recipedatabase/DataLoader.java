package org.jointheleague.recipedatabase;

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
    }
}
