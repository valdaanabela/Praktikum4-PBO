package praktikum4.tugas;

public class AsetIT {
    
    // Atribut 
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;
    
    
    // Constructor dengan parameter 
    public AsetIT(String idAset, String namaPerangkat, String lokasi, String statusKondisi){
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
    }
    
    // Method 
    public void tampilkanInfoAset(){
        System.out.println("ID: " + idAset + " | Perangkat: " + namaPerangkat + " | Lokasi: " + lokasi + " | Kondisi: " + statusKondisi);
    }
}

//L0325035_ValdaAnabela
