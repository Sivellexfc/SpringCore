package Entity;

public class DBConnection {

    private String url;
    private String name;
    private String password;

    public DBConnection(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
    }

    public void connectDB(){
        System.out.println("URL :" + this.url);
        System.out.println("Name : "+ this.name);
        System.out.println("Password : "+ this.password);
        System.out.println("Veri tabanı bağlantısı sağlandı");
    }

    public void disconnectDB(){
        System.out.println("Name : " + this.name);
        System.out.println("Veri tabanı bağlantısı kesildi");
    }

    public DBConnection() {
    }

    public DBConnection(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
