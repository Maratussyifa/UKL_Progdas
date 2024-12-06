/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1sulitukl2;

/**
 *
 * @author Sakinaa
 */
import java.util.Scanner;
public class Soal1SulitUKL2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] hariHadir = new int[jumlahSiswa];
        int totalHariHadir = 0;
        int hariKerja = 24; 

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
            totalHariHadir += hariHadir[i];
        }
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + hariKerja + " hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }
        double rataRata = (double) totalHariHadir / jumlahSiswa;
        System.out.printf("\nRata-rata kehadiran siswa: %.2f hari\n", rataRata);

        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        scanner.close();
    }
}
        
    

