package org.techhub.config;

// 1. Fixed the typos and replaced javax with jakarta
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// 2. Initialise the Spring context
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebMvcConfig.class);
		
		// 3. Register the DispatcherServlet
		DispatcherServlet ds = new DispatcherServlet(context);
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", ds);
		
		// 4. Configure startup behavior
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}


