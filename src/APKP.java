public class APKP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemPengguna sistem = new SistemPengguna();

        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Buat Pengguna");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = scanner.nextLine();
                    sistem.tambahUser(new User(username, password));
                    System.out.println("Pengguna berhasil dibuat!");
                }
                case 2 -> {
                    System.out.print("Masukkan Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = scanner.nextLine();

                    if (sistem.login(username, password)) {
                        System.out.println("Login berhasil!");
                        User currentUser = sistem.getLoggedInUser();
                        CatatanKeuangan catatan = currentUser.getCatatanKeuangan();

                        while (true) {
                            System.out.println("\n=== Menu Keuangan ===");
                            System.out.println("1. Tambah Pemasukan");
                            System.out.println("2. Tambah Pengeluaran");
                            System.out.println("3. Lihat Saldo");
                            System.out.println("4. Lihat Semua Pemasukan");
                            System.out.println("5. Lihat Semua Pengeluaran");
                            System.out.println("6. Logout");
                            System.out.print("Pilihan Anda: ");
                            int pilihanKeuangan = scanner.nextInt();
                            scanner.nextLine();

                            switch (pilihanKeuangan) {
                                case 1 -> {
                                    System.out.print("Deskripsi Pemasukan: ");
                                    String deskripsi = scanner.nextLine();
                                    System.out.print("Jumlah Pemasukan: ");
                                    int jumlah = scanner.nextInt();
                                    catatan.tambahPemasukan(new Pemasukan(deskripsi, jumlah));
                                }
                                case 2 -> {
                                    System.out.print("Deskripsi Pengeluaran: ");
                                    String deskripsi = scanner.nextLine();
                                    System.out.print("Jumlah Pengeluaran: ");
                                    int jumlah = scanner.nextInt();
                                    catatan.tambahPengeluaran(new Pengeluaran(deskripsi, jumlah));
                                }
                                case 3 -> {
                                    System.out.println("\n=== Saldo Terkini ===");
                                    System.out.println("Saldo: Rp" + catatan.getSaldo());
                                }                                
                                case 4 -> catatan.lihatSemuaPemasukan();
                                case 5 -> catatan.lihatSemuaPengeluaran();
                                case 6 -> {
                                    sistem.logout();
                                    System.out.println("Anda telah logout.");
                                    break;
                                }
                                default -> System.out.println("Pilihan tidak valid.");
                            }
                            if (pilihanKeuangan == 6) break;
                        }
                    } else {
                        System.out.println("Login gagal. Username atau password salah.");
                    }
                }
                case 3 -> {
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

