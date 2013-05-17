package pt.ulht.es.cookbook.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

import pt.ist.fenixframework.FenixFramework;

public class Bootstrap implements WebApplicationInitializer {


	public void onStartup(ServletContext ctx) throws ServletException {
		FenixFramework.initialize(PropertiesManager.getFenixFrameworkConfig());
	}

}