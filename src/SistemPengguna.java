class SistemPengguna {
    private ArrayList<User> users;
    private User loggedInUser;

    public SistemPengguna() {
        this.users = new ArrayList<>();
        this.loggedInUser = null;
    }

    public void tambahUser(User user) {
        users.add(user);
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
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
