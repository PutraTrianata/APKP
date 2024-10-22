class CatatanKeuangan {
    Pemasukan[] dataPemasukan;
    Pengeluaran[] dataPengeluaran;
    Saldo saldo;

    CatatanKeuangan() {
        this.dataPemasukan = new Pemasukan[0];
        this.dataPengeluaran = new Pengeluaran[0];
        this.saldo = new Saldo(0);
    }
}
