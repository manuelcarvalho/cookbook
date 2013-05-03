package pt.ulht.es.cookbook.domain;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CookbookManager {

	private static int nextRecipeId = 1;
	private static Map<String, Recipe> RECIPE_MAP = new HashMap<String, Recipe>();

	public static void saveRecipe(Recipe recipe) {
		String id = nextRecipeId + ""; 
		RECIPE_MAP.put(id, recipe); 
		nextRecipeId++;
		recipe.setId(id);
		

	}

	public static Recipe getRecipe(String id) {

		return RECIPE_MAP.get(id);
	}
	public static Collection<Recipe> getRecipes(){
		return RECIPE_MAP.values();

	}
    
}

