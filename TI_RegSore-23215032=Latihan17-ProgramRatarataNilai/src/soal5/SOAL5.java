/*
 * Click nbfs://nb9host/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal5;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : PROGRAM RATA-RATA NILAI
 */
import java.util.Scanner;

public class SOAL5 {
    public static void main(String[] args) {
        // Membuat Banyaknya Data Mahasiswa
        System.out.println("Masukan Banyaknya Mahasiswa : 4");
        
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel untuk menyimpan total nilai
        double totalNilai = 0;
        int jumlahData = 4;

        // Loop untuk meminta input nilai sebanyak 4 kali
        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai; // Menambahkan nilai ke total
        }

        // Menghitung nilai rata-rata
        double rataRata = totalNilai / jumlahData;

        // Menampilkan hasil nilai rata-rata
        System.out.println("Maka, Rata-rata Nilainya adalah :  " + rataRata);
        System.out.println("Developed by : Ayip Nandang Maulana ");
        // Menutup scanner
        input.close();
    }
}
