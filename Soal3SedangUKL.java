/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3sedangukl;

/**
 *
 * @author Sakinaa
 */
import java.util.Random;
import java.util.Scanner;
public class Soal3SedangUKL {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        Random random = new Random();
        String[] operators = {"+", "-", "*", "/"};
        boolean kuismatematika = true;
        while (kuismatematika) {
            
            String operator = operators[random.nextInt(operators.length)];

            int bilangan1 = random.nextInt(10) + 1; 
            int bilangan2 = random.nextInt(10) + 1; 
            double hasil = 0;
            
            System.out.print("Soal: " + bilangan1 + " " + operator + " " + bilangan2 + " = ");
            switch (operator) {
                case "+":
                    hasil = bilangan1 + bilangan2;
                    break;
                case "-":
                    hasil = bilangan1 - bilangan2;
                    break;
                case "*":
                    hasil = bilangan1 * bilangan2;
                    break;
                case "/":
                    hasil = bilangan1 / bilangan2;
                    break;
            }

            int pengguna= bilangan.nextInt();
            if (pengguna== hasil) {
                System.out.println("betul!");
            } else {
                System.out.println("salah, jawaban: " + hasil);
            }
            
            System.out.print("Apakah Anda ingin melanjutkan kuis? (iya/tidak): ");
            String jawaban = bilangan.next();
            if (jawaban.equals("tidak")) {
                kuismatematika = false;
                System.out.println("====TERIMA KASIH SUDAH MENCOBA KUIS====");
            }
        }

        bilangan.close();
    }

}
    

