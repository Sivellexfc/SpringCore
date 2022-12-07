package model;

public class DBConnection {

    private Database database;

    public void connectDB(){
        System.out.println("Database name : " + this.database.getName());
        System.out.println("Database username : " + this.database.getUsername());
        System.out.println("Database password : " + this.database.getPassword());
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
}
