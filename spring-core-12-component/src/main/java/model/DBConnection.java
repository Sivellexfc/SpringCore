package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    @Autowired
    private Database database;

    public DBConnection() {
    }

    public DBConnection(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "database=" + database +
                '}';
    }



}
