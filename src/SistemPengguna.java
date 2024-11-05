class SistemPengguna {
    private User[] users;
    private User loggedInUser;

    public SistemPengguna(int kapasitas) {
        this.users = new User[kapasitas];
        this.loggedInUser = null;
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(username) && user.checkPassword(password)) {
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        loggedInUser = null;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }
}
