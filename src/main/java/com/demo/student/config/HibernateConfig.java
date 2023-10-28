package com.demo.student.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("com.demo.student");
		factoryBean.setHibernateProperties(hibernateProperties());
		return factoryBean;
	}
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/spring-practice");
		source.setUsername("root");
		source.setPassword("Vinod@6891");
		return source;
		
	}
	
	
	private Properties hibernateProperties() {
		
		Properties prop = new Properties();
		prop.setProperty(Environment.HBM2DDL_AUTO, "update");
		prop.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		prop.setProperty(Environment.SHOW_SQL, "true");
		prop.setProperty(Environment.FORMAT_SQL, "true");
		
		return prop;
	}

}
