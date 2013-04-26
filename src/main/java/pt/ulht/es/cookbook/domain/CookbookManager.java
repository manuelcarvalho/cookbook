/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ulht.es.cookbook.domain;

/**
 *
 * @author Igru
 */
import java.util.HashMap;
import java.util.Map;

public class CookbookManager {
    private static int nextRecipeId = "1";
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
    
}
