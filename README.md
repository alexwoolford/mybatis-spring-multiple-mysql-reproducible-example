### ibatis/spring multiple MySQL reproducible example

Edit the following files to set MySQL properties:

* ibatis-spring-multiple-mysql-reproducible-example/migration-database-a/flyway.properties
* ibatis-spring-multiple-mysql-reproducible-example/migration-database-b/flyway.properties

Then run the migrations to setup the tables, i.e. from the `ibatis-spring-multiple-mysql-reproducible-example/migration-database-[a|b]/` folders, run:

    mvn clean compile flyway:migrate

Once the migrations have been run, set the credentials in `ibatis-spring-application/src/main/resources/application.properties`

Then build and run the app:

   cd ibatis-spring-application
   mvn clean package
   java -jar target/

