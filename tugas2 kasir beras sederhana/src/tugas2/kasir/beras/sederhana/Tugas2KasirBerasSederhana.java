/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2.kasir.beras.sederhana;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Tugas2KasirBerasSederhana {

    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // deklarasi variabel
        double harga_beras, total_harga, harga_after, diskon, jumlah_beli, uang_bayar, uang_kembalian;
        harga_beras = 14000;
        diskon = 5.0 / 100;
          
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
        System.out.println("-- Program Kasir Warung Beras Sederhana --");

        // Input jumlah pembelian dari pengguna
        System.out.print("\nMasukkan jumlah beli (kg): ");
        jumlah_beli = scanner.nextDouble(); // Inisialisasi jumlah beli

        // Menghitung total harga
        total_harga = harga_beras * jumlah_beli;
        harga_after = total_harga - (total_harga * diskon) ;
        
        // Memformat total harga ke dalam format Rupiah 
        String formattedRupiah = rupiahFormat.format(total_harga);
        String formattedDiskon = rupiahFormat.format(harga_after);

        // Output hasil format
        System.out.println("Total harga: " + formattedRupiah);
        
        System.out.println("Mendapatkan diskon " + (diskon*100) + "% menjadi : " +formattedDiskon);
        
        // Input uang yang dibayar oleh pembeli
        System.out.print("\nMasukkan jumlah uang yang dibayarkan: ");
        uang_bayar = scanner.nextDouble();
        
        // Menghitung uang kembalian
        uang_kembalian = uang_bayar - harga_after;
        String formattedKembalian = rupiahFormat.format(uang_kembalian);
        
        // Output uang kembalian
        System.out.println("Uang kembalian: " + formattedKembalian + "\n--------------------------------------");
    }
}

