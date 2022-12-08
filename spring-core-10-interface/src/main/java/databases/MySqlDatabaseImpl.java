package databases;

import model.DBConnection;

public class MySqlDatabaseImpl implements DBConnection {

    @Override
    public void connect() {
        System.out.println("Mysql database çalıştırılıyor");
    }

    @Override
    public void disconnect() {
        System.out.println("Mysql database durduruldu");
    }
}
