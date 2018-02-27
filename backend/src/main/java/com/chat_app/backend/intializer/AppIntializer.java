package com.chat_app.backend.intializer;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.chat_app.backend.AppConfig;
import com.chat_app.backend.AppWebSocketConfiguration;
import com.chat_app.backend.filter.CROSFilter;

public class AppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppConfig.class,AppWebSocketConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	
	 @Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		return new Filter[] {new CROSFilter()};
	}

}
