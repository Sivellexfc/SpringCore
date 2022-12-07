package model;

import java.util.List;
import java.util.Properties;

public class Database {

    private String name;
    private String username;
    private String password;

    private List<Properties> propertiesList;

    public Database(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Database() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Properties> getPropertiesList() {
        return propertiesList;
    }

    public void setPropertiesList(List<Properties> propertiesList) {
        this.propertiesList = propertiesList;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", propertiesList=" + propertiesList +
                '}';
    }
}
