# LAPORAN PRAKTIKUM
# PEMROGAMAN BERORIENTASI OBJEK
---
## MODUL : 04
## COLLECTION FRAMEWORK & OBJECT HANDLING
---
## NAMA		: VALDA ANABELA
## NIM			: L0325035

---

## 1. Class AsetIT.java (Class Model/Data)
### Class ini dipakai sebagai cetak biru (blueprint) untuk objek aset IT.
<img width="1180" height="473" alt="Cuplikan layar 2026-09-24 143918" src="https://github.com/user-attachments/assets/7fbf5dbf-620c-45c5-894d-d459646ef0be" />

####  a. Atribut (idAset, namaPerangkat, lokasi, statusKondisi): Menyimpan informasi/data spesifik milik setiap perangkat aset IT.
####  b. Constructor (AsetIT(...)): Method khusus yang dipanggil saat pembuatan objek baru (new) untuk langsung mengisi atribut-atributnya.
####  c. Method tampilkanInfoAset(): Berfungsi mencetak/menampilkan baris informasi aset tersebut ke layar konsol.
####  Di dalam kelas ini, terdapat empat atribut utama bertipe data String, yaitu idAset, namaPerangkat, lokasi, dan statusKondisi. Untuk mempermudah inisialisasi, dibuat sebuah konstruktor berparameter yang memanfaatkan kata kunci this untuk memasukkan nilai masukan secara langsung ke dalam masing-masing atribut objek. Selain itu, kelas ini juga dilengkapi dengan metode tampilkanInfoAset() yang bertugas mencetak seluruh isi atribut aset ke layar konsol secara rapi dan dipisahkan oleh karakter strip.

---

## 2. Class ManajemenAset.java (Class Pengelola Data)
### Class ini menangani logika penyimpanan dan manipulasi data aset.
<img width="937" height="580" alt="Cuplikan layar 2026-09-24 143943" src="https://github.com/user-attachments/assets/ec337e84-b088-40d6-b413-72aea7889569" />
<img width="926" height="292" alt="Cuplikan layar 2026-09-24 143957" src="https://github.com/user-attachments/assets/754f1fe5-dcd7-48d0-8f88-ef4c87e26e06" />

####  a. Collection List<AsetIT> daftarAset = new ArrayList<>();: Menggunakan ArrayList agar kapasitas array bisa bertambah/berkurang secara dinamis (fleksibel dibanding array biasa).
####  b. Method tambahAset(...): Menggunakan fungsi .add() untuk memasukkan objek AsetIT baru ke dalam daftar daftarAset.
####  c. Method tampilkanSemuaAset(): Menggunakan For-Each Loop (for (AsetIT a : daftarAset)) untuk menelusuri setiap objek di dalam list satu per satu lalu memanggil method tampilkanInfoAset().
####  d. Method hapusAset(String idAset): Menggunakan Iterator untuk menelusuri isi list secara aman tanpa menyebabkan error ConcurrentModificationException.
####  e. it.hasNext() mengecek apakah masih ada elemen berikutnya.
####  f. it.next() mengambil objek aset saat ini.
####  j. Jika idAset cocok dengan target, method it.remove() dipanggil untuk menghapus objek tersebut dari list.
####  h. Jika ID tidak ditemukan hingga loop selesai, sistem akan mencetak pesan peringatan.
####  kelas ini mendeklarasikan variabel daftarAset berupa ArrayList yang secara khusus digunakan untuk menampung objek-objek AsetIT. Untuk memanipulasi data di dalamnya, tersedia metode tambahAset() yang memanfaatkan fungsi .add() untuk memasukkan objek baru ke dalam daftar. Metode tampilkanSemuaAset() memanfaatkan perulangan For-Each untuk melintasi setiap elemen di dalam daftar dan memanggil metode pencetakan informasi dari masing-masing objek AsetIT.
####  Selanjutnya, untuk proses penghapusan data, disediakan metode hapusAset() yang menerima masukan ID aset. Metode ini membentuk objek Iterator dari daftarAset serta menyiapkan sebuah variabel penanda bernilai boolean. Melalui perulangan while, program memeriksa setiap elemen secara berurutan; apabila ID aset pada objek saat ini cocok dengan ID yang dicari, objek tersebut dihapus menggunakan panggilan it.remove() secara aman untuk mencegah keliruan modifikasi bersama (concurrent modification). Setelah data ditemukan dan dihapus, perulangan langsung dihentikan, dan apabila hingga akhir iterasi data tidak ditemukan, sistem akan menampilkan pesan peringatan ke layar konsol.

---

## 3. Class MainAset.java (Class Eksekusi Utama)
### Class yang berisi method main untuk menjalankan skenario uji coba.
<img width="795" height="502" alt="Cuplikan layar 2026-09-24 144011" src="https://github.com/user-attachments/assets/7bb636dd-d073-4d29-9114-8a901e458798" />

####  a. Instansiasi: Membuat objek pengelola ManajemenAset.
####  b. Tambah Data: Mengisi minimal 4 data aset IT awal (Server, Router, Switch, PC).
####  c. Tampil Awal: Menampilkan seluruh isi daftar aset awal ke konsol.
####  d. Hapus Data: Memanggil hapusAset("A03") untuk menghapus data Switch yang rusak.
####  e. Tampil Akhir: Menampilkan kembali data aset untuk memastikan bahwa data A03 sudah berhasil dihapus dari memori.
####  Kelas ini memuat metode main() sebagai titik masuk utama eksekusi program. Di dalam metode ini, sebuah objek pengelola bernama manajemen dibuat dari kelas ManajemenAset. Selanjutnya, program mendaftarkan empat data awal aset IT—yaitu Server, Router, Switch, dan PC—langsung ke dalam sistem melalui pemanggilan metode tambahAset(). Program kemudian menampilkan seluruh daftar aset awal ke konsol, lalu menguji fungsi penghapusan dengan memanggil hapusAset("A03") untuk menghapus data Switch. Rangkaian eksekusi diakhiri dengan menampilkan kembali seluruh data aset yang tersisa ke layar konsol guna membuktikan bahwa data dengan ID A03 telah berhasil dihapus.

---

## 4. Hasil Output
### Gambar berikut merupakan hasil output ketika class `MainAset.java` dijalankan.
<img width="577" height="253" alt="Cuplikan layar 2026-09-24 142420" src="https://github.com/user-attachments/assets/bd050a14-92ac-4dbc-be8d-61f3ebfbc46d" />

####  Saat kelas MainAset dijalankan, program pertama-tama mengeksekusi metode tambahAset() untuk menginputkan empat data aset IT ke dalam memori. Setelah itu, metode tampilkanSemuaAset() dipanggil untuk mencetak seluruh data yang baru dimasukkan. Pada bagian Data Aset IT (Awal), konsol menampilkan secara lengkap empat baris data aset, yaitu Server (A01), Router (A02), Switch (A03), dan PC (A04) beserta lokasi dan status kondisinya masing-masing.
####  Selanjutnya, program menjalankan operasi penghapusan dengan memanggil hapusAset("A03"). Metode ini mengiterasi isi daftar aset menggunakan objek Iterator hingga menemukan objek dengan ID A03, lalu menghapusnya secara aman dari memori. Ketika metode tampilkanSemuaAset() dipanggil kembali untuk mencetak bagian Data Aset IT (Setelah Penghapusan A03), konsol hanya menampilkan tiga baris data aset saja, yaitu A01, A02, dan A04. Hilangnya data aset A03 (Switch) dari tampilan konsol membuktikan bahwa operasi Delete berbasis ID dan iterasi collection menggunakan Iterator telah berhasil dilakukan sesuai spesifikasi tugas.
