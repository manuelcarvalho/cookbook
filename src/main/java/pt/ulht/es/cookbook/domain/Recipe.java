package pt.ulht.es.cookbook.domain;

import org.joda.time.DateTime;

public class Recipe extends Recipe_Base {
    
    public  Recipe(String titulo, String problema, String solucao, String autor) {
        setTitle(titulo);
        setProblem(problema);
        setSolution(solucao);
        setAuthor(autor);
        setCreationTimestamp(new DateTime());
        setCookbookManager(CookbookManager.getInstance());
        
    }
    
}
