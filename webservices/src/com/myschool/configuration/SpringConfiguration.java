package com.myschool.configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Import({RepositoryConfiguration.class})
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="com.myschool.project")
public class SpringConfiguration {
	
/*	@Bean
	public CountryService getCountryService(){
		return new CountryServicesImpl();
	}
	
	@Bean
	public CountryDao getCountryDao(){
		return new CountryDaoImpl();
	}*/
	
	
	@Bean
	public PropertyPlaceholderConfigurer getPropertyPlaceHolderConfigurer(){

		PropertyPlaceholderConfigurer propertyConfigurer = new PropertyPlaceholderConfigurer();
		propertyConfigurer.setLocation(new ClassPathResource("hibernate.properties"));
		propertyConfigurer.setIgnoreUnresolvablePlaceholders(true);
		return propertyConfigurer;
	}

}
