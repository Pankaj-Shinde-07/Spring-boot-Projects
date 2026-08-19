package in.pankaj.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration // This class contains instructions for creating Spring Beans.
@EnableJpaRepositories(
		basePackages = "in.pankaj.primary.repository", 
		entityManagerFactoryRef = "primaryEntityManagerFactory", 
		transactionManagerRef = "primaryTransactionManager")
//basePackages- These repositories belong to this configuration
//entityManagerFactoryRef - Which EntityManagerFactory should I inject?
//transactionManagerRef - Which TransactionManager should begin the transaction?

public class PrimaryDBConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.primary")
	public DataSource primaryDataSource() {
		return DataSourceBuilder
				.create()
				.type(com.zaxxer.hikari.HikariDataSource.class)
				.build();
	}

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean primaryEntityManagerFactory(
			EntityManagerFactoryBuilder builder,
			@Qualifier("primaryDataSource") DataSource dataSource) {

		return builder
				.dataSource(dataSource)
				.packages("in.pankaj.primary.entity")
				.persistenceUnit("primary")
				.build();
	}

	@Bean
	@Primary
	public PlatformTransactionManager primaryTransactionManager(
			@Qualifier("primaryEntityManagerFactory") EntityManagerFactory emf) {

		return new JpaTransactionManager(emf);
	}

}
