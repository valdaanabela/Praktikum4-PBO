package praktikum4.tugas;

public class MainAset {
    public static void main(String[] args) {
        // a. Instansiasi objek dari class ManajemenAset
        ManajemenAset manajemen = new ManajemenAset();

        // i. Tambahkan minimal 4 data aset IT
        manajemen.tambahAset(new AsetIT("A01", "Server", "Data Center", "Baik"));
        manajemen.tambahAset(new AsetIT("A02", "Router", "Ruang Network", "Baik"));
        manajemen.tambahAset(new AsetIT("A03", "Switch", "Lab Komputer", "Rusak"));
        manajemen.tambahAset(new AsetIT("A04", "PC", "Ruang Staf", "Baik"));

        // ii. Tampilkan semua aset
        System.out.println("--- Data Aset IT (Awal) ---");
        manajemen.tampilkanSemuaAset();

        // iii. Hapus salah satu aset menggunakan ID yang valid
        manajemen.hapusAset("A03");

        // iv. Tampilkan kembali semua aset
        System.out.println("\n--- Data Aset IT (Setelah Penghapusan) ---");
        manajemen.tampilkanSemuaAset();
    } 
}

//L0325035_ValdaAnabela


