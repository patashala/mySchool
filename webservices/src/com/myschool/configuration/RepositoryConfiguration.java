package com.myschool.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;


@Configuration
public class RepositoryConfiguration {
	
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
    @Value("${jdbc.password}")
    private String password;
    
    @Value("${hibernate.dialect}")         
    private String hibernateDialect;
    @Value("${hibernate.show_sql}")     
    private String hibernateShowSql;
    @Value("${hibernate.hbm2ddl.auto}") 
    private String hibernateHbm2ddlAuto;
    
    
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource datasource = new DriverManagerDataSource();
//		HikariDataSource datasource = new HikariDataSource();
		datasource.setDriverClassName(driverClassName);
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		return datasource;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.scanPackages("com.myschool.project");
	    sessionBuilder.addProperties(getHibernateProperties());
	    
	    return sessionBuilder.buildSessionFactory();
	}
	
	@Bean
	public Properties getHibernateProperties(){
		
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", hibernateDialect);
        properties.put("hibernate.show_sql", hibernateShowSql);
        properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
        
        return properties;
		
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transcationManager(SessionFactory sessionFactory){
		
		HibernateTransactionManager transcationManager = new HibernateTransactionManager(sessionFactory);
		return transcationManager;
		
	}
	
}
