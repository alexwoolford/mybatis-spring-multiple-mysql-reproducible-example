package io.woolford;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan("io.woolford.database.mapper")
public class DataConfigDatabaseA {

    @Value("${db.user.db.a}")
    private String dbUserA;

    @Value("${db.password.db.a}")
    private String dbPasswordA;

    @Value("${db.host.db.a}")
    private String dbHostA;

    @Value("${db.database.db.a}")
    private String dbDatabaseA;

    @Value("${db.port.db.a}")
    private String dbPortA;

    @Bean(name="dataSourceA")
    @Primary
    public DataSource dataSourceA() throws SQLException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.mysql.jdbc.Driver());
        dataSource.setUrl("jdbc:mysql://" + dbHostA + ":" + dbPortA + "/" + dbDatabaseA);
        dataSource.setUsername(dbUserA);
        dataSource.setPassword(dbPasswordA);
        return dataSource;
    }

    @Bean(name="sqlSessionFactoryA")
    @Primary
    public SqlSessionFactory sqlSessionFactoryA() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSourceA());
        return sessionFactory.getObject();
    }

    @Bean(name="transactionManagerA")
    public PlatformTransactionManager getTransactionManagerA() throws SQLException {
    	return new DataSourceTransactionManager(dataSourceA());
    }
}