/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ulht.es.cookbook.domain;

/**
 *
 * @author Manuel Carvalho
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CookbookManager {
<<<<<<< HEAD
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
=======
    private static int nextRecipeId = 1;
    private static Map<String,Recipe> RECIPE_MAP = new HashMap<String,Recipe>();
    
            
    public static void saveRecipe(Recipe recipe){
        String key = nextRecipeId+"";
        RECIPE_MAP.put(key, recipe);
        nextRecipeId++;
        recipe.setId(key);
        
    }

    public static Recipe getRecipe(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
>>>>>>> e47d730ed2c0dc104d5a7dad83a8b80a96e892c9
}

