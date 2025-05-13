package TugasPTSRevisi;

import java.util.Scanner;

public class MainPengeluaran {
    Scanner sc = new Scanner(System.in);
    public void pengeluaranperusahaan() {


        int duitperusahaan;
        int jumlahData;
        System.out.println("\n========== PT SUKAMUNDUR ==========");
        System.out.println("===== Pembelian stock barang ======");
        System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.print("Masukkan duit perusahaan: Rp.");
        duitperusahaan = sc.nextInt();
        System.out.print("Masukkan nama petugas yang membeli barang: ");
        String pengurus = sc.next();
        System.out.print("Masukkan tanggal (dd/mm/yyyy): ");
        String tanggal = sc.next();

        System.out.print("Masukkan jumlah data: ");
        jumlahData = sc.nextInt();
        System.out.print("----------------------------------------------------------------\n");
        // Enkapsulasi: data disimpan dalam array
        String[] kode = {"M1",  "M2", "C1", "P1", "V1"};
        String[] nama = {"Mouse",  "Monitor", "CPU", "Printer", "VGA"};
        int[] harga = {100000, 1000000, 1500000,2000000, 3000000 };
        int[] jumlah = new int[jumlahData];
        int[] total = new int[jumlahData];
        String[] kodeInput = new String[jumlahData];
        
        int totalBayar = 0;
        // Nested for loop untuk input data
        // Array untuk menyimpan data input
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Kode Barang(M1,M2,C1,P1,V1): ");
            kodeInput[i] = sc.next();
            if (kodeInput[i].equalsIgnoreCase("M1") || kodeInput[i].equalsIgnoreCase("M2") || kodeInput[i].equalsIgnoreCase("C1") || kodeInput[i].equalsIgnoreCase("P1") || kodeInput[i].equalsIgnoreCase("V1")) {
            } else {
                System.out.println("Kode barang tidak valid, silakan masukkan kode yang benar.");
                i--; // Mengurangi i agar bisa memasukkan ulang data
                continue; // Melanjutkan ke iterasi berikutnya
            }
            System.out.print("Jumlah: ");
            jumlah[i] = sc.nextInt();
            System.out.print("----------------------------------------------------------------\n");
            int hargaawal = 0 ;
             // Cek harga dari kode
             for (int j = 0; j < kode.length; j++) {
                 if (kodeInput[i].equalsIgnoreCase(kode[j])) {
                     hargaawal = harga[j];
                     
                     break;
                 }
                }
                
                total[i] = hargaawal * jumlah[i];
                totalBayar += total[i];
              
            }
  
        System.out.println("\n========== PT SUKAMUNDUR ==========");
        System.out.println("===== Pembelian stock barang ======");
        System.out.println("\nPetugas: " + pengurus + "\t\tTanggal: " + tanggal);
        System.out.println("Jumlah Data: " + jumlahData + "\t\tDuit Perusahaan: Rp. " + duitperusahaan);
        System.out.println("\n=======================================================================================");
        System.out.println("No\tKode\tNama\t\tJumlah\t\tHarga\t\tTotal");
        System.out.println("=======================================================================================");

        

        // for loop & Polimorfisme: pakai method yang diwarisi
        for (int i = 0; i < jumlahData; i++) {
            String namaawal = "";
            int hargaawal = 0;
            String kodeawal = "";
            for (int j = 0; j < kode.length; j++) {
                if (kodeInput[i].equalsIgnoreCase(kode[j])) {
                    hargaawal = harga[j];
                    namaawal = nama[j];
                    kodeawal = kode[j];
                    total[i] = hargaawal * jumlah[i];
                    break;
                }
               }
            DetailBarang.kodebarang(i + 1); // Enkapsulasi: isi kode barang
            DetailBarang.isiBarang(kodeawal, namaawal); // Polimorfisme via inheritance
            DetailBarang.isiDetail(jumlah[i], hargaawal); // Enkapsulasi: isi detail barang
            DetailBarang.tampilDetail(); // Polimorfisme: tampilkan detail barang
        }

        System.out.println("=======================================================================================");
        System.out.println("Total Belanja: Rp. " + totalBayar);
        System.out.println("Duit Perusahaan: Rp. " + duitperusahaan);
        // If dan nested if
        if (duitperusahaan < totalBayar) {
            System.out.println("Duit perusahaan tidak cukup untuk membayar pengeluaran.");
        } else {
            System.out.println("Sisa Duit Perusahaan: Rp. " + (duitperusahaan - totalBayar));
            if (totalBayar > 3000000) {
                System.out.println("Bonus: Mouse + Keyboard");
            } else if (totalBayar > 1500000) {
                if (jumlahData > 3) {
                    System.out.println("Bonus: Keyboard");
                } else {
                    System.out.println("Bonus: Mouse");
                }
            } else {
                System.out.println("Bonus: Tidak ada bonus");
            }
    
    
        }
      

    }
}
