package kr.co.greenart.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class DBUtil {
	private static DataSource dataSource;
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		initDataSource();
		initSqlSessionFactory();
	}
	
	private static void initSqlSessionFactory() {
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		configuration.addMappers("kr.co.greenart.db");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
	}
	
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}

	private static void initDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/my_db");
		ds.setUsername("root");
		ds.setPassword("root");
		
		ds.setInitialSize(0);
		ds.setMaxTotal(8);
		ds.setMaxIdle(8);
		ds.setMinIdle(0);
		
		dataSource = ds;
	}
	
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}




