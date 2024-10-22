class SistemPengguna {
    User[] users;
    User loggedInUser;

    SistemPengguna(int kapasitas) {
        this.users = new User[kapasitas];
        this.loggedInUser = null;
    }
}
