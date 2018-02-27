package org.PA.SpringJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcApplicationConfiguration {

	private Environment env;

	@Bean
	public JdbcTemplate getJdbcTemplate() {

		JdbcTemplate template=new JdbcTemplate(getDataSouce());
		return template;
	}

	@Bean
	public DataSource getDataSouce() {
		DriverManagerDataSource datasource = new DriverManagerDataSource(env.getProperty("database.url"),
				env.getProperty("database.username"), env.getProperty("database.password"));
		
		return datasource;
	}
}
