class CatatanKeuangan {
    private Pemasukan[] dataPemasukan;
    private Pengeluaran[] dataPengeluaran;
    private Saldo saldo;

    public CatatanKeuangan() {
        this.dataPemasukan = new Pemasukan[0];
        this.dataPengeluaran = new Pengeluaran[0];
        this.saldo = new Saldo(0);
    }

    public void tambahPemasukan(Pemasukan pemasukan) {
        // Logika untuk menambah pemasukan ke array dataPemasukan
    }

    public void tambahPengeluaran(Pengeluaran pengeluaran) {
        // Logika untuk menambah pengeluaran ke array dataPengeluaran
    }

    public int getSaldo() {
        return saldo.getJumlah();
    }
}
