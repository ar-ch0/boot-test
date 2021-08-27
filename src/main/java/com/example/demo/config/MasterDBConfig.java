package com.example.demo.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "masterEntityManager", transactionManagerRef = "masterTransactionManager", basePackages = "com.example.demo.repository")
public class MasterDBConfig {

	@Autowired
	private Environment env;

	@Primary
	@Bean
	public DataSource masterDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.master.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.master.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.master.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.master.datasource.password"));
		return dataSource;
	}

	@Primary
	@Bean
	public LocalContainerEntityManagerFactoryBean masterEntityManager() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		HashMap<String, Object> properties = new HashMap<>();
		localContainerEntityManagerFactoryBean.setDataSource(masterDataSource());
		localContainerEntityManagerFactoryBean.setPackagesToScan(new String[] { "com.example.demo.domain" });
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
		
		//properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.master.hibernate.hbm2ddl.auto"));
		properties.put("hibernate.dialect", env.getProperty("spring.master.dialect"));
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
		
		localContainerEntityManagerFactoryBean.setJpaPropertyMap(properties);
		
		return localContainerEntityManagerFactoryBean;
	}

	@Primary
	@Bean
	public PlatformTransactionManager masterTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(masterEntityManager().getObject());
		return transactionManager;
	}
}
