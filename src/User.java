class User {
    private String username;
    private String password;
    private CatatanKeuangan catatanKeuangan;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.catatanKeuangan = new CatatanKeuangan();
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public CatatanKeuangan getCatatanKeuangan() {
        return catatanKeuangan;
    }
}
