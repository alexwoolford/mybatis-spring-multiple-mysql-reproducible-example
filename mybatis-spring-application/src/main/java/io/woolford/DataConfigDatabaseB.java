package io.woolford;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan("io.woolford.database.mapper")
public class DataConfigDatabaseB {

    @Value("${db.user.db.b}")
    private String dbUserB;

    @Value("${db.password.db.b}")
    private String dbPasswordB;

    @Value("${db.host.db.b}")
    private String dbHostB;

    @Value("${db.database.db.b}")
    private String dbDatabaseB;

    @Value("${db.port.db.b}")
    private String dbPortB;

    @Bean(name="dataSourceB")
    public DataSource dataSourceB() throws SQLException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.mysql.jdbc.Driver());
        dataSource.setUrl("jdbc:mysql://" + dbHostB + "/" + dbDatabaseB);
        dataSource.setUsername(dbUserB);
        dataSource.setPassword(dbPasswordB);
        return dataSource;
    }

    @Bean(name="sqlSessionFactoryB")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSourceB());
        return sessionFactory.getObject();
    }

}