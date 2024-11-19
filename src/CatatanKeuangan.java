class CatatanKeuangan {
    private ArrayList<Pemasukan> dataPemasukan;
    private ArrayList<Pengeluaran> dataPengeluaran;
    private Saldo saldo;

    public CatatanKeuangan() {
        this.dataPemasukan = new ArrayList<>();
        this.dataPengeluaran = new ArrayList<>();
        this.saldo = new Saldo(0);
    }

    public void tambahPemasukan(Pemasukan pemasukan) {
        dataPemasukan.add(pemasukan);
        saldo.tambahSaldo(pemasukan.getJumlah());
        System.out.println("Pemasukan berhasil ditambahkan: " + pemasukan.getDeskripsi() + " - Rp" + pemasukan.getJumlah());
    }

    public void tambahPengeluaran(Pengeluaran pengeluaran) {
        dataPengeluaran.add(pengeluaran);
        saldo.kurangiSaldo(pengeluaran.getJumlah());
        System.out.println("Pengeluaran berhasil ditambahkan: " + pengeluaran.getDeskripsi() + " - Rp" + pengeluaran.getJumlah());
    }

    public int getSaldo() {
        return saldo.getJumlah();
    }

    public void lihatSemuaPemasukan() {
        System.out.println("\n=== Daftar Pemasukan ===");
        if (dataPemasukan.isEmpty()) {
            System.out.println("Belum ada pemasukan.");
        } else {
            for (Pemasukan pemasukan : dataPemasukan) {
                System.out.println(pemasukan.getDeskripsi() + " - Rp" + pemasukan.getJumlah());
            }
        }
    }

    public void lihatSemuaPengeluaran() {
        System.out.println("\n=== Daftar Pengeluaran ===");
        if (dataPengeluaran.isEmpty()) {
            System.out.println("Belum ada pengeluaran.");
        } else {
            for (Pengeluaran pengeluaran : dataPengeluaran) {
                System.out.println(pengeluaran.getDeskripsi() + " - Rp" + pengeluaran.getJumlah());
            }
        }
    }
}
