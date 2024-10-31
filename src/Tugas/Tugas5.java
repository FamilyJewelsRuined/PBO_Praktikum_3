/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugas5 {

    public static void main(String[] args) {
        int jawaban, sisi, luas, keliling;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Menghitung luas persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.println("Pilihan:");
        jawaban = scan.nextInt();

        if (jawaban == 1) {
            System.out.print("Masukkan panjang sisi persegi: ");
            sisi = scan.nextInt();
            luas = sisi * sisi;
            System.out.println("Luas persegi adalah: " + luas + " cm");
        } else if (jawaban == 2) {
            System.out.print("Masukkan panjang sisi persegi: ");
            sisi = scan.nextInt();
            keliling = 4 * sisi;
            System.out.println();

        }

    }
}
