/**
 * 
 */
package in.ecom.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author kumasuch
 *
 */
@Configuration
@ComponentScan(basePackages = { "in.ecom.shoppingbackend.dto" })
@EnableTransactionManagement
public class HibernateConfig {

	private static final String DATABASE_CLASS = "com.mysql.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ecom";
	private static final String DATABASE_USERNAME = "root";
	private static final String DATABASE_PASSWORD = "root";
	private static final String DATABASE_DIALECT = "org.hibernate.dialect.MySQL5Dialect";

	@Bean
	public DataSource getDataSource() {

		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(DATABASE_CLASS);
		datasource.setUrl(DATABASE_URL);
		datasource.setUsername(DATABASE_USERNAME);
		datasource.setPassword(DATABASE_PASSWORD);

		return datasource;
	}

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);

		sessionBuilder.addProperties(getHIbernateProperties());

		sessionBuilder.scanPackages("in.ecom.shoppingbackend.dto");

		return sessionBuilder.buildSessionFactory();

	}

	// HIbernate Properties
	private Properties getHIbernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		//properties.put("hibernate.hbm2ddl.auto", "update");
		

		return properties;
	}

	// Transaction Management

	@Bean
	public HibernateTransactionManager getTransaction(SessionFactory factory) {

		HibernateTransactionManager txManager = new HibernateTransactionManager(factory);

		return txManager;

	}

}
