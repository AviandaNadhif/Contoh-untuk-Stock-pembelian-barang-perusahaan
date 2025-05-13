package PembelianStock;

public class Barang {
    // Enkapsulasi (pakai static + private/protected bisa lebih kuat)
    static String kodeBarang;
    static  String namaBarang;
    static int kodeke;



    // Enkapsulasi: metode untuk isi data
    public static void isiBarang(String kode, String nama) {
        kodeBarang = kode;
        namaBarang = nama;
 
    }
    public static void kodebarang(int jumlahkode) {
        kodeke = jumlahkode;
        
    }
    // Enkapsulasi: metode untuk tampilkan data
    public static void tampilBarang() {
        System.out.print(kodeke + "\t" + kodeBarang + "\t" + namaBarang);
    }
}

