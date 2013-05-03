package pt.ulht.es.cookbook.domain;

public class Recipe {
	private String id;
	private String titulo;
	private String problema;
	private String solucao;
	private String autor;

	public Recipe(String titulo, String problema, String solucao, String autor){
		this.titulo= titulo;
		this.problema= problema;
		this.solucao= solucao;  
		this.autor=autor;
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
	public void setId(String id){

		this.id= id;
	}
	public String getAutor() {
		return autor;
	
	}
    
    
}




