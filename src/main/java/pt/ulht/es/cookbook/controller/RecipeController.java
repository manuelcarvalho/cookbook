package pt.ulht.es.cookbook.controller;

import pt.ist.fenixframework.pstm.AbstractDomainObject;
import pt.ulht.es.cookbook.domain.CookbookManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
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
	@RequestMapping(method = RequestMethod.GET, value = "/recipes")
	public String listRecipes(Model model) {
		List<Recipe> recipes = new ArrayList<Recipe>(CookbookManager.getInstance().getRecipeSet());
		Collections.sort(recipes, new Recipe.Titlecomp());
		model.addAttribute("recipes", recipes);
		//model.addAttribute("RecipeSortedList",RecipeList)
		return "listRecipes";

	}
	@RequestMapping(method=RequestMethod.GET, value="/recipes/{id}/delete")
	public String deleteRecipe(@PathVariable("id") String id){
	Recipe recipe = AbstractDomainObject.fromExternalId(id);
	recipe.delete();
	return "redirect:/recipes/";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/create") //mostrar o formulario
	public String showRecipeCreationForm() { 
		return "createRecipe";

	}

	@RequestMapping("recipes/create")
	public String showrecipescreationform() {
		return "createrecipe";
	}
	

	@RequestMapping(method = RequestMethod.POST, value = "/recipes")
	public String createRecipe(@RequestParam Map<String, String> params) {
		String titulo = params.get("titulo");
		String problema = params.get("problema");
		String solucao = params.get("solucao");
		String autor = params.get("autor");
		String tag = params.get("tag");
		Recipe recipe = new Recipe(titulo, problema, solucao, autor, tag);

		return "redirect:/recipes/" + recipe.getExternalId();// reencaminha o browser para uma página que ira mostrar em
		//detalhe a "recipe" acabada de criar e vai buscar pelo sei id. (aponta para o metodo seguinte).vai mostar sempre 
		//o ultimo id a ser criado.
	}

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/{id}")
	public String showRecipe(Model model, @PathVariable String id) {
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		if (recipe != null) {
			model.addAttribute("recipe", recipe);
			return "detailedRecipe";
		} else {
			return "recipeNotFound";// mostra o jsp "recipeNotfound" 
		}
		

	}
}
