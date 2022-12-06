package models;


import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DBConnection {

    private String username;
    private String password;
    private List<String> list;

    private Map<String,String> maps;

    private Properties properties;

    public void connect(){
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

        System.out.println("List içindekiler : ");
        for (String element: list) {
            System.out.println("--" + element);
        }
        System.out.println("Map içindekiler : ");
        for (Map.Entry entry: maps.entrySet()) {
            System.out.println("--"+ entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Properties içindekiler : ");
        for (Map.Entry element: properties.entrySet()) {
            System.out.println("--"+ element.getKey() + " : " + element.getValue());
        }

        System.out.println("\nBağlantı sağlandı");
    }

    public void dicconnect(){
        System.out.println("\nBağlantı kesildi");
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public DBConnection(String username, String password, List<String> list, Map<String, String> maps, Properties properties) {
        this.username = username;
        this.password = password;
        this.list = list;
        this.maps = maps;
        this.properties = properties;
    }

    public DBConnection() {
    }



}
