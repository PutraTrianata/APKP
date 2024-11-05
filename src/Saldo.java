class Saldo {
    private int jumlah;

    public Saldo(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tambahSaldo(int jumlah) {
        this.jumlah += jumlah;
    }

    public void kurangiSaldo(int jumlah) {
        this.jumlah -= jumlah;
    }
}

