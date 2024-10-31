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
public class Tugas4 {

    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka berdasarkan bulan pada kalender (1-12): ");
        nilai = scan.nextInt();

        if (nilai == 1) {
            System.out.println("Bulan pertama adalah Januari");
        } else if (nilai == 2) {
            System.out.println("Bulan kedua adalah Februari");
        } else if (nilai == 3) {
            System.out.println("Bulan ketiga adalah Maret");
        } else if (nilai == 4) {
            System.out.println("Bulan keempat adalah April");
        } else if (nilai == 5) {
            System.out.println("Bulan kelima adalah Mei");
        } else if (nilai == 6) {
            System.out.println("Bulan keenam adalah Juni");
        } else if (nilai == 7) {
            System.out.println("Bulan ketujuh adalah Juli");
        } else if (nilai == 8) {
            System.out.println("Bulan kedelapan adalah Agustus");
        } else if (nilai == 9) {
            System.out.println("Bulan kesembilan adalah September");
        } else if (nilai == 10) {
            System.out.println("Bulan kesepuluh adalah Oktober");
        } else if (nilai == 11) {
            System.out.println("Bulan kesebelas adalah November");
        } else if (nilai == 12) {
            System.out.println("Bulan keduabelas adalah Desember");
        } else 

            System.out.println("Tidak ada nama bulan untuk angka tersebut");
        }
    }

