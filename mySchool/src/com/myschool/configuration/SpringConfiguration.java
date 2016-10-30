package com.myschool.configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import({RepositoryConfiguration.class})
@Configuration
@EnableTransactionManagement
public class SpringConfiguration {
	
//	@Bean
//	public UserDao getUserDao(){
//		return new UserDaoImpl();
//	}
//	
//	@Bean
//	public UserService getUserService(){
//		return new UserServiceImpl();
//	}
	
	@Bean
	public PropertyPlaceholderConfigurer getPropertyPlaceHolderConfigurer(){

		PropertyPlaceholderConfigurer propertyConfigurer = new PropertyPlaceholderConfigurer();
		propertyConfigurer.setLocation(new ClassPathResource("hibernate.properties"));
		propertyConfigurer.setIgnoreUnresolvablePlaceholders(true);
		return propertyConfigurer;
	}

}
