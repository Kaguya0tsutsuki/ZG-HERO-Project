import groovy.sql.Sql

import java.sql.Connection

class ConnectionFactory {

    Connection connection

    void connect(){

    }

    public Connection getConnection(String bdType, user, password, url){
        switch (bdType){
            case "postgre":
                this.connection = this.getPostgreConnection(user, password, url)
                return this.connection
                break;

            case "orecle":
                break;
        }
    }

    private Connection getPostgreConnection(def user, password, url) {

        def db = [url:url, user:user, password:password, driver: 'org.postgresql.Driver']
        def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

        Connection postgreConnection = sql.getConnection()
    }
}