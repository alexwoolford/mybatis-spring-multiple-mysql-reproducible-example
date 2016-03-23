### MyBatis/Spring multiple MySQL databases reproducible example

Edit the following files to set MySQL properties:

* mybatis-spring-multiple-mysql-reproducible-example/migration-database-a/flyway.properties
* mybatis-spring-multiple-mysql-reproducible-example/migration-database-b/flyway.properties

Then run the migrations to setup the tables, i.e. from the `mybatis-spring-multiple-mysql-reproducible-example/migration-database-[a|b]/` folders, run:

    mvn clean compile flyway:migrate

Once the migrations have been run, set the credentials in `mybatis-spring-application/src/main/resources/application.properties`

Then build and run the app:

    cd mybatis-spring-application
    mvn clean package
    java -jar target/ibatis-spring-application-1.0-SNAPSHOT.jar

