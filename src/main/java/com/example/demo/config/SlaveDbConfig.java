package com.example.demo.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@EnableJpaRepositories(entityManagerFactoryRef = "slaveEntityManager", transactionManagerRef = "slaveTransactionManager", basePackages = "com.example.demo.slave.repository")
public class SlaveDbConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource slaveDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env.getProperty("spring.slave.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.slave.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.slave.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.slave.datasource.password"));

		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean slaveEntityManager() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		HashMap<String, Object> properties = new HashMap<>();

		localContainerEntityManagerFactoryBean.setDataSource(slaveDataSource());
		localContainerEntityManagerFactoryBean.setPackagesToScan(new String[] { "com.example.demo.slave.domain" });
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);

	//	properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.slave.hibernate.hbm2ddl.auto"));
		properties.put("hibernate.dialect", env.getProperty("spring.slave.dialect"));
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
		
		localContainerEntityManagerFactoryBean.setJpaPropertyMap(properties);

		return localContainerEntityManagerFactoryBean;
	}

	@Bean
	public PlatformTransactionManager slaveTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(slaveEntityManager().getObject());
		return transactionManager;
	}
}
