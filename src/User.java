public class User {
    String username;
    String password;
    CatatanKeuangan catatanKeuangan;

    User(String username, String password) {
        this.username = username;
        this.password = password;
        this.catatanKeuangan = new CatatanKeuangan();
    }
}
