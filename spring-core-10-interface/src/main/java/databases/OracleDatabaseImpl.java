package databases;

import model.DBConnection;

import java.sql.SQLOutput;

public class OracleDatabaseImpl implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Oracle database çalışıyor");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracle database durduruldu");
    }
}
