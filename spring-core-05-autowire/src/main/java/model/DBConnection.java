package model;

import model.Properties;
import org.springframework.beans.factory.annotation.Autowired;

public class DBConnection {

    private Database database;
    private Properties properties;

    public void connectDB(){
        System.out.println("Database name : " + this.database.getName());
        System.out.println("Database username : " + this.database.getUsername());
        System.out.println("Database password : " + this.database.getPassword());

        System.out.println("Properties : \n" + "property 1 : " + properties.getProperty1() + "\n"
                                             + "property 2 : " + properties.getProperty2());
        System.out.println("Veri tabanı bağlantısı sağlandı");
    }

    public void disconnectDB(){
        System.out.println("Veri tabanı bağlantısı kesildi");
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public DBConnection(Database database, Properties properties) {
        this.database = database;
        this.properties = properties;
    }
    public DBConnection() {
    }
}
