package praktikum4.tugas;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ManajemenAset {
    // Deklarasi collection dinamik (Menyimpan daftar objek AsetIT)
    List<AsetIT> daftarAset = new ArrayList<>();
    
    // Method (menambahkan objek AsetIT baru ke dalam list)
    public void tambahAset(AsetIT asetBaru) {
        daftarAset.add(asetBaru);
    }
    
    // Method (Menampilkan seluruh aset)
    public void tampilkanSemuaAset(){
        for (AsetIT a : daftarAset) {
            a.tampilkanInfoAset();
        }
    }
    
    // Method (Menghapus aset menggunakan iterator)
    public void hapusAset(String idAset) {
        // Membuat objek Iterator (menelusuri elemen dengan aman)
        Iterator<AsetIT> it = daftarAset.iterator();
        boolean ditemukan = false;
        
        // Melakukan perulangan selama masih ada elemen berikutnya
        while (it.hasNext()){
            AsetIT asetSekarang = it.next();
            
            // Memeriksa apakah idAset cocok dengan parameter
            if (asetSekarang.idAset.equals(idAset)){
                it.remove();
                ditemukan = true;
                break;
            }
        }
        
        // Tampilkan pesan peringatan jika ID tidak ditemukan di dalam list
        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID '" + idAset + "' tidak ditemukan!");
        }
    }  
}

//L0325035_ValdaAnabela



