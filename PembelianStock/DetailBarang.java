package PembelianStock;
// Inheritance: DetailBarang mewarisi Barang
public class DetailBarang extends Barang {
    static int jumlah;
    static int total;
    static int hargaBarang;
    // Enkapsulasi: metode untuk isi detail
    public static void isiDetail(int jml,int harga) {
        jumlah = jml;
        hargaBarang = harga;
        total = jumlah * hargaBarang;
    }

    // Enkapsulasi: gabungkan method dari parent + child
    public static void tampilDetail() {
        // Polimorfisme: method dari class induk dipakai oleh class anak
        tampilBarang(); 
        System.out.println("\t\t" + jumlah + "\t\t" +  "Rp."+hargaBarang + "\t\t" + "Rp."+total);
    }
}
