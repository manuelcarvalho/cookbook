package pt.ulht.es.cookbook.controller;

import pt.ulht.es.cookbook.domain.CookbookManager;
//import java.util.ArrayList;
import java.util.Collection;
//import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pt.ulht.es.cookbook.domain.Recipe;

@Controller
public class RecipeController {

<<<<<<< HEAD
	@RequestMapping(method=RequestMethod.GET, value="/recipes")
	public String listRecipes(Model model) {
		Collection<Recipe> recipes = CookbookManager.getRecipes();
		model.addAttribute("recipes",recipes);
		return "listRecipes";


	}

	@RequestMapping(method=RequestMethod.GET, value="/recipes/create")
	public String showRecipeCreationForm(){
		return"createRecipe";

	}
	@RequestMapping(method=RequestMethod.POST, value="/recipes")
	public String createRecipe(@RequestParam Map<String,String> params){
		String titulo = params.get("titulo");
		String problema = params.get("problema");
		String solucao = params.get("solucao");
=======
        List<String> values = new ArrayList<String>();
        values.add("Ola");
        values.add("Mundo");        
        model.addAttribute("items", values);
        
        return "listRecipes";
    }
    /**
     *
     * @return
     */
    public String showrecipescreationform(){
            
    @RequestMapping("recipes/create")
    public String showrecipescreationform(){
        return
    }
          
    @RequestMapping(method=RequestMethod.POST, value="/recipes")
    public String createRecipe(@RequestParam Map<String,String> params){
        String titulo = params.get("titulo");
        String problema = params.get("problema");
        String solucao = params.get("solucao");
        
        Recipe recipe = new Recipe(titulo, problema, solucao);
        
        CookbookManager.saveRecipe(recipe);
        
        return "redirect:/recipes/"+recipe.getId();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/recipes/{id}")
    public String showRecipe(Model model, @PathVariable String id) {
>>>>>>> e47d730ed2c0dc104d5a7dad83a8b80a96e892c9

		Recipe recipe = new Recipe(titulo, problema, solucao);

		CookbookManager.saveRecipe(recipe);

		return "redirect:/recipes/"+recipe.getId();	}

	@RequestMapping(method=RequestMethod.GET, value="/recipes/{id}")
	public String showRecipe(Model model, @PathVariable String id) {
		Recipe recipe = CookbookManager.getRecipe(id);
		if(recipe != null) {
			model.addAttribute("recipe",recipe);
			return "detailedRecipe";
		} else {
			//model.addAttribute("id", id);
			return "recipeNotFound";
		}
<<<<<<< HEAD
	}

=======
    }
        
    
    
}
>>>>>>> e47d730ed2c0dc104d5a7dad83a8b80a96e892c9
}