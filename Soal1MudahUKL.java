/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal1mudahukl;

/**
 *
 * @author Sakinaa
 */
import java.util.Scanner;
public class Soal1MudahUKL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Apakah anda member? (ya/tidak):");
            String member = input.nextLine();

            System.out.print("Masukkan total belanja: Rp ");
            double totalBelanja = input.nextDouble();

            double diskon;
            if (member.equalsIgnoreCase("ya")) {
            if (totalBelanja > 200000) {
                diskon = 0.2 * totalBelanja;
            } else if (totalBelanja >= 100000) {
                diskon = 0.1 * totalBelanja;
            } else {  
                diskon = 0;
            }

            double totalBayar = totalBelanja - diskon;
            System.out.println("Total belanja: Rp " + totalBelanja);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total yang harus dibayar: Rp " + totalBayar);

            input.close();
        }
    }
}
}
