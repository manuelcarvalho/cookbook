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



}




