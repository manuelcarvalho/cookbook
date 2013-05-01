/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ulht.es.cookbook.domain;

/**
 *
 * @author Manuel Carvalho
 */
public class Recipe {
<<<<<<< HEAD

	private String id;
	private String titulo;
	private String problema;
	private String solucao;

	public Recipe(String titulo, String problema, String solucao){
		this.titulo= titulo;
		this.problema= problema;
		this.solucao= solucao;  
	}

	public String getTitulo(){
		return titulo;
	}
	public String getProblema(){
		return problema;
	}

	public String getSolucao(){
		return solucao;
	}

	public String getId(){
		return id;

	}
	//public void setProblema(String problema){

	//this.problema= problema;
	// }
	public void setId(String id){

		this.id= id;
	}



=======
    private String id;
    
    private String titulo;
    private String problema;
    private String solucao;
    
    public Recipe(String titulo, String problema, String solucao){
       this.titulo= titulo;
       this.problema= problema;
       this.solucao= solucao;  
    }

    void setId(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
    
>>>>>>> e47d730ed2c0dc104d5a7dad83a8b80a96e892c9
}




