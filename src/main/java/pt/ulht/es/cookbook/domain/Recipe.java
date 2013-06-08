package pt.ulht.es.cookbook.domain;

import java.util.Comparator;

import org.apache.taglibs.standard.tag.common.xml.SetTag;
import org.joda.time.DateTime;

public class Recipe extends Recipe_Base {
    
    public  Recipe(String titulo, String problema, String solucao, String autor, String tag) {
        setTitle(titulo);
        setProblem(problema);
        setSolution(solucao);
        setAuthor(autor);
        setTag(tag);
        setCreationTimestamp(new DateTime());
        setCookbookManager(CookbookManager.getInstance());
        
    }
<<<<<<< HEAD
    public static class Titlecomp implements Comparator<Recipe> {
    	
    
    public int compare(Recipe o1, Recipe o2){
    	return o1.getTitle().compareTo(o2.getTitle());
    }
}
// 06-06-2013
=======
        					
>>>>>>> -
	public void delete() {
		// TODO Auto-generated method stub
		setCookbookManager(null);
		super.deleteDomainObject();
	}
    
}

